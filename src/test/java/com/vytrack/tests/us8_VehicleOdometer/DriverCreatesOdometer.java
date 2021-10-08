package com.vytrack.tests.us8_VehicleOdometer;

import com.vytrack.pages.CreateVehicleOdometer;
import com.vytrack.pages.VyTrackLogin;
import com.vytrack.pages.VyTruckDashboardDriverLoggedIn;
import com.vytrack.utilities.ConfigReader;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DriverCreatesOdometer extends TestBase {

    @Test
    public void testDriverCreateOdometer() throws InterruptedException{

        //logging to home page
        VyTrackLogin loginPage = new VyTrackLogin();
        loginPage.goTo();
        loginPage.loginAsTruckDriver();

        VyTruckDashboardDriverLoggedIn dashboardElm = new VyTruckDashboardDriverLoggedIn();
        Actions actions = new Actions(driver);

        //hovering over fleet module
        actions.moveToElement(dashboardElm.fleetModule).perform();

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        //clicking vehicle odometer from dropdown
        WebElement vehicleOdometer = driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[1]/div/div/ul/li[4]/a/span"));
        vehicleOdometer.click();

        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

        //clicking create odometer button
        WebElement createOdometerBtn =  driver.findElement(By.cssSelector("#container > div.container-fluid.page-title > div > div > div.pull-right.title-buttons-container > a"));
        actions.moveToElement(createOdometerBtn).click().perform();

        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.navigate().to("https://qa3.vytrack.com/entity/update/Extend_Entity_VehiclesOdometer/item");

        CreateVehicleOdometer vehicleOdometerInfo = new CreateVehicleOdometer();
        vehicleOdometerInfo.createVehicleOdometer1();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),2);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"flash-messages\"]/div/div") ));

        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

    }








}
