package com.vytrack.pages;

import com.vytrack.utilities.ConfigReader;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VyTrackLogin {

    @FindBy(id = "prependedInput")
    public WebElement usernameField;

    @FindBy(id = "prependedInput2")
    public WebElement passwordField;

    @FindBy(id = "_submit")
    public WebElement submitButton;

    @FindBy(linkText = "Forgot your password?")
    public WebElement forgotPasswordLink;

    @FindBy(xpath = "//[.='Invalid user name or password.']")
    public WebElement errorMsg;

    public VyTrackLogin() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

//fab made
    public void goTo(){
        Driver.getDriver().navigate().to(ConfigReader.read("url"));
    }
    // fab done



    public void login(String username, String password) {
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        submitButton.click();
    }

    public void loginAsTruckDriver() {
        login(ConfigReader.read("username_truckdriver"), ConfigReader.read("password"));
    }

    public void loginAsSalesManager() {
        login(ConfigReader.read("username_salesmanager"), ConfigReader.read("password"));
    }

    public void loginAsStoreManager() {
        login(ConfigReader.read("username_storemanager"), ConfigReader.read("password"));
    }

    public void clickForgotPasswordLink(){
        forgotPasswordLink.click();
    }

    public boolean isErrorMessageVisible(){
        return errorMsg.isDisplayed();
    }
}
