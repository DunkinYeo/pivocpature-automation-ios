package views;

import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import java.time.Duration;

public class LoginView extends BaseView {
    public LoginView(IOSDriver iosDriver) {
        super (iosDriver);
    }


    /***** General Login ******/
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTextField[`value == \"email@example.com\"`]")
    IOSElement emailInput;
    private final String EmailInput = "EmailInput";

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeSecureTextField[`value == \"Password\"`]")
    IOSElement pwInput;
    private final String PwInput = "PwInput";

    @iOSXCUITFindBy(accessibility = "Continue")
    IOSElement continueBtn;
    private final String ContinueBtn = "ContinuewBtn";

    /****** Google Login ****/
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Pivo+\"]/XCUIElementTypeWindow/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[3]")
    IOSElement googleBtn;
    private final String GoogleBtn = "GoogleBtn";

    @iOSXCUITFindBy(accessibility = "Test 3i test@3i.ai")
    IOSElement test3iBtn;
    private final String Test3iBtn = "Test3iBtn";


    /***** Facebook Login ******/
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Pivo+\"]/XCUIElementTypeWindow/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]")
    IOSElement facebookBtn;
    private final String FacebookBtn = "FacebookBtn";

    //@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Open\"]")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Open\"`]")
    IOSElement fbOpenBtn;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Cancel\"`][2]")
    IOSElement fbCloseBtn;

    @iOSXCUITFindBy(accessibility = "Continue")
    IOSElement fBcontinueBtn;
    private final String FBcontinueBtn = "FBcontinueBtn";


    /******* Apple Login ******/
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Pivo+\"]/XCUIElementTypeWindow/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[2]")
    IOSElement appleBtn;
    private final String AppleBtn = "AppleBtn";

    @iOSXCUITFindBy(accessibility = "Continue with Passcode")
    IOSElement continuePasscodeBtn;


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
            case Test3iBtn:
                element = waitAndReturn(test3iBtn);
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

    public void clickGoogleTest3i(){
        click(test3iBtn);
    }

    public void clickFacebookBtn() {
        click(facebookBtn);
    }

    public void clickFBOpenBtn() {
        click(fbOpenBtn);
    }
    public void clickFBContinueBtn() {
        click(fBcontinueBtn);
    }

    public void clickAppleBtn() {
        click(appleBtn);
    }

    public void clickAppleContinueBtn() {
        click(continuePasscodeBtn);
    }

    public void tapByCoordinates(int x, int y) {

        new TouchAction(driver)
                .tap(PointOption.point(x,y))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).perform();
    }


}
