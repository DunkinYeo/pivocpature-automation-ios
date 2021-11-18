package app.pivocapture.tests;

import app.pivocapture.library.TestLibrary;
import app.pivocapture.views.*;
import io.appium.java_client.ios.IOSElement;
import org.testng.annotations.Test;

import static org.junit.Assert.*;

public class LoginTest extends BaseTest {

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

        //Sign out
        TestLibrary tLib = new TestLibrary();
        try {
            tLib.signOut(driver);
        } catch (Exception e) {
            fail("Sign out fail!");
        }

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

    }
}
