package com.vytrack.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties = new Properties();

    static {
        try {
            FileInputStream in = new FileInputStream("configure.properties");
            properties.load(in);
            in.close();
        } catch (Exception e) {
            System.out.println("exception message: " + e.getMessage());
        }
    }

    public static String read(String key){
        return properties.getProperty(key);
    }
}
