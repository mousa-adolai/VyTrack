package com.vytrack.tests;


import com.github.javafaker.Faker;
import com.vytrack.pages.VyTrackLogin;
import com.vytrack.pages.VyTrackVehicleCosts;
import com.vytrack.utilities.TestBase;

public class userStory_5 extends TestBase {

    /**
     * 5. Story: As a user, I should be to select accounts from accounts page
     */

    VyTrackLogin trackLogin = new VyTrackLogin();
    VyTrackVehicleCosts vehicleCosts = new VyTrackVehicleCosts();
    Faker faker = new Faker();



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