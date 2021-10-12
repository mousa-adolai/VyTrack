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

import java.util.*;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalesStoreMAnagerCreatesOdometer  {
    @Test
    public void testSalesManagerCreatesOdometer(){


            Map<String, String> credentials = new LinkedHashMap<>();
            credentials.put("storemanager71", "UserUser123");
            credentials.put("storemanager72", "UserUser123");
           // credentials.put("salesmanager131", "UserUser123");
             credentials.put("salesmanager132", "UserUser123");
            //credentials.put("salesmanager133", "UserUser123");

            for (Map.Entry<String, String> eachCredentials : credentials.entrySet()) {
                    VyTrackLogin loginPage = new VyTrackLogin();
                    loginPage.goTo();
                    loginPage.login(eachCredentials.getKey(),eachCredentials.getValue());

                    VyTruckDashboardDriverLoggedIn dashboardElm = new VyTruckDashboardDriverLoggedIn();
                    Actions actions = new Actions(Driver.getDriver());

                    //hovering over fleet module.
                    WebElement fleetModule1 = Driver.getDriver().findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]/a/span"));
                    actions.moveToElement(fleetModule1).perform();

                    Driver.getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

                    //clicking vehicle odometer from dropdown
                    WebElement vehicleOdometer = Driver.getDriver().findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]/div/div/ul/li[4]/a/span"));
                    vehicleOdometer.click();

                    Driver.getDriver().manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

                    //no permission element
                    WebElement noPermissionMsg = Driver.getDriver().findElement(By.xpath("//*[@id=\"flash-messages\"]/div/div/div[2]/div"));
                    System.out.println(noPermissionMsg.getText());
                    String actualResult = noPermissionMsg.getText();
                    String expectedResult = "You do not have permission to perform this action.";

                    assertEquals(expectedResult, actualResult);

                    Driver.closeBrowser();


            }



        }


}
