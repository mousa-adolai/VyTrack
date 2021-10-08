package com.vytrack.utilities;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public abstract class TestBase {

    protected WebDriver driver;

    @BeforeEach
    public void setUpBrowser(){
        driver = Driver.getDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterEach
    public void closeBrowser(){
       // driver.quit();
    }

}
