package app.pivocapture.tests;

import app.pivocapture.views.LibraryView;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.junit.Assert.*;

import java.net.URL;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LibraryTest extends BaseTest {
    private IOSDriver<WebElement> driver;

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

    @Test
    public void verifyLibraryUI() {
        
        try {

            /////////////////////////////////
            //Check elements of Library View
            /////////////////////////////////
            LibraryView mylib = new LibraryView();
            //Check view title ("Library")
            IOSElement txtViewTitle = mylib.getViewElement(driver, "LIBRARY_TITLE");
            assertTrue("View Title not found", txtViewTitle != null);


        } catch (Exception e) {
            e.printStackTrace();
            fail("Test is incomplete!");
        }
    }

    public String getCurrntDateTime() {
        SimpleDateFormat dateFormat = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss");
        Date time = new Date();
        String curentDateTime = dateFormat.format(time);
        return curentDateTime;
    }
    
        
}
