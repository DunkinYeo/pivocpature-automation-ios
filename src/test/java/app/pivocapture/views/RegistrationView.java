package app.pivocapture.views;

import app.pivocapture.library.TestLibrary;

import org.openqa.selenium.WebDriver;
import io.appium.java_client.ios.IOSElement;

public class RegistrationView extends TestLibrary {
    private final String emailXpath = "//XCUIElementTypeApplication[@name='Pivo+']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField";
    private final String xcodeField = "//XCUIElementTypeApplication[@name='Pivo+']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[";
    private final String secondHalf = "]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField";

    private final int SECOND30 = 30;
    //private final int SECOND60 = 60;

    private final String SIGNUP = "SIGNUP";
    private final String EMAIL = "EMAIL";
    private final String CONTINUE_BUTTON = "CONTINUE_BUTTON";
    private final String RETURN = "RETURN";
    private final String FIRST_NAME = "FIRST_NAME";
    private final String LAST_NAME = "LAST_NAME";
    private final String PASSWORD = "PASSWORD";
    private final String MY_PASSWORD = "MY_PASSWORD";
    private final String DO_NOT_SAVE = "DO_NOT_SAVE";

    private final String LOC_SIGNUP = "Sign up";
    private final String LOC_EMAIL = emailXpath;
    private final String LOC_CONTINUE_BUTTON = "Continue";
    private final String LOC_RETURN = "Return";
    private final String LOC_FIRST_NAME = xcodeField + 1 + secondHalf;
    private final String LOC_LAST_NAME = xcodeField + 2 + secondHalf;
    private final String LOC_PASSWORD = xcodeField + "4]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeSecureTextField";
    private final String LOC_MY_PASSWORD = "//XCUIElementTypeButton[@name='Choose My Own Password']";
    private final String LOC_DO_NOT_SAVE = "Not Now";
    
    public IOSElement getViewElement(WebDriver driver, String elementText) {

        IOSElement element = null;

        switch (elementText) {
            case SIGNUP: element = findElementByAccessibilityIDWithWait(driver, SECOND30, LOC_SIGNUP); break;
            case EMAIL: element = findElementByXpathWithWait(driver, SECOND30, LOC_EMAIL); break;
            case CONTINUE_BUTTON: element = findElementByAccessibilityIDWithWait(driver, SECOND30, LOC_CONTINUE_BUTTON); break;
            case RETURN: element = findElementByAccessibilityIDWithWait(driver, SECOND30, LOC_RETURN); break;
            case FIRST_NAME: element = findElementByXpathWithWait(driver, SECOND30, LOC_FIRST_NAME); break;
            case LAST_NAME: element = findElementByXpathWithWait(driver, SECOND30, LOC_LAST_NAME); break;
            case PASSWORD: element = findElementByXpathWithWait(driver, SECOND30, LOC_PASSWORD); break;
            case MY_PASSWORD: element = findElementByXpathWithWait(driver, SECOND30, LOC_MY_PASSWORD); break;
            case DO_NOT_SAVE: element = findElementByAccessibilityIDWithWait(driver, SECOND30, LOC_DO_NOT_SAVE); break;
        }
        return element;
    }



}