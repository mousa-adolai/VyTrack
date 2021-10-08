package com.vytrack.tests;

import com.vytrack.pages.MenuBar;
import com.vytrack.pages.VyTrackLogin;
import com.vytrack.utilities.BrowserUtil;
import com.vytrack.utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.*;

public class userStory_6 extends TestBase {

    VyTrackLogin vyTrackLogin = new VyTrackLogin();
    MenuBar menuBar = new MenuBar();


    @Test
     public void usernameOptions(){
        vyTrackLogin.goTo();
        vyTrackLogin.login("user30", "UserUser123");
        BrowserUtil.waitFor(2);

        // clicking on Username dropdown

        /*
        menuBar.userMenu.click();
        BrowserUtil.waitFor(5);

        assertEquals("My User", menuBar.myUserTab);
         */

/*
        // xpath   ... "//li/a[@class='dropdown-toggle']"
        //  xpath            //li/a/i[@class='fa-caret-down']
        WebElement usernameDropdown = driver.findElement(By.xpath("//li/a/i[@class='fa-caret-down']"));
        usernameDropdown.click();


        BrowserUtil.waitFor(3);

        WebElement myUser = driver.findElement(By.linkText("My User"));
        assertEquals("My User", usernameDropdown.getText() );

 */


        menuBar.userMenu.click();
        BrowserUtil.waitFor(2);

        assertEquals("My User", menuBar.myUserTab.getText());
        BrowserUtil.waitFor(2);
        assertEquals("My Configuration", menuBar.myConfigurationTab.getText());
        BrowserUtil.waitFor(2);
        assertEquals("My Calendar", menuBar.myCalendarTab.getText());
        BrowserUtil.waitFor(2);



        /*
        assertEquals("My User", usernameDropdown.getText() );
        assertEquals("My Configuration", usernameDropdown.getText() );
        assertEquals("My Calendar", usernameDropdown.getText() );


         */




    }

}
