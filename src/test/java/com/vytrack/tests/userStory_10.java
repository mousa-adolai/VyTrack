package com.vytrack.tests;

import com.github.javafaker.Faker;
import com.sun.xml.internal.ws.policy.AssertionValidationProcessor;
import com.vytrack.pages.CreateContactPage;
import com.vytrack.pages.VyTrackLogin;
import com.vytrack.pages.VyTrack_Homepage;
import com.vytrack.utilities.BrowserUtil;
import com.vytrack.utilities.ConfigReader;
import com.vytrack.utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


/** Karina
 Story: As a user, I should be access to Oro Documentation page.
 AC #1: user access Oro Documentation page
 Given user is on the homePage
 When user click question icon on the right top of the homepage
 Then verify user accessed to Oro Documentation page.
 */


public class userStory_10 extends TestBase {

   VyTrack_Homepage homepage= new VyTrack_Homepage();
   VyTrackLogin vyTrackLogin= new VyTrackLogin();

    @Test
    public void OroDocumentationAccess()  {

        vyTrackLogin.goTo();
        vyTrackLogin.login(ConfigReader.read("username_salesmanager"), ConfigReader.read("password"));
        assertEquals("Dashboard", driver.getTitle());

        // explicit wait - to wait for the compose button to be click-able
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));

        homepage.questionIcon.click();

        String winHandleBefore = driver.getWindowHandle();

        // Perform the click operation that opens new window

        // Switch to new window opened
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
            }
        assertEquals("Welcome to Oro Documentation", driver.getTitle());
    }
}


//// Perform the actions on new window
//
//// Close the new window, if that window no more required