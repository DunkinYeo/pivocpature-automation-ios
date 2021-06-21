package app.pivocapture.tests;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.net.URL;

public abstract class BaseTest {

    private static AppiumDriverLocalService service;
    public IOSDriver<WebElement> driver;

    @BeforeSuite
    public void globalSetup () throws IOException {
        System.out.println("Starting BeforeSuite...");
        
        service = AppiumDriverLocalService.buildDefaultService();
        service.start();
    }

    @BeforeTest
    public void setUp() throws Exception {

        DesiredCapabilities capabilities = new DesiredCapabilities();
            
        //Real device
        capabilities.setCapability("xcodeOrgId", "4JQH63J424");
        capabilities.setCapability("xcodeSigningId", "iPhone Developer");
        capabilities.setCapability("automationName", "XCUITest");
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("platformVersion", "14.6");
        capabilities.setCapability("deviceName", "iPhone SE2");
        capabilities.setCapability("bundleId", "app.pivo.ios.capture");
        capabilities.setCapability("udid", "00008030-001005840E83802E");
        //capabilities.setCapability("agentPath", "/opt/homebrew/lib/node_modules/appium/node_modules/appium-webdriveragent/WebDriverAgent.xcodeproj");
        //capabilities.setCapability("bootStrapPath", "/opt/homebrew/lib/node_modules/appium/node_modules/appium-webdriveragent");
        
     /* For Simulator
        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot, "../apps");
        File app = new File(appDir.getCanonicalPath(), "PivoTour.app");
        
        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("automationName", "XCUITest");
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("platformVersion", "14.5");
        capabilities.setCapability("deviceName", "iPhone Simulator");
    
        System.out.println(app.getAbsolutePath());
    */

        try {
            driver = new IOSDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            //driver = new IOSDriver<WebElement>(getServiceUrl(), capabilities);

        } catch (Exception e) {
            e.printStackTrace();
        }

        //wait = new WebDriverWait(driver, 10);
    }

    @AfterTest
    public void tearDown() {
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
