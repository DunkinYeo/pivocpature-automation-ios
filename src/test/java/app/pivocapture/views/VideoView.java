package app.pivocapture.views;

import app.pivocapture.library.TestLibrary;

import org.openqa.selenium.WebDriver;
import io.appium.java_client.ios.IOSElement;

public class VideoView extends TestLibrary {

    private final int SECOND30 = 30;

    private final String CAMERA_CLOSE_BTN = "CAMERA_CLOSE_BTN";
    private final String CAMERA_SWITCH_BTN = "CAMERA_SWITCH_BTN";
    private final String RECORD_BTN = "RECORD_BTN";

    private final String LOC_CAMERA_CLOSE_BTN = "captureCameraClose";
    private final String LOC_CAMERA_SWITCH_BTN = "captureCameraSwitch";
    private final String LOC_RECORD_BTN = "//XCUIElementTypeApplication[@name='Pivo Capture']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/"
                                        + "XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/"
                                        + "XCUIElementTypeOther[3]/XCUIElementTypeButton[2]";

    public IOSElement getViewElement(WebDriver driver, String elementText) {

        IOSElement element = null;

        switch (elementText) {
            case CAMERA_CLOSE_BTN: element = findElementByAccessibilityIDWithWait(driver, SECOND30, LOC_CAMERA_CLOSE_BTN); break;
            case CAMERA_SWITCH_BTN: element = findElementByAccessibilityIDWithWait(driver, SECOND30, LOC_CAMERA_SWITCH_BTN); break;
            case RECORD_BTN: element = findElementByXpathWithWait(driver, SECOND30, LOC_RECORD_BTN); break;
        }
        return element;
    }
    
}
