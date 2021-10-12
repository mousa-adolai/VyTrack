package com.vytrack.utilities;


import org.openqa.selenium.By;

public class BrowserUtil {

    public static void waitFor(int second) {
        try {
            Thread.sleep(second * 1000);
        } catch (Exception e) {
            System.out.println("e.getMessage() = " + e.getMessage());
        }

    }


}