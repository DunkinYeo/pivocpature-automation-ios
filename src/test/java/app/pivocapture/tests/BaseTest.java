package app.pivocapture.tests;

import app.pivocapture.utils.DesiredCaps;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.Dialect;
import org.testng.annotations.*;

import java.io.IOException;
import java.net.URL;

public abstract class BaseTest {

    public IOSDriver driver;
    private static AppiumDriverLocalService service;
    private final DesiredCaps desiredCaps = new DesiredCaps();

    @BeforeSuite
    public void globalSetup () throws IOException {
        System.out.println("Starting BeforeSuite...");
        
        service = AppiumDriverLocalService.buildDefaultService();
        service.start();
    }

    @BeforeTest
    @Parameters({"deviceName", "platformVersion", "udid"})
    public void setUp(String deviceName, String platformVersion, String udid) throws Exception {
        System.out.println("BeforeTest...");

        DesiredCapabilities capabilities = desiredCaps.getDesiredCapabilities(deviceName, platformVersion, udid);

        try {
            driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            //driver = new IOSDriver<WebElement>(getServiceUrl(), capabilities);

        } catch (Exception e) {
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    @AfterTest
    public void tearDown() {
        System.out.println("AfterTest...");

        if (driver != null) {
            driver.quit();
        }
    }
    
    @AfterSuite
    public void globalTearDown () {
        System.out.println("AfterSuite...");

        if (service != null) {
            service.stop();
        }
    }

    public URL getServiceUrl () {
        return service.getUrl();
    }

}
