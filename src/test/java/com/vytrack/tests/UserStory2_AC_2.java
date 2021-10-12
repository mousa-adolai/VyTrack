package com.vytrack.tests;


import com.vytrack.pages.VyTrackLogin;
import com.vytrack.utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class UserStory2_AC_2 extends TestBase{

    /*
 AC #2: drivers should not able to create a car
 Given driver is on the homePage
 When user select “Vehicles” under Fleet module
 Then “create car” button should not be visible
     */

        VyTrackLogin trackDriver = new VyTrackLogin();


        @Test
        public void UnableToCreateCar() throws InterruptedException {
            // Given driver is on the homePage
            trackDriver.goTo();
            trackDriver.loginAsTruckDriver();

            //When user select “Vehicles” under Fleet module
            ////span[@class='title title-level-1']
            WebElement fleetModule = driver.findElement(By.xpath("//span[@class='title title-level-1' and normalize-space(.)='Fleet'] "));
            Actions actions = new Actions(driver);
            Thread.sleep(2000);
            actions.moveToElement(fleetModule).perform();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//span[@class='title title-level-2' and normalize-space(.)='Vehicles']")).click();

            Thread.sleep(2000);

            try {
                driver.findElement(By.xpath("//a[@title='Create Car']"));
                System.out.println("If element is visible test is failed");
            }catch (NoSuchElementException e){
                System.out.println("If element is invisible then test is passed!");
            }













        }
    }
