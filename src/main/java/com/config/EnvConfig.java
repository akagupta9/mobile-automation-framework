package com.config;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.LoadPolicy;
import org.aeonbits.owner.Config.LoadType;


@LoadPolicy(LoadType.MERGE)
@Config.Sources({
    "system:properties",
    "classpath:env/general.properties",
    "classpath:env/android.properties",
    "classpath:env/ios.properties"})
public interface EnvConfig extends Config {

    @Key("install.app")
    Boolean installApp();

    @Key("appium.run.ip")
    String serverIp();

    @Key("appium.run.port")
    String serverPort();

    @Key("app.ios.path")
    String iosAppPath();

    @Key("app.ios.appName")
    String iosAppName();

    @Key("app.android.path")
    String androidAppPath();

    @Key("app.android.version")
    String androidVersion();

    @Key("app.android.deviceName")
    String androidDeviceName();

    @Key("app.android.appPackage")
    String androidAppPackage();

    @Key("app.android.appActivity")
    String androidAppActivity();
    

}
