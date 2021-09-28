package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VyTrackVehicleFuelLogs {

    @FindBy(css = "h1.oro-subtitle")
    public WebElement pageHeader;

    public VyTrackVehicleFuelLogs() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

}
