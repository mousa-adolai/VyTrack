package com.vytrack.pages;

import com.github.javafaker.Faker;
import com.vytrack.utilities.BrowserUtil;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class VyTrackVehicleCosts {

    @FindBy(xpath = "//div/a[normalize-space(.)='Create Vehicle Costs']")
    public WebElement createVehicleCostsBtn;

    @FindBy(linkText = "Choose a value...")
    public WebElement chooseValueField;

    @FindBy(css = "fieldset > div > div > div > input")
    public WebElement totalPriceField;

    @FindBy(xpath = "//*[starts-with(@id, 'date_selector_custom_entity_type')]")
    public WebElement dateField;

    @FindBy(xpath = "//div/button[.='Today']")
    public WebElement todayOption;

    @FindBy(css = "div > div >textarea")
    public WebElement costDescriptionField;

    @FindBy(xpath = "//div/button[starts-with(@class, 'btn btn-medium')]")
    public WebElement chassisNumberAddBtn;

    @FindBy(xpath = "//div[@class='grid-container']//input")
    public List<WebElement> chassisNumberCheckBoxes;

    @FindBy(xpath = "//span/button[@class='btn btn-primary']")
    public WebElement selectBtnChassisNumber;

    @FindBy(xpath = "(//div/button[@class='btn btn-medium add-btn'])[2]")
    public WebElement licenceplate;

    @FindBy(xpath = "//div[@class='grid-container']//input")
    public List<WebElement> licencePlateCheckBoxes;

    @FindBy(xpath = "//span/button[@class='btn btn-primary']")
    public  WebElement selectBtnLicencePlate;

    @FindBy(xpath = "//div/button[normalize-space(.)='Save and Close']")
    public WebElement saveAndClose;

    @FindBy(xpath = "//div[text()='Entity saved']")
    public WebElement entityMsg;

    public VyTrackVehicleCosts() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void goToVehicleCosts() {
        MenuBar menuBar = new MenuBar();
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(menuBar.fleetTab).perform();
        Driver.getDriver().findElement(By.linkText("Vehicle Costs")).click();
    }

    public void chassisNumberSelectCheckbox(int a) {
        chassisNumberCheckBoxes.get(a).click();
    }

    public void licencePlateSelectCheckbox(int a) {
        licencePlateCheckBoxes.get(a).click();
    }

    public void vehicleCostsGeneralInfo(){
        Faker faker = new Faker();
        chooseValueField.click();
        Driver.getDriver().findElement(By.xpath("//*[@id=\"select2-drop\"]/ul[2]/li[7]")).click();
        totalPriceField.click();
        totalPriceField.sendKeys(faker.numerify("####"));
        dateField.click();
        todayOption.click();
        costDescriptionField.click();
        costDescriptionField.sendKeys(faker.shakespeare().asYouLikeItQuote());
        chassisNumberAddBtn.click();
        BrowserUtil.waitFor(2);
        chassisNumberSelectCheckbox(faker.number().numberBetween(1,10));
        selectBtnChassisNumber.click();
        licenceplate.click();
        licencePlateSelectCheckbox(faker.number().numberBetween(1,10));
        selectBtnLicencePlate.click();
    }


    }












