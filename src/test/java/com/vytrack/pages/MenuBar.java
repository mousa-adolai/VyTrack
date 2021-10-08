package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class MenuBar {
    @FindBy(css = "ul.nav-multilevel.main-menu>li.dropdown.dropdown-level-1")
    public List<WebElement> modules;

    @FindBy(xpath = "//a[normalize-space(.)='Dashboards']")
    public WebElement dashboardsTab;

    @FindBy(xpath = "//a[normalize-space(.)='Fleet']")
    public WebElement fleetTab;

    @FindBy(linkText = "Vehicles")
    public WebElement vehiclesTab;

    @FindBy(xpath = "//a[normalize-space(.)='Activities']")
    public WebElement customersTab;

    @FindBy(linkText = "Contacts")
    public WebElement contactsTab;

    @FindBy(linkText = "Accounts")
    public WebElement accountsTab;

    @FindBy(linkText = "//a[normalize-space(.)='Sales']")
    public WebElement salesTab;

    @FindBy(xpath = "//a[normalize-space(.)='Activities']")
    public WebElement activitiesTab;

    @FindBy(linkText = "Calendar Events")
    public WebElement calendarTab;

    @FindBy(xpath = "//a[normalize-space(.)='Marketing']")
    public WebElement marketingTab;

    @FindBy(xpath = "//a[normalize-space(.)='Reports & Segments']")
    public WebElement reportsAndSegmentsTab;

    @FindBy(xpath = "//a[normalize-space(.)='System']")
    public WebElement systemTab;

    @FindBy(css = "li#user-menu>a.dropdown-toggle")
    public WebElement userMenu;

    @FindBy(linkText = "My User")
    public WebElement myUserTab;

    @FindBy(linkText = "My Configuration")
    public WebElement myConfigurationTab;

    @FindBy(linkText = "My Calendar")
    public WebElement myCalendarTab;

    @FindBy(linkText = "Logout")
    public WebElement logoutTab;

    public MenuBar() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public boolean moduleNamesMatch(List<String> expectedModuleNames){
        List<String> actualModuleNames = new ArrayList<>();
        for(WebElement module:modules){
            actualModuleNames.add(module.getText().trim());
        }
        return actualModuleNames.equals(expectedModuleNames);
    }


}
