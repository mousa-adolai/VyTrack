package com.vytrack.tests;


import com.github.javafaker.Faker;
import com.vytrack.pages.VyTrackLogin;
import com.vytrack.pages.VyTrackVehicleCosts;
import com.vytrack.utilities.BrowserUtil;
import com.vytrack.utilities.ConfigReader;
import com.vytrack.utilities.TestBase;
import org.junit.jupiter.api.Test;
import com.vytrack.pages.MenuBar;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class userStory_5 extends TestBase {

    /**
     * 5. Story: As a user, I should be to select accounts from accounts page
     */


    VyTrackLogin trackLogin = new VyTrackLogin();
    VyTrackVehicleCosts vehicleCosts = new VyTrackVehicleCosts();
    Faker faker = new Faker();
    MenuBar menuBar = new MenuBar();

    @Test
    public void userSelectAccountsFromAccountsPage() {
        // Given user is on the homePage
        trackLogin.goTo();
        trackLogin.login(ConfigReader.read("truckDriver1"), ConfigReader.read("password"));
        BrowserUtil.waitFor(2);

        menuBar.customersTab.click();
        BrowserUtil.waitFor(2);

        assertEquals("Customers", menuBar.customersTab.getText());
        BrowserUtil.waitFor(2);


        menuBar.accountsTab.click();
        BrowserUtil.waitFor(2);

        assertEquals("Accounts", menuBar.accountsTab.getText());
        BrowserUtil.waitFor(2);

        WebElement checkboxAll = driver.findElement(By.id("checkbox"));
        System.out.println(checkboxAll.isSelected());



    }
}


/*
5. Story: As a user, I should be to select accounts from accounts page
AC #1: user can select all the accounts by checking the first checkbox
Given user is on the homePage
When user select “Accounts” under Customers module
And user checks the first checkbox
Then verify all the checkbox is checked




AC #2: user can select any account
Given user is on the homePage
When user select “Accounts” under Customers module
And user checks any account’s checkbox
Then verify the checkbox is checked

 */