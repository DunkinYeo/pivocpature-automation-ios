package app.pivocapture.views;

import app.pivocapture.library.TestLibrary;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.WebElement;

public class AppleLoginPasswordView extends TestLibrary {

    private final int SECOND60 = 60;

    private final String BTN_CONTINUE_WITH_PASSCODE = "CONTINUE_WITH_PASSCODE";
    private final String AI_BTN_CONTINUE_WITH_PASSCODE = "Continue with Passcode";

    public IOSElement getViewElement(IOSDriver<WebElement> driver, String elementText) {

        IOSElement element = null;
        switch (elementText) {
            case BTN_CONTINUE_WITH_PASSCODE:
                element = findElementByAccessibilityIDWithWait(driver, SECOND60, AI_BTN_CONTINUE_WITH_PASSCODE);
                break;
        }
        return element;
    }
}
