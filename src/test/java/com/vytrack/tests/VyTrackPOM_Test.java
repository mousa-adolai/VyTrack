package com.vytrack.tests;

import com.vytrack.pages.CommonElements;
import com.vytrack.pages.VyTrackCalendarEvents;
import com.vytrack.pages.VyTrackLogin;
import com.vytrack.utilities.ConfigReader;
import com.vytrack.utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static org.junit.jupiter.api.Assertions.*;

public class VyTrackPOM_Test extends TestBase {

    @Test
    public void testVyTrack_POM_login () throws InterruptedException {



        VyTrackLogin vyTrackLogin = new VyTrackLogin();
        vyTrackLogin.goTo();
        vyTrackLogin.login("user30" , "UserUser123");

        CommonElements commonElements = new CommonElements();

        Actions actions = new Actions( driver );
        actions.moveToElement(commonElements.activitiesTab ).perform();
        commonElements.calendarTab.click();
        Thread.sleep(8000);


        //VyTrackCalendarEvents vyTrackCalendarEvents = new VyTrackCalendarEvents();


        //Actions actions = new Actions( driver );

       // actions.moveToElement( webElement ).perform();

        //vyTrackCalendarEvents.activitiesTab.sendKeys(actions.moveToElement(webElement).perform();
        //actions.moveToElement()


    }

}
