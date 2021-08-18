package app.pivocapture.tests;
import app.pivocapture.views.RegistrationView;
import io.appium.java_client.ios.IOSElement;
import org.testng.annotations.Test;


public class RegistrationTest extends BaseTest {

    @Test (groups = {"RegistrationTest"})
    public void verifyRegistration() {
        RegistrationView register = new RegistrationView();
        String userInputForEmail = "";
        
        IOSElement signUp = register.getViewElement(driver, "SIGNUP");
        signUp.click();
        //create account

        IOSElement email = register.getViewElement(driver, "EMAIL");
        email.sendKeys("t.est" + userInputForEmail + "@3i.ai");
        IOSElement continueR = register.getViewElement(driver, "CONTINUE_BUTTON");
        IOSElement Breturn = register.getViewElement(driver, "RETURN");
        Breturn.click();
        continueR.click();
                            	
                             

        IOSElement firstName = register.getViewElement(driver, "FIRST_NAME");
        firstName.sendKeys("RegistrationTest");
        
        IOSElement lastName = register.getViewElement(driver, "LAST_NAME");
        lastName.sendKeys("Automation");
        
        IOSElement Breturn2 = register.getViewElement(driver, "RETURN");
        Breturn2.click();
        
        IOSElement pswd = register.getViewElement(driver, "PASSWORD");
        pswd.click();

        IOSElement myPassword = register.getViewElement(driver, "MY_PASSWORD");
        myPassword.click();
        //XCUIElementTypeButton[@name="Choose My Own Password"]
        pswd.sendKeys("qwe123");

        IOSElement Breturn3 = register.getViewElement(driver, "RETURN");
        Breturn3.click();
        IOSElement doNotSave = register.getViewElement(driver, "DO_NOT_SAVE");
        doNotSave.click();
        

    }    
        
}

   

