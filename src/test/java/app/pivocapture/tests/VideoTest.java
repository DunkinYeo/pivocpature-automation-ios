package app.pivocapture.tests;

import app.pivocapture.views.LibraryView;
import app.pivocapture.views.VideoView;

import static org.junit.Assert.*;

import org.testng.annotations.Test;
import io.appium.java_client.ios.IOSElement;

public class VideoTest extends BaseTest {
    //private IOSDriver<WebElement> driver;

    //@Test(groups = {"VideoTest"})
    public void verifyVideoUI() {
        
        try {
        System.out.println("VideoTest starting...");
            LibraryView mylib = new LibraryView();
            System.out.println("Created library class...");
            IOSElement btnGotoCapture = mylib.getViewElement(driver, "GOTO_CAPTURE_BTN");
            System.out.println("Get record button......");
            btnGotoCapture.click();
            /////////////////////////////////
            //Check elements of Video View
            /////////////////////////////////
            System.out.println("VideoView starting...");
            VideoView myvid = new VideoView();
            //Check Camera Close button
            IOSElement btnCameraClose = myvid.getViewElement(driver, "CAMERA_CLOSE_BTN");
            assertTrue("Camera Close button not found", btnCameraClose != null);
            //Check Camera Switch button
            IOSElement btnCameraSwitch = myvid.getViewElement(driver, "CAMERA_SWITCH_BTN");
            assertTrue("Camera Switch button not found", btnCameraSwitch != null);
            //Check Record button
            IOSElement btnRecord = myvid.getViewElement(driver, "RECORD_BTN");
            assertTrue("Record button Tab not found", btnRecord != null);
            
        } catch (Exception e) {
            //e.printStackTrace();
            fail("Test is incomplete!");
        }
    }
    
}
