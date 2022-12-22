package com.driver.managers;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.config.EnvConfig;
import com.config.EnvConfigFactory;
import com.driver.IDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class IosDriverManager implements IDriver {

    @Override
    public AppiumDriver initDriver() {

        EnvConfig configuration = EnvConfigFactory.getConfiguration();
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, configuration.androidVersion());
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, configuration.androidDeviceName());
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
        desiredCapabilities.setCapability(MobileCapabilityType.APP, configuration.androidAppPath());
        return new AppiumDriver(desiredCapabilities);

    }
}
