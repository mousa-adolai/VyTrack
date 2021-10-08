package com.vytrack.tests;

import com.vytrack.pages.VyTrackLogin;
import com.vytrack.pages.VyTrack_Homepage;
import com.vytrack.utilities.BrowserUtil;
import com.vytrack.utilities.ConfigReader;
import com.vytrack.utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import static org.junit.jupiter.api.Assertions.assertEquals;


/** Karina
 Story: As a user, I should be access to Oro Documentation page.
 AC #1: user access Oro Documentation page
 Given user is on the homePage
 When user click question icon on the right top of the homepage
 Then verify user accessed to Oro Documentation page.
 */


public class userStory_10 extends TestBase {
   // create homepage object to use element
   VyTrack_Homepage homepage= new VyTrack_Homepage();
   // create vyTrackLogin to used elements and methods for usavility purpose
   VyTrackLogin vyTrackLogin= new VyTrackLogin();
   BrowserUtil browserUtil = new BrowserUtil();

    @Test
    public void OroDocumentationAccess()  {
        // calling method to login
        vyTrackLogin.goTo();
        vyTrackLogin.login(ConfigReader.read("username_salesmanager"), ConfigReader.read("password"));
        assertEquals("Dashboard", driver.getTitle());
        // explicit wait - to wait for the compose button to be click-able instead of hard waiting
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(homepage.questionIcon));
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
