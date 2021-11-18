package app.pivocapture.views;

import app.pivocapture.library.TestLibrary;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.WebElement;

public class SettingView extends TestLibrary {

    private final int SECOND60 = 60;

    private final String BTN_SIGNOUT = "SIGNOUT";
    private final String AI_SIGNOUT= "Sign out";

    public IOSElement getViewElement(IOSDriver<WebElement> driver, String elementText) {

        IOSElement element = null;
        switch (elementText) {
            case BTN_SIGNOUT:
                element = findElementByAccessibilityIDWithWait(driver, SECOND60, AI_SIGNOUT);
                break;
        }
        return element;
    }
}
