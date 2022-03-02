package app.pivocapture.utils;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;

public class DesiredCaps {

    public DesiredCapabilities getDesiredCapabilities(String deviceName, String platformVersion, String udid ) throws IOException {

        DesiredCapabilities capabilities = new DesiredCapabilities();


        /******CONNECT WITH REAL DEVICE*****/
        capabilities.setCapability("deviceName", deviceName);
        capabilities.setCapability("udid",udid);
        capabilities.setCapability("platformVersion",platformVersion);
        capabilities.setCapability("xcodeOrgId", "4JQH63J424");
        capabilities.setCapability("xcodeSigningId", "iPhone Developer");
        capabilities.setCapability("platformName","iOS");
        capabilities.setCapability("automationName", "XCUITest");
        capabilities.setCapability("bundleId","app.pivo.ios.capture");

        return capabilities;


        /***** CONNECT WITH EMULATOR*****/

//        capabilities.setCapability("deviceName", deviceName);
//        capabilities.setCapability("automationName", "UiAutomator2");
//        capabilities.setCapability("platformName", "Android");
//        capabilities.setCapability("platformVersion", platformVersion);
//        capabilities.setCapability("app", System.getProperty("user.dir") + "/apps/951.apk");
//        capabilities.setCapability("appActivity", ".MainActivity");
//        capabilities.setCapability("appPackage", "app.pivo.android.capture");
//        capabilities.setCapability("noReset", "true");
//        capabilities.setCapability("fullReset", "false");

    }

}
