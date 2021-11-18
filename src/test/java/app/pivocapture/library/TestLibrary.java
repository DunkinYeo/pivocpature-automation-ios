package app.pivocapture.library;

import app.pivocapture.views.GalleryView;
import app.pivocapture.views.SettingView;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileBy;
import io.appium.java_client.ios.IOSElement;

import java.util.HashMap;

import static org.junit.Assert.assertTrue;

public class TestLibrary {

    final int ANIMATION_TIME = 200; // ms
    static final HashMap<String, String> scrollObject = new HashMap<String, String>();

    public IOSElement findElementByXpathWithWait(WebDriver driver, int second, String xpath) {
        IOSElement element = (IOSElement) new WebDriverWait(driver, second)
                    .until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath(xpath)));
        return element;
    }

    public IOSElement findElementByAccessibilityIDWithWait(WebDriver driver, int second, String accessbilityId) {
        IOSElement element = (IOSElement) new WebDriverWait(driver, second)
                    .until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId(accessbilityId)));
        return element;
    }

    public IOSElement findElementByClassChainIDWithWait(WebDriver driver, int second, String classchainId) {
        IOSElement element = (IOSElement) new WebDriverWait(driver, second)
                .until(ExpectedConditions.visibilityOfElementLocated(MobileBy.iOSClassChain(classchainId)));
        return element;
    }

    public void signOut(IOSDriver<WebElement> driver) {
        //Gallery View
        GalleryView vGallery = new GalleryView();
        IOSElement bProfile = vGallery.getViewElement(driver, "PROFILE");
        assertTrue("Cannot find Profile button", bProfile != null);
        bProfile.click();

        //Setting View
        SettingView vSetting = new SettingView();
        //Scroll down (actually up with a finger) to show Sign out button
        scrollObject.put("direction", "up");
        try {
            driver.executeScript("mobile:swipe", scrollObject);
            Thread.sleep(ANIMATION_TIME); // always allow swipe action to complete
        } catch (Exception e) {
            System.err.println("mobileSwipeScreenIOS(): FAILED\n" + e.getMessage());
            return;
        }

        IOSElement bSignout = vSetting.getViewElement(driver, "SIGNOUT");
        assertTrue("Cannot find Profile button", bSignout != null);
        bSignout.click();
        try {
            Thread.sleep(5000);
        } catch (Exception e) {

        }
    }
}
