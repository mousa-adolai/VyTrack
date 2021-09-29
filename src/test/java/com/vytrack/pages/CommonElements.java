package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonElements {
    //fleet
    //activities
    @FindBy(xpath = "//a[normalize-space(.)='Activities']")
    public WebElement activitiesTab;

    @FindBy(linkText = "Calendar Events")
    public WebElement calendarTab;

    public CommonElements() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //system
    //customers

    //POM for all accounts
    //
}
