package views;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class FirstView extends BaseView {
    public FirstView(IOSDriver iosDriver) {
        super (iosDriver);
    }


    @iOSXCUITFindBy(accessibility = "Sign Up")
    IOSElement signUpBtn;
    private final String SignUpBtn = "SignUpBtn";

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Already registered? Sign In\"`]")
    IOSElement signInBtn;
    private final String SignInBtn = "SignInBtn";

    public IOSElement getViewElement(String elementText) {

        IOSElement element = null;
        switch (elementText) {
            case SignUpBtn:
                element = waitAndReturn(signUpBtn);
                break;
            case SignInBtn:
                element = waitAndReturn(signInBtn);
                break;
        }
        return element;
    }

    public void clickSignUpBtn(){
        click(signInBtn);
    }

    public void clickSignInBtn(){
        click(signInBtn);
    }

}
