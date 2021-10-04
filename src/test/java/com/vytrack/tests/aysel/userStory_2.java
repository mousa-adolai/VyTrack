package com.vytrack.tests.aysel;

import com.github.javafaker.Faker;
import com.vytrack.pages.CreateCarPage;
import com.vytrack.pages.VyTrackLogin;
import com.vytrack.utilities.ConfigReader;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.TestBase;
import com.vytrack.utilities.VyTrackUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class userStory_2 extends TestBase {
    VyTrackLogin lgn = new VyTrackLogin();
    CreateCarPage createCarPage = new CreateCarPage();
    Faker faker = new Faker();

    // 2. Story: As a user, I should be create vehicles/cars.
    //   AC #1: only store/sales manager able to create car
    @Test
    public void createCarTest() throws InterruptedException {
        lgn.goTo();
        // Given store/sales manager is on the homePage
        lgn.login(ConfigReader.read("username_salesmanager"), ConfigReader.read("password"));
        Thread.sleep(2000);
        // When user select “Vehicles” under Fleet module
        WebElement fleetModule = driver.findElement(By.xpath("//span[@class='title title-level-1' and normalize-space(.)='Fleet']"));
        Actions actions = new Actions(driver);
        Thread.sleep(2000);
        actions.moveToElement(fleetModule).perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class='title title-level-2' and normalize-space(.)='Vehicles']")).click();
        // And user click “create car” button
        Thread.sleep(5000);
        // WebElement createCarButton= driver.findElement(By.xpath("//a[normalize-space(.)='Create Car']"));
        WebElement createCarButton = driver.findElement(By.xpath("//a[@title='Create Car']"));
//     //a[@title='Create Car']
        System.out.println("createCarButton.isDisplayed() = " + createCarButton.isDisplayed());
        actions.moveToElement(createCarButton).doubleClick().perform();

        // When user fill out general information
        //driver.findElement(By.xpath("//input[starts-with(@id,'custom_entity_type_LicensePlate')]")).sendKeys(faker.name().firstName());

        //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", createCarPage.licensePlate);

//        actions.moveToElement(createCarPage.licensePlate);
//        actions.perform();

//        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0," + (createCarPage.licensePlate.getLocation().getY() - 100) + ")", new Object[]{""});

//        VyTrackUtil.scrollIntoView(createCarPage.licensePlate);

        createCarPage.licensePlate.sendKeys(faker.name().firstName());
        createCarPage.tagsJuniorChechBox.click();
        createCarPage.driverBox.sendKeys(faker.name().lastName());
        createCarPage.locationBox.sendKeys(faker.address().cityName());
        createCarPage.chassisNumberBox.sendKeys(faker.numerify("######"));
        createCarPage.modelYearBox.sendKeys(faker.numerify("####"));
        createCarPage.lastOdometerBox.sendKeys(faker.numerify("###########"));
        createCarPage.immatriculationDateBox.click();
        createCarPage.todayButton.click();
        createCarPage.firstContractDateBox.click();
        createCarPage.todayButton.click();
        createCarPage.catalogValueBox.sendKeys(faker.name().title());
        createCarPage.saveAndCloseButton.sendKeys(faker.numerify("##"));
        createCarPage.doorsNumberBox.sendKeys(faker.numerify("#"));
        createCarPage.seatsNumberBox.sendKeys(faker.numerify("##"));
        createCarPage.colorBox.sendKeys(faker.color().name());
        createCarPage.transmissionDropdown.click();
        createCarPage.transmissionDropdownManualOption.click();
        createCarPage.fuelTypeDropdown.click();
        createCarPage.fuelTypeDropdownHybridOption.click();
        createCarPage.co2EmissionsBox.sendKeys(faker.name().name());
        createCarPage.horsepowerBox.sendKeys(faker.numerify("######"));
        createCarPage.horsepowerTaxationPowerBox.sendKeys(faker.numerify("########"));
        createCarPage.powerBox.sendKeys(faker.numerify("##########"));
        // And click “Save and Close” button
        createCarPage.saveAndCloseButton.click();

        // Then verify “Entity saved” confirm message

        String expectedTitle = "Entity saved";

        //createCarButton.entitySavedMessage
        WebElement text= driver.findElement(By.xpath("//*[normalize-space(.)='Entity saved']"));
       // WebDriverWait wait = new WebDriverWait(driver, 60);
        //wait.until(ExpectedConditions.visibilityOf("");


        String actualTitle = driver.findElement(By.xpath("//*[normalize-space(.)='Entity saved']")).getText();
        Assertions.assertEquals(actualTitle, expectedTitle);


        // Then verify “Entity saved” confirm message

        /////////////////////////////////////////////////////////////////////////
    /*
    AC #2: drivers should not able to create a car
    Given driver is on the homePage
    When user select “Vehicles” under Fleet module
    Then “create car” button should not be visible
    */


    }

}
