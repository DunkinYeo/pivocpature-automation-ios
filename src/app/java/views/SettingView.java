package views;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class SettingView extends BaseView {
    public SettingView(IOSDriver iosDriver) {
        super(iosDriver);
    }

    @iOSXCUITFindBy(accessibility = "Sign out")
    IOSElement signOutBtn;
    private final String SignOutBtn = "SignOutBtn";

    public IOSElement getViewElement(String elementText) {

        IOSElement element = null;

        switch(elementText) {
            case SignOutBtn:
                element = waitAndReturn(signOutBtn);
            break;
        }
        return element;
    }

    public void clickSignOutBtn() {
        scrollScreen("up");
        click(signOutBtn);
    }
}
