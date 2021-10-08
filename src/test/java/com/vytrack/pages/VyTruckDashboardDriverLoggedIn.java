package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VyTruckDashboardDriverLoggedIn {

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[1]")
    public WebElement fleetModule;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[2]/a/span")
    public WebElement customerModule;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[3]/a/span")
    public WebElement activitiesModule;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[4]/a/span")
    public WebElement systemModule;

    public VyTruckDashboardDriverLoggedIn(){
        PageFactory.initElements(Driver.getDriver(),this);
    }





}
