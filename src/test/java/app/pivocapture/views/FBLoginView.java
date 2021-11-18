package app.pivocapture.views;

import app.pivocapture.library.TestLibrary;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.WebElement;

public class FBLoginView extends TestLibrary {

    private final int SECOND60 = 60;

    private final String BTN_CONTINUE = "CONTINUE";
    private final String AI_BTN_CONTINUE = "Continue";

    public IOSElement getViewElement(IOSDriver<WebElement> driver, String elementText) {

        IOSElement element = null;
        switch (elementText) {
            case BTN_CONTINUE:
                element = findElementByAccessibilityIDWithWait(driver, SECOND60, AI_BTN_CONTINUE);
                break;
        }
        return element;
    }
}
