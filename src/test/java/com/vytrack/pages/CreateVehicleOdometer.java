package com.vytrack.pages;

import com.github.javafaker.Faker;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class CreateVehicleOdometer {


    @FindBy(xpath = "//*[contains(@id,'custom_entity_type_OdometerValue-uid')]")
    public WebElement odometerValueInput;

    @FindBy(xpath = "//*[contains(@id, 'date_selector_custom_entity_type_Date') ]")
    public WebElement dateInput;

    @FindBy(xpath = "//*[contains(@id,'custom_entity_type_Driver-uid')]")
    public WebElement driverInput;

    @FindBy (xpath = "//*[@id=\"custom_entity_type-uid-615eb3cd020fd\"]/div[2]/div[2]/div/div[1]/div[2]/div/fieldset/div/div[4]/div[2]")
    public WebElement unitDropdown;

    @FindBy(xpath = "//div[contains(@id,'s2id_custom_entity_type_Model-uid')]")
    public WebElement modelValue;

    @FindBy(xpath = "//*[@id=\"select2-drop\"]/div/input")
    public WebElement modelInputBox;

    @FindBy(xpath = "//button[@type='submit'][@class='btn btn-success action-button']")
    public WebElement saveBtn;

    public CreateVehicleOdometer(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void createVehicleOdometer1(){

        Actions action = new Actions(Driver.getDriver());
        Faker faker = new Faker();

        odometerValueInput.sendKeys(faker.numerify("#####"));

        Driver.getDriver().manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);

        dateInput.click();
        WebElement monthOpt = Driver.getDriver().findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/select[1]"));
        Select month = new Select(monthOpt);
        month.selectByVisibleText("Oct");

        WebElement yearOpt = Driver.getDriver().findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/select[2]"));
        Select year = new Select(yearOpt);
        year.selectByVisibleText("2021");

        WebElement day = Driver.getDriver().findElement(By.xpath("//td[(contains(@class,' '))]/a[text()='7']"));
        day.click();

        Driver.getDriver().manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);

        driverInput.sendKeys(faker.name().fullName());

      /*  unitDropdown.click();
        WebElement miles = Driver.getDriver().findElement(By.xpath("//span[@class='select2-chosen'][text()='miles']"));
        action.moveToElement(miles).click().perform();*/

        Driver.getDriver().manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);

       modelValue.click();
       modelInputBox.sendKeys("Sprinter");

       saveBtn.submit();




    }



}
