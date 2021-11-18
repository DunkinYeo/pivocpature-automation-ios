package app.pivocapture.views;

import app.pivocapture.library.TestLibrary;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.WebElement;

public class GoogleChooseAccountView extends TestLibrary {

    private final int SECOND60 = 60;

    private final String BTN_ACCOUNT_TEST3I = "TEST3I";
    private final String AI_BTN_ACCOUNT_TEST3I = "Test 3i test@3i.ai";

    public IOSElement getViewElement(IOSDriver<WebElement> driver, String elementText) {

        IOSElement element = null;
        switch (elementText) {
            case BTN_ACCOUNT_TEST3I:
                element = findElementByAccessibilityIDWithWait(driver, SECOND60, AI_BTN_ACCOUNT_TEST3I);
                break;
        }
        return element;
    }
}
