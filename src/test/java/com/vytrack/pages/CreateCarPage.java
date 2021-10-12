package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCarPage {
    public CreateCarPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //  @FindBy(id = "custom_entity_type_LicensePlate-uid-61588bb377b9f") Dynamic wen element !!!
    // custom_entity_type_LicensePlate-uid-6158f86121413
    //field__license-plate
    //input[@name='custom_entity_type[LicensePlate]']
//  @FindBy(xpath="//input[@name='custom_entity_type[LicensePlate]']")
    @FindBy(xpath = "//input[starts-with(@id,'custom_entity_type_LicensePlate')]")
    public WebElement licensePlate;

    //@FindBy(xpath = "(//div[@class='oro-clearfix'])[1]")//there are 7 options you can select with index numbers
    @FindBy(xpath = "//input[starts-with(@id,'custom_entity_type_Tags_0')]")
    public WebElement tagsJuniorChechBox;

    @FindBy(xpath = "//input[starts-with(@id,'custom_entity_type_Driver')]")
    public WebElement driverBox;

    @FindBy(xpath = "//input[starts-with(@id,'custom_entity_type_Location')]")
    public WebElement locationBox;

    @FindBy(xpath = "//input[starts-with(@id,'custom_entity_type_ChassisNumber')]")
    public WebElement chassisNumberBox;

    @FindBy(xpath = "//input[starts-with(@id,'custom_entity_type_ModelYear')]")
    public WebElement modelYearBox;

    @FindBy(xpath = "//input[starts-with(@id,'custom_entity_type_LastOdometer')]")
    public WebElement lastOdometerBox;

    @FindBy(xpath = "//input[starts-with(@id,'date_selector_custom_entity_type_ImmatriculationDate')]")
    public WebElement immatriculationDateBox;

    @FindBy(xpath = "//input[starts-with(@id,'date_selector_custom_entity_type_FirstContractDate')]")
    public WebElement firstContractDateBox;

    @FindBy(xpath = "//input[starts-with(@id,'custom_entity_type_CatalogValue')]")
    public WebElement catalogValueBox;

    @FindBy(xpath = "//input[starts-with(@id,'custom_entity_type_SeatsNumber')]")
    public WebElement seatsNumberBox;

    @FindBy(xpath = "//input[starts-with(@id,'custom_entity_type_DoorsNumber')]")
    public WebElement doorsNumberBox;

    @FindBy(xpath = "//input[starts-with(@id,'custom_entity_type_Color')]")
    public WebElement colorBox;

    @FindBy(xpath = "//*[starts-with(@id,'s2id_custom_entity_type_Transmission')]")
    public WebElement transmissionDropdown;

    @FindBy(xpath = "//*[@class='select2-result-label' and normalize-space(.)='Manual']")
    public WebElement transmissionDropdownManualOption;

    @FindBy(xpath = "//*[starts-with(@id,'s2id_custom_entity_type_FuelType')]")
    public WebElement fuelTypeDropdown;

    @FindBy(xpath = "//*[@class='select2-result-label' and normalize-space(.)='Hybrid']")
    public WebElement fuelTypeDropdownHybridOption;

    @FindBy(xpath = "//input[starts-with(@id,'custom_entity_type_CO2Emissions')]")
    public WebElement co2EmissionsBox;

    @FindBy(xpath = "//input[starts-with(@id,'custom_entity_type_Horsepower')]")
    public WebElement horsepowerBox;

    @FindBy(xpath = "//input[starts-with(@id,'custom_entity_type_HorsepowerTaxation')]")
    public WebElement horsepowerTaxationPowerBox;

    @FindBy(xpath = "//input[starts-with(@id,'custom_entity_type_Power')]")
    public WebElement powerBox;

    @FindBy(xpath = "//input[starts-with(@id,'custom_entity_type_Logo_file')]")
    public WebElement logoBox;

    @FindBy(xpath = "//button[normalize-space(.)='Save and Close']")
    public WebElement saveAndCloseButton;

    @FindBy(xpath = "//button[.='Today']")
    public WebElement todayButton;

    @FindBy(xpath = "//input[starts-with(@id,'custom_entity_type_Logo_file')]")
    public  WebElement chooseFileButton;

    @FindBy(xpath = "//*[normalize-space(.)='Entity saved']")
    public  WebElement entitySavedMessageText;




}

