package com.vytrack.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class VyTrackUtil {

    public static void login(String username, String password){
    Driver.getDriver().findElement(By.id("prependedInput")).sendKeys(username);

    Driver.getDriver().findElement(By.id("prependedInput2")).sendKeys(password);

    Actions actions = new Actions(Driver.getDriver());

    actions.sendKeys(Keys.ENTER).perform();
    }
    public static void loginAsTruckDriver(){
    login(ConfigReader.read("username_truckdriver"), ConfigReader.read("password"));
    }
    public static void loginAsSalesManager(){
        login(ConfigReader.read("username_salesmanager"), ConfigReader.read("password"));
    }
    public static void loginAsStoreManager(){
        login(ConfigReader.read("username_storemanager"), ConfigReader.read("password"));
    }

}
