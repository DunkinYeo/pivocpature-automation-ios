package app.pivocapture.tests;

import app.pivocapture.views.*;
import io.appium.java_client.ios.IOSElement;
import org.testng.annotations.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class LoginTest extends BaseTest {

    final int ANIMATION_TIME = 200; // ms
    static final HashMap<String, String> scrollObject = new HashMap<String, String>();

    @Test(groups = {"LoginTest"})
    public void verifyLoginWithPivoAccount() {

        VeryFirstView vFirstView = new VeryFirstView();
        IOSElement bSignUp = vFirstView.getViewElement(driver, "SIGN UP");
        assertTrue("Cannot find Sign Up button", bSignUp != null);

        IOSElement bSignIn = vFirstView.getViewElement(driver, "SIGN IN");
        assertTrue("Cannot find Sign In button", bSignIn != null);
        bSignIn.click();

        //Login ID View
        LoginIDView vLogin = new LoginIDView();
        // Click on ID field
        IOSElement sID = vLogin.getViewElement(driver, "ID");
        assertTrue("Cannot find ID Input field", sID != null);
        sID.sendKeys("automated.test@3i.ai");
        IOSElement bContinue = vLogin.getViewElement(driver, "CONTINUE");
        assertTrue("Cannot find Continue button", bContinue != null);
        bContinue.click();

        //Login Password View
        LoginPasswordView vLoginPassword = new LoginPasswordView();
        IOSElement sPassword = vLoginPassword.getViewElement(driver, "PASSWORD");
        assertTrue("Cannot find Password Input field", sPassword != null);
        sPassword.sendKeys("3iDev8593");
        IOSElement bPWContinue = vLoginPassword.getViewElement(driver, "CONTINUE");
        assertTrue("Cannot find Password Continue button", bPWContinue != null);
        bPWContinue.click();

        //Gallery View
        GalleryView vGallery = new GalleryView();
        IOSElement bProfile = vGallery.getViewElement(driver, "PROFILE");
        assertTrue("Cannot find Profile button", bProfile != null);
        bProfile.click();

        //Setting View
        SettingView vSetting = new SettingView();
          //Scroll down (actually up with a finger) to show Sign out button
        scrollObject.put("direction", "up");
        try {
            driver.executeScript("mobile:swipe", scrollObject);
            Thread.sleep(ANIMATION_TIME); // always allow swipe action to complete
        } catch (Exception e) {
            System.err.println("mobileSwipeScreenIOS(): FAILED\n" + e.getMessage());
            return;
        }

        IOSElement bSignout = vSetting.getViewElement(driver, "SIGNOUT");
        assertTrue("Cannot find Profile button", bSignout != null);
        bSignout.click();
    }

    public void verifyLoginWithGoogleAccount() {

        VeryFirstView vFirstView = new VeryFirstView();
        IOSElement bSignUp = vFirstView.getViewElement(driver, "SIGN UP");
        assertTrue("Cannot find Sign Up button", bSignUp != null);

        IOSElement bSignIn = vFirstView.getViewElement(driver, "SIGN IN");
        assertTrue("Cannot find Sign In button", bSignIn != null);
        bSignIn.click();

        //Login ID View
        LoginIDView vLogin = new LoginIDView();
        // Click on ID field
        IOSElement sID = vLogin.getViewElement(driver, "ID");
        assertTrue("Cannot find ID Input field", sID != null);
        sID.sendKeys("automated.test@3i.ai");
        IOSElement bContinue = vLogin.getViewElement(driver, "CONTINUE");
        assertTrue("Cannot find Continue button", bContinue != null);
        bContinue.click();

        //Login Password View
        LoginPasswordView vLoginPassword = new LoginPasswordView();
        IOSElement sPassword = vLoginPassword.getViewElement(driver, "PASSWORD");
        assertTrue("Cannot find Password Input field", sPassword != null);
        sPassword.sendKeys("3iDev8593");
        IOSElement bPWContinue = vLoginPassword.getViewElement(driver, "CONTINUE");
        assertTrue("Cannot find Password Continue button", bPWContinue != null);
        bPWContinue.click();

        //Gallery View
        GalleryView vGallery = new GalleryView();
        IOSElement bProfile = vGallery.getViewElement(driver, "PROFILE");
        assertTrue("Cannot find Profile button", bProfile != null);
        bProfile.click();

        //Setting View
        SettingView vSetting = new SettingView();
        //Scroll down (actually up with a finger) to show Sign out button
        scrollObject.put("direction", "up");
        try {
            driver.executeScript("mobile:swipe", scrollObject);
            Thread.sleep(ANIMATION_TIME); // always allow swipe action to complete
        } catch (Exception e) {
            System.err.println("mobileSwipeScreenIOS(): FAILED\n" + e.getMessage());
            return;
        }

        IOSElement bSignout = vSetting.getViewElement(driver, "SIGNOUT");
        assertTrue("Cannot find Profile button", bSignout != null);
        bSignout.click();
    }
}
