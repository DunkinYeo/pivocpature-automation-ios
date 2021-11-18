package app.pivocapture.views;

import app.pivocapture.library.TestLibrary;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.WebElement;

public class VeryFirstView extends TestLibrary {

    private final int SECOND60 = 60;

    private final String BTN_SIGNUP = "SIGN UP";
    private final String AC_BTN_SIGNUP = "Sign Up";
    private final String BTN_SIGNIN = "SIGN IN";
    private final String CI_BTN_SIGNIN = "**/XCUIElementTypeStaticText[`label == \"Already registered? Sign In \"`]";

    public IOSElement getViewElement(IOSDriver<WebElement> driver, String elementText) {

        IOSElement element = null;
        switch (elementText) {
            case BTN_SIGNUP:
                element = findElementByAccessibilityIDWithWait(driver, SECOND60, AC_BTN_SIGNUP);
                break;
            case BTN_SIGNIN:
                element = findElementByClassChainIDWithWait(driver, SECOND60, CI_BTN_SIGNIN);
                break;
        }
        return element;
    }
}
