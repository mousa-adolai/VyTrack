package com.vytrack.tests;

import com.github.javafaker.Faker;
import com.vytrack.pages.CreateCarPage;
import com.vytrack.pages.VyTrackLogin;
import com.vytrack.utilities.BrowserUtil;
import com.vytrack.utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserStory2 extends TestBase {

    /*
 AC #1: only store/sales manager able to create car
 Given store/sales manager is on the homePage
 When user select “Vehicles” under Fleet module
 And user click “create car” button
 When user fill out general information
 And click “Save and Close” button
 Then verify “Entity saved” confirm message
     */

    VyTrackLogin manager = new VyTrackLogin();
    Faker faker = new Faker();
    CreateCarPage  createCarPage = new CreateCarPage();

    @Test
    public void createCar() throws InterruptedException {

        // Given store/sales manager is on the homePage
        manager.goTo();
       // manager.login("storemanager69","UserUser123");
        manager.loginAsStoreManager();
        BrowserUtil.waitFor(3);

        //When user select “Vehicles” under Fleet module
        //span[class='title title-level-1']
        WebElement fleetModule = driver.findElement(By.xpath("//span[@class='title title-level-1' and normalize-space(.)='Fleet'] "));
        //Actions actions = new Actions(driver);
        //actions.moveToElement(fleetModule).click();
        fleetModule.click();
        BrowserUtil.waitFor(3);

        WebElement vehicleBtn = driver.findElement(By.xpath("//span[@class='title title-level-2' and normalize-space(.)='Vehicles']"));
        vehicleBtn.click();
        BrowserUtil.waitFor(3);

        //And user click “create car” button
        //a[class='btn main-group btn-primary pull-right ']
        //a[@title='Create Car']
        // [@class='btn main-group btn-primary pull-right ']

        WebElement createCar = driver.findElement(By.xpath("//a[normalize-space(.)='Create Car']"));
        createCar.isDisplayed();
        createCar.click();
        BrowserUtil.waitFor(3);

       // WebElement licencePlate = driver.findElement(By.xpath("//input[starts-with(@id,'custom_entity_type_LicensePlate')]"));
        //licencePlate.sendKeys("Rahel");

        //When user fill out general information
        createCarPage.licensePlate.sendKeys(faker.name().fullName());
        createCarPage.tagsJuniorChechBox.click();
        createCarPage.driverBox.sendKeys(faker.name().fullName());
        createCarPage.locationBox.sendKeys(faker.address().state());
        createCarPage.chassisNumberBox.sendKeys(faker.numerify("#######"));
        createCarPage.modelYearBox.sendKeys(faker.numerify("####"));
        createCarPage.lastOdometerBox.sendKeys(faker.numerify("########"));
        createCarPage.immatriculationDateBox.click();
        createCarPage.todayButton.click();
        createCarPage.firstContractDateBox.click();
        createCarPage.todayButton.click();
        createCarPage.catalogValueBox.sendKeys(faker.numerify("####"));
        createCarPage.seatsNumberBox.sendKeys(faker.numerify("##"));
        createCarPage.doorsNumberBox.sendKeys(faker.numerify("##"));
        createCarPage.colorBox.sendKeys(faker.color().name());
        createCarPage.transmissionDropdown.click();
        createCarPage.transmissionDropdownManualOption.click();
        createCarPage.fuelTypeDropdown.click();
        createCarPage.fuelTypeDropdownHybridOption.click();
        //createCarPage.co2EmissionsBox.sendKeys(faker.name().name());
        createCarPage.horsepowerBox.sendKeys(faker.numerify("######"));
        createCarPage.horsepowerTaxationPowerBox.sendKeys(faker.numerify("####"));
        createCarPage.powerBox.sendKeys(faker.numerify("######"));
       // Thread.sleep(2000);
       // BrowserUtil.scrollToElement(createCarPage.saveAndCloseButton);
        //And click “Save and Close” button
        createCarPage.saveAndClose.click();



       // Then verify “Entity saved” confirm message
        //  // div[@class='flash-messages-holder']
        //  //div[@class='message']

       // String expectedTitle = "Entity saved";
       // WebElement title = driver.findElement(By.xpath("//div[@class='flash-messages-holder']"));
        //String actualTitle = driver.findElement(By.xpath("//div[@class='flash-messages-holder']")).getText();
        //Assertions.assertEquals(expectedTitle,actualTitle);
        Thread.sleep(3000);
       // //div[@class='flash-messages-holder']"




       WebElement text = driver.findElement(By.xpath("//div[@class='message']"));
       WebDriverWait wait = new WebDriverWait(driver, 10);
       wait.until(ExpectedConditions.visibilityOf(text));

       // WebElement entrySaveBtn = getDriver().findElement(By.xpath("//div[@class='message']"));
        String actualResult = text.getText();
        String expectedResult = "Entity saved";
        assertEquals(expectedResult,actualResult);
        System.out.println("Expected Result: = " + expectedResult);
        System.out.println("Actual Result: = " + actualResult);











    }
}
