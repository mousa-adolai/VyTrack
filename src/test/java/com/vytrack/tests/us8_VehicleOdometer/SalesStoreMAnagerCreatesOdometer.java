package com.vytrack.tests.us8_VehicleOdometer;

import com.vytrack.pages.VyTrackLogin;
import com.vytrack.pages.VyTruckDashboardDriverLoggedIn;
import com.vytrack.utilities.ConfigReader;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalesStoreMAnagerCreatesOdometer extends TestBase {
    @Test
    public void testSalesManagerCreatesOdometer(){



            VyTrackLogin loginPage = new VyTrackLogin();
            loginPage.goTo();
            loginPage.loginAsSalesManager();

            VyTruckDashboardDriverLoggedIn dashboardElm = new VyTruckDashboardDriverLoggedIn();
            Actions actions = new Actions(driver);

            //hovering over fleet module.
            WebElement fleetModule1 = Driver.getDriver().findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]/a/span"));
            actions.moveToElement(fleetModule1).perform();

            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

            //clicking vehicle odometer from dropdown
            WebElement vehicleOdometer = driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]/div/div/ul/li[4]/a/span"));
            vehicleOdometer.click();

            driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

            //no permission element
            WebElement noPermissionMsg = Driver.getDriver().findElement(By.xpath("//*[@id=\"flash-messages\"]/div/div/div[2]/div"));
            System.out.println(noPermissionMsg.getText());
            String actualResult = noPermissionMsg.getText();
            String expectedResult = "You do not have permission to perform this action.";

            assertEquals(expectedResult, actualResult);

        }

        @Test
    public void testStoreManagerCtreatesOdometer(){
            VyTrackLogin loginPage = new VyTrackLogin();
            loginPage.goTo();
            loginPage.loginAsStoreManager();

            VyTruckDashboardDriverLoggedIn dashboardElm = new VyTruckDashboardDriverLoggedIn();
            Actions actions = new Actions(driver);

            //hovering over fleet module.
            WebElement fleetModule1 = Driver.getDriver().findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]/a/span"));
            actions.moveToElement(fleetModule1).perform();

            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

            //clicking vehicle odometer from dropdown
            WebElement vehicleOdometer = driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]/div/div/ul/li[4]/a/span"));
            vehicleOdometer.click();

            driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

            //no permission element
            WebElement noPermissionMsg = Driver.getDriver().findElement(By.xpath("//*[@id=\"flash-messages\"]/div/div/div[2]/div"));
            System.out.println(noPermissionMsg.getText());
            String actualResult = noPermissionMsg.getText();
            String expectedResult = "You do not have permission to perform this action.";

            assertEquals(expectedResult, actualResult);

        }

}
