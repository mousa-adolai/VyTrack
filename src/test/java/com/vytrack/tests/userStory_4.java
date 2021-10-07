package com.vytrack.tests;

import com.github.javafaker.Faker;
import com.vytrack.pages.*;
import com.vytrack.utilities.*;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
/** Bojan
4. Story: As a user, I should be create contact information.
 AC #1: users are able to create contacts.
 Given user is on the homePage
 When user select “Contacts” under Customers module And user click “Create Contact” button
 When user fill out general information
 And click “Save and Close” button
 Then verify “contact saved” confirm message
 */


public class userStory_4 extends TestBase {

    VyTrackLogin user = new VyTrackLogin();
    Faker faker = new Faker();
    CreateContactPage createContactPage = new CreateContactPage();

    @Test
    public void createContactTest()  {

        user.goTo();
        user.loginAsTruckDriver();
        BrowserUtil.waitFor(10);
        WebElement customers = driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(customers).perform();
        BrowserUtil.waitFor(10);
        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]/div/div/ul/li[4]/a/span")).click();
        BrowserUtil.waitFor(10);
        driver.findElement(By.xpath("//*[@title='Create Contact']")).click();
        BrowserUtil.waitFor(7);
        driver.findElement(By.xpath("//*[@class='select2-arrow']")).click();
        WebElement truckDriver = driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/ul[2]/li[4]"));
        actions.moveToElement(truckDriver).click(truckDriver).perform();
        createContactPage.namePrefix.sendKeys(faker.name().prefix());
        createContactPage.firstName.sendKeys(faker.name().firstName());
        createContactPage.middleName.sendKeys(faker.name().nameWithMiddle());
        createContactPage.lastName.sendKeys(faker.name().lastName());
        createContactPage.nameSuffix.sendKeys(faker.name().suffix());
        BrowserUtil.waitFor(3);
        createContactPage.primaryCheckBox.click();
        createContactPage.labelBox.sendKeys(faker.address().cityPrefix());
        createContactPage.namePrefBox.sendKeys(faker.name().prefix());
        createContactPage.nameFirstBox.sendKeys(faker.name().firstName());
        createContactPage.nameMiddleBox.sendKeys(faker.name().name());
        createContactPage.nameLastBox.sendKeys(faker.name().lastName());
        createContactPage.nameSuffixBox.sendKeys(faker.name().suffix());
        createContactPage.organizationBox.sendKeys(faker.name().title());
        driver.findElement(By.xpath("//*[@name='oro_contact_form[addresses][0][country]']/option[235]")).click();
        createContactPage.streetBox.sendKeys(faker.address().streetName());
        createContactPage.streetBox2.sendKeys(faker.address().streetAddressNumber());
        createContactPage.cityBox.sendKeys(faker.address().cityName());
        driver.findElement(By.xpath("//*[@name='oro_contact_form[addresses][0][region]']/option[17]")).click();
        createContactPage.postalCodeBox.sendKeys(faker.address().zipCode());
        createContactPage.billingCheckBox.click();
        createContactPage.shippingCheckBox.click();
        BrowserUtil.waitFor(3);
        actions.moveToElement(createContactPage.descriptionBody).click().sendKeys(faker.chuckNorris().fact()).perform();
        WebElement chooseUser = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[3]/form/div[2]/div/div[2]/div/div[1]/div[2]/div/fieldset/div[1]/div[8]/div[2]/div/div/div/a/span[1]"));
        actions.moveToElement(chooseUser).click().perform();
        WebElement truckDriver2 = driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/ul[2]/li[4]/div"));
        actions.moveToElement(truckDriver2).click().perform();
        WebElement chooseContact = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[3]/form/div[2]/div/div[2]/div/div[1]/div[2]/div/fieldset/div[1]/div[9]/div[2]/div/div/div/a/span[1]"));
        actions.moveToElement(chooseContact).click().perform();
        driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/ul[2]/li/div")).click();
        createContactPage.emailsBox.sendKeys(faker.internet().emailAddress());
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[3]/form/div[2]/div/div[2]/div/div[1]/div[2]/div/fieldset/div[1]/div[10]/div[2]/div[1]/div/div/div/div/div/label/input")).click();
        createContactPage.phonesBox.sendKeys(faker.phoneNumber().cellPhone());
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[3]/form/div[2]/div/div[2]/div/div[1]/div[2]/div/fieldset/div[1]/div[11]/div[2]/div[1]/div/div/div/div/div/label/input")).click();
        createContactPage.faxBox.sendKeys(faker.phoneNumber().phoneNumber());
        createContactPage.skypeBox.sendKeys(faker.internet().domainName());
        WebElement contactMethod = driver.findElement(By.xpath("//*[@name='oro_contact_form[method]']"));
        Select selectObj = new Select(contactMethod);
        selectObj.selectByIndex(2);
        createContactPage.twitterBox.sendKeys(faker.internet().domainWord());
        createContactPage.facebookBox.sendKeys(faker.internet().domainName());
        createContactPage.googleBox.sendKeys(faker.internet().emailAddress());
        createContactPage.linkedinBox.sendKeys(faker.internet().domainName());
        createContactPage.birthdayBox.sendKeys("Oct 1, 1965");
        actions.click(createContactPage.birthdayBox);
        BrowserUtil.waitFor(3);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        createContactPage.jobTitleBox.sendKeys(faker.job().title());
        WebElement gender = driver.findElement(By.xpath("//*[@name='oro_contact_form[gender]']"));
        Select selectObj1 = new Select(gender);
        selectObj1.selectByIndex(2);
        WebElement source = driver.findElement(By.xpath("//*[@name='oro_contact_form[source]']"));
        Select selectObj2 = new Select(source);
        selectObj2.selectByIndex(2);
        BrowserUtil.waitFor(2);

        /**
         (for each loop) for elements that have the same xpath
         check all the boxes, six of them
         */

        List<WebElement> groupCheckBox = driver.findElements(By.xpath("//*[@name='oro_contact_form[groups][]']"));
        for (WebElement eachCheckBox:groupCheckBox) {
            if (!eachCheckBox.isSelected()){
                eachCheckBox.click();
            }
        }

        driver.findElement(By.xpath("//*[@id=\"mCSB_2_container\"]/div/table/tbody/tr[1]/td[1]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"mCSB_2_container\"]/div/table/tbody/tr[2]/td[1]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"mCSB_2_container\"]/div/table/tbody/tr[3]/td[1]/input")).click();

        createContactPage.saveAndClose.click();

        BrowserUtil.waitFor(5);
        System.out.println("Contact saved message is displayed = " + createContactPage.savedMsg.isDisplayed());


    }

}
