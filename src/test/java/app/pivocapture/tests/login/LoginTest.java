package app.pivocapture.tests.login;

import app.pivocapture.library.TestLibrary;
import app.pivocapture.tests.BaseTest;
import app.pivocapture.views.*;
import io.appium.java_client.ios.IOSElement;
import org.junit.Assert;
import org.testng.annotations.Test;
import views.FirstView;
import views.GalleryView;
import views.LoginView;
import views.SettingView;

import static org.junit.Assert.*;

public class LoginTest extends BaseTest {

    FirstView firstView;
    LoginView loginView;
    GalleryView galleryView;
    SettingView settingView;


    /*
    * Refactored by George at Mar 2, 2022
    *
    * will keep the previous test script for now.
    * */

    @Test
    public void loginPivoAccount() {
        firstView = new FirstView(driver);
        loginView = new LoginView(driver);
        galleryView = new GalleryView(driver);
        settingView = new SettingView(driver);

        firstView.clickSignInBtn();
        loginView.enterId("automated.test@3i.ai");
        loginView.clickContinueBtn();
        loginView.enterPW("3iDev8593");
        loginView.clickContinueBtn();

        IOSElement galleryTxt = galleryView.getViewElement("GalleryTxt");
        Assert.assertTrue("Failed to Redirect to GalleryView", galleryTxt != null);

        galleryView.clickSettingBtn();

        settingView.clickSignOutBtn();

        IOSElement signInBtn = firstView.getViewElement("SignInBtn");
        Assert.assertTrue("Failed to Redirect to First View", signInBtn != null);
    }


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
        IOSElement btnGoogleLogin = vLogin.getViewElement(driver, "GOOGLE_LOGIN");
        assertTrue("Cannot find Google Login button", btnGoogleLogin != null);
        btnGoogleLogin.click();

        //Google pop-up
        driver.switchTo().alert().accept();

        //Google Choose an account view
        GoogleChooseAccountView vGAccount = new GoogleChooseAccountView();
        IOSElement btnGAccount = vGAccount.getViewElement(driver, "TEST3I");
        assertTrue("Cannot find Google Login button", btnGAccount != null);
        btnGAccount.click();

        //Sign out
        TestLibrary tLib = new TestLibrary();
        try {
            tLib.signOut(driver);
        } catch (Exception e) {
            fail("Sign out fail!");
        }
    }

/*
    //On hold due to it looks impossible atm (Nov 18)
    //@Test(groups = {"LoginTest"})
    public void verifyLoginWithFBAccount() {

        VeryFirstView vFirstView = new VeryFirstView();
        IOSElement bSignUp = vFirstView.getViewElement(driver, "SIGN UP");
        assertTrue("Cannot find Sign Up button", bSignUp != null);

        IOSElement bSignIn = vFirstView.getViewElement(driver, "SIGN IN");
        assertTrue("Cannot find Sign In button", bSignIn != null);
        bSignIn.click();

        //Login ID View
        LoginIDView vLogin = new LoginIDView();
        // Click on ID field
        IOSElement btnFBLogin = vLogin.getViewElement(driver, "FB_LOGIN");
        assertTrue("Cannot find FaceBook Login button", btnFBLogin != null);
        btnFBLogin.click();

        //FB Alert
        driver.switchTo().alert().accept();
        try {
            Thread.sleep(5000);
        } catch (Exception e) {}

        //Google Choose an account view
        FBLoginView vFBLogin = new FBLoginView();
        //FB "Open in Facebook" app? modal"

        IOSElement btnContinue = vFBLogin.getViewElement(driver, "CONTINUE");
        assertTrue("Cannot find Facebook Login Continue buton", btnContinue != null);
        btnContinue.click();

        //Sign out
        TestLibrary tLib = new TestLibrary();
        try {
            tLib.signOut(driver);
        } catch (Exception e) {
            fail("Sign out fail!");
        }
    }

    //On hold (Nov 18)
    //@Test(groups = {"LoginTest"})
    public void verifyLoginWithAppleAccount() {

        VeryFirstView vFirstView = new VeryFirstView();
        IOSElement bSignUp = vFirstView.getViewElement(driver, "SIGN UP");
        assertTrue("Cannot find Sign Up button", bSignUp != null);

        IOSElement bSignIn = vFirstView.getViewElement(driver, "SIGN IN");
        assertTrue("Cannot find Sign In button", bSignIn != null);
        bSignIn.click();

        //Login ID View
        LoginIDView vLogin = new LoginIDView();
        // Click on ID field
        IOSElement btnAppleLogin = vLogin.getViewElement(driver, "GOOGLE_LOGIN");
        assertTrue("Cannot find Apple Login button", btnAppleLogin != null);
        btnAppleLogin.click();

        //Apple Continue with passcode
        GoogleChooseAccountView vGAccount = new GoogleChooseAccountView();
        IOSElement btnGAccount = vGAccount.getViewElement(driver, "TEST3I");
        assertTrue("Cannot find Google Login button", btnGAccount != null);
        btnGAccount.click();
        //

        //Sign out
        TestLibrary tLib = new TestLibrary();
        try {
            tLib.signOut(driver);
        } catch (Exception e) {
            fail("Sign out fail!");
        }
    }
 */
}