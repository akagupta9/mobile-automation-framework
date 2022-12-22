package com.driver;

import org.openqa.selenium.Platform;
import com.driver.managers.AndroidDriverManager;
import com.driver.managers.IosDriverManager;
import io.appium.java_client.AppiumDriver;

public class DriverFactory {
    AppiumDriver getDriver(Platform platform) throws Exception {
        switch (platform) {
        case ANDROID:
        return new AndroidDriverManager().initDriver();

        case IOS:
        return new IosDriverManager().initDriver();

        default:
            throw new Exception("Invalid Platform");
        }
    }
}
