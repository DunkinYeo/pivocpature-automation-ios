package views;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class LoginView extends BaseView {
    public LoginView(IOSDriver iosDriver) {
        super (iosDriver);
    }

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTextField[`value == \"email@example.com\"`]")
    IOSElement emailInput;
    private final String EmailInput = "EmailInput";

    @iOSXCUITFindBy(accessibility = "Continue")
    IOSElement continueBtn;
    private final String ContinueBtn = "ContinuewBtn";

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Pivo+\"]/XCUIElementTypeWindow/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[3]")
    IOSElement googleBtn;
    private final String GoogleBtn = "GoogleBtn";

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Pivo+\"]/XCUIElementTypeWindow/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]")
    IOSElement facebookBtn;
    private final String FacebookBtn = "FacebookBtn";

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Pivo+\"]/XCUIElementTypeWindow/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[2]")
    IOSElement appleBtn;
    private final String AppleBtn = "AppleBtn";

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeSecureTextField[`value == \"Password\"`]")
    IOSElement pwInput;
    private final String PwInput = "PwInput";

    public IOSElement getViewElement(String elementText) {

        IOSElement element = null;
        switch (elementText) {
            case EmailInput:
                element = waitAndReturn(emailInput);
                break;
            case ContinueBtn:
                element = waitAndReturn(continueBtn);
                break;
            case PwInput:
                element = waitAndReturn(pwInput);
                break;
            case GoogleBtn:
                element = waitAndReturn(googleBtn);
                break;
            case FacebookBtn:
                element = waitAndReturn(facebookBtn);
                break;
            case AppleBtn:
                element = waitAndReturn(appleBtn);
                break;
        }
        return element;
    }


    public void enterId(String text) {
        clear(emailInput);
        sendText(emailInput, text);
    }

    public void clickContinueBtn() {
        click(continueBtn);
    }

    public void enterPW(String text) {
        clear(pwInput);
        sendText(pwInput, text);
    }

    public void clickGoogleBtn() {
        click(googleBtn);
    }

    public void clickFacebookBtn() {
        click(facebookBtn);
    }

    public void clickAppleBtn() {
        click(appleBtn);
    }


}
