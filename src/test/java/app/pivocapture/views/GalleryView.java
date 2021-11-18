package app.pivocapture.views;

import app.pivocapture.library.TestLibrary;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.WebElement;

public class GalleryView extends TestLibrary {

    private final int SECOND60 = 60;

    private final String BTN_PROFILE = "PROFILE";
    private final String CI_PROFILE = "//XCUIElementTypeApplication[@name='Pivo+']/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]";

    //**/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeButton
    public IOSElement getViewElement(IOSDriver<WebElement> driver, String elementText) {

        IOSElement element = null;
        switch (elementText) {
            case BTN_PROFILE:
                element = findElementByXpathWithWait(driver, SECOND60, CI_PROFILE);
                break;
        }
        return element;
    }
}
