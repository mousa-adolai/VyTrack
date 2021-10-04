package com.vytrack.tests;

import org.junit.jupiter.api.Test;
import com.vytrack.utilities.ConfigReader;
import com.vytrack.utilities.TestBase;
import com.vytrack.utilities.VyTrackUtil;

public class PracticeLogin extends TestBase {

    @Test
    public void testLogin(){
        driver.get(ConfigReader.read("url"));
        VyTrackUtil.login(ConfigReader.read("username_truckdriver"),ConfigReader.read("password"));
        driver.navigate().back();
        VyTrackUtil.loginAsTruckDriver();
        driver.navigate().back();
        VyTrackUtil.loginAsSalesManager();
        driver.navigate().back();
        VyTrackUtil.loginAsStoreManager();
        System.out.println("Hello");

    }
}
