package com.vytrack.tests;

import com.github.javafaker.Faker;
import com.vytrack.pages.VyTrackLogin;
import com.vytrack.pages.VyTrackVehicleCosts;
import com.vytrack.utilities.BrowserUtil;
import com.vytrack.utilities.ConfigReader;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.*;

public class userStory_7 extends TestBase {
    /*
    TODO USER STORY 7
     Story: As a user, I should be able to create vehicle costs.

Given user is on the homePage
When user select “Vehicle Costs” under Fleet module
And user click “Create Vehicle Costs” button
When user fill out general information
And click “Save and Close” button
Then verify “Entity saved” confirm message
     */

    VyTrackLogin trackLogin = new VyTrackLogin();
    VyTrackVehicleCosts vehicleCosts = new VyTrackVehicleCosts();
    Faker faker = new Faker();


@Test
public void truckDriver1createVehicleCosts(){
    // Given user is on the homePage
    trackLogin.goTo();
    trackLogin.login(ConfigReader.read("truckDriver1"), ConfigReader.read("password"));
    BrowserUtil.waitFor(2);

    // When user select “Vehicle Costs” under Fleet module
    vehicleCosts.goToVehicleCosts();
    BrowserUtil.waitFor(2);

    // And user click “Create Vehicle Costs” button
    vehicleCosts.createVehicleCostsBtn.click();
    BrowserUtil.waitFor(2);


    // When user fill out general information and click “Save and Close” button
    vehicleCosts.vehicleCostsGeneralInfo();
    vehicleCosts.saveAndClose.click();

    // Then verify “Entity saved” confirm message
    String expectedResult = "Entity saved";
    assertTrue(vehicleCosts.entityMsg.getText().equals(expectedResult));
}

    @Test
    public void truckDriver2createVehicleCosts(){
        // Given user is on the homePage
        trackLogin.goTo();
        trackLogin.login(ConfigReader.read("truckDriver2"), ConfigReader.read("password"));
        BrowserUtil.waitFor(2);

        // When user select “Vehicle Costs” under Fleet module
        vehicleCosts.goToVehicleCosts();
        BrowserUtil.waitFor(2);

        // And user click “Create Vehicle Costs” button
        vehicleCosts.createVehicleCostsBtn.click();
        BrowserUtil.waitFor(2);


        // When user fill out general information and click “Save and Close” button
        vehicleCosts.vehicleCostsGeneralInfo();
        vehicleCosts.saveAndClose.click();

        // Then verify “Entity saved” confirm message
        String expectedResult = "Entity saved";
        assertTrue(vehicleCosts.entityMsg.getText().equals(expectedResult));
    }

    @Test
    public void truckDriver3createVehicleCosts(){
        // Given user is on the homePage
        trackLogin.goTo();
        trackLogin.login(ConfigReader.read("truckDriver3"), ConfigReader.read("password"));
        BrowserUtil.waitFor(2);

        // When user select “Vehicle Costs” under Fleet module
        vehicleCosts.goToVehicleCosts();
        BrowserUtil.waitFor(2);

        // And user click “Create Vehicle Costs” button
        vehicleCosts.createVehicleCostsBtn.click();
        BrowserUtil.waitFor(2);


        // When user fill out general information and click “Save and Close” button
        vehicleCosts.vehicleCostsGeneralInfo();
        vehicleCosts.saveAndClose.click();

        // Then verify “Entity saved” confirm message
        String expectedResult = "Entity saved";
        assertTrue(vehicleCosts.entityMsg.getText().equals(expectedResult));
    }

    @Test
    public void storeManager1createVehicleCosts(){
        // Given user is on the homePage
        trackLogin.goTo();
        trackLogin.login(ConfigReader.read("storeManager1"), ConfigReader.read("password"));
        BrowserUtil.waitFor(2);

        // When user select “Vehicle Costs” under Fleet module
        vehicleCosts.goToVehicleCosts();
        BrowserUtil.waitFor(2);

        // And user click “Create Vehicle Costs” button
        vehicleCosts.createVehicleCostsBtn.click();
        BrowserUtil.waitFor(2);


        // When user fill out general information and click “Save and Close” button
        vehicleCosts.vehicleCostsGeneralInfo();
        vehicleCosts.saveAndClose.click();

        // Then verify “Entity saved” confirm message
        String expectedResult = "Entity saved";
        assertTrue(vehicleCosts.entityMsg.getText().equals(expectedResult));
    }

    @Test
    public void storeManager2createVehicleCosts(){
        // Given user is on the homePage
        trackLogin.goTo();
        trackLogin.login(ConfigReader.read("storeManager2"), ConfigReader.read("password"));
        BrowserUtil.waitFor(2);

        // When user select “Vehicle Costs” under Fleet module
        vehicleCosts.goToVehicleCosts();
        BrowserUtil.waitFor(2);

        // And user click “Create Vehicle Costs” button
        vehicleCosts.createVehicleCostsBtn.click();
        BrowserUtil.waitFor(2);


        // When user fill out general information and click “Save and Close” button
        vehicleCosts.vehicleCostsGeneralInfo();
        vehicleCosts.saveAndClose.click();

        // Then verify “Entity saved” confirm message
        String expectedResult = "Entity saved";
        assertTrue(vehicleCosts.entityMsg.getText().equals(expectedResult));
    }

    @Test
    public void salesManager1createVehicleCosts(){
        // Given user is on the homePage
        trackLogin.goTo();
        trackLogin.login(ConfigReader.read("salesManager1"), ConfigReader.read("password"));
        BrowserUtil.waitFor(2);

        // When user select “Vehicle Costs” under Fleet module
        vehicleCosts.goToVehicleCosts();
        BrowserUtil.waitFor(2);

        // And user click “Create Vehicle Costs” button
        vehicleCosts.createVehicleCostsBtn.click();
        BrowserUtil.waitFor(2);


        // When user fill out general information and click “Save and Close” button
        vehicleCosts.vehicleCostsGeneralInfo();
        vehicleCosts.saveAndClose.click();

        // Then verify “Entity saved” confirm message
        String expectedResult = "Entity saved";
        assertTrue(vehicleCosts.entityMsg.getText().equals(expectedResult));
    }

    @Test
    public void salesManager2createVehicleCosts(){
        // Given user is on the homePage
        trackLogin.goTo();
        trackLogin.login(ConfigReader.read("salesManager2"), ConfigReader.read("password"));
        BrowserUtil.waitFor(2);

        // When user select “Vehicle Costs” under Fleet module
        vehicleCosts.goToVehicleCosts();
        BrowserUtil.waitFor(2);

        // And user click “Create Vehicle Costs” button
        vehicleCosts.createVehicleCostsBtn.click();
        BrowserUtil.waitFor(2);


        // When user fill out general information and click “Save and Close” button
        vehicleCosts.vehicleCostsGeneralInfo();
        vehicleCosts.saveAndClose.click();

        // Then verify “Entity saved” confirm message
        String expectedResult = "Entity saved";
        assertTrue(vehicleCosts.entityMsg.getText().equals(expectedResult));
    }

    @Test
    public void salesManager3createVehicleCosts(){
        // Given user is on the homePage
        trackLogin.goTo();
        trackLogin.login(ConfigReader.read("salesManager3"), ConfigReader.read("password"));
        BrowserUtil.waitFor(2);

        // When user select “Vehicle Costs” under Fleet module
        vehicleCosts.goToVehicleCosts();
        BrowserUtil.waitFor(2);

        // And user click “Create Vehicle Costs” button
        vehicleCosts.createVehicleCostsBtn.click();
        BrowserUtil.waitFor(2);


        // When user fill out general information and click “Save and Close” button
        vehicleCosts.vehicleCostsGeneralInfo();
        vehicleCosts.saveAndClose.click();

        // Then verify “Entity saved” confirm message
        String expectedResult = "Entity saved";
        assertTrue(vehicleCosts.entityMsg.getText().equals(expectedResult));
    }








}
