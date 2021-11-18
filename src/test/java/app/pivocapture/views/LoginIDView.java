package app.pivocapture.views;

import app.pivocapture.library.TestLibrary;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.WebElement;

public class LoginIDView extends TestLibrary {

    private final int SECOND60 = 60;

    private final String FD_EMAIL_ADDRESS = "ID";
    private final String CI_EMAIL_ADDRESS = "**/XCUIElementTypeTextField[`value == \"email@example.com\"`]";
    private final String BTN_CONTINUE = "CONTINUE";
    private final String AI_BTN_CONTINUE = "Continue";
    private final String BTN_GOOGLE_LOGIN = "GOOGLE_LOGIN";
    private final String XP_GOOGLE_LOGIN = "//XCUIElementTypeApplication[@name=\"Pivo+\"]/XCUIElementTypeWindow/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[3]";
    private final String BTN_APPLE_LOGIN = "APPLE_LOGIN";
    private final String XP_APPLE_LOGIN = "//XCUIElementTypeApplication[@name=\"Pivo+\"]/XCUIElementTypeWindow/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[2]";
    private final String BTN_FB_LOGIN = "FB_LOGIN";
    private final String XP_FB_LOGIN = "//XCUIElementTypeApplication[@name=\"Pivo+\"]/XCUIElementTypeWindow/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]";

    public IOSElement getViewElement(IOSDriver<WebElement> driver, String elementText) {

        IOSElement element = null;
        switch (elementText) {
            case FD_EMAIL_ADDRESS:
                element = findElementByClassChainIDWithWait(driver, SECOND60, CI_EMAIL_ADDRESS);
                break;
            case BTN_CONTINUE:
                element = findElementByAccessibilityIDWithWait(driver, SECOND60, AI_BTN_CONTINUE);
                break;
            case BTN_GOOGLE_LOGIN:
                element = findElementByXpathWithWait(driver, SECOND60, XP_GOOGLE_LOGIN);
                break;
            case BTN_APPLE_LOGIN:
                element = findElementByXpathWithWait(driver, SECOND60, XP_APPLE_LOGIN);
                break;
            case BTN_FB_LOGIN:
                element = findElementByXpathWithWait(driver, SECOND60, XP_FB_LOGIN);
                break;
        }
        return element;
    }

}
