package app.pivocapture.tests;

import app.pivocapture.views.VideoView;

import static org.junit.Assert.*;

import org.openqa.selenium.WebElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class VideoTest extends BaseTest {
    private IOSDriver<WebElement> driver;

    //@Test
    public void verifyVideoUI() {
        
        try {
            /////////////////////////////////
            //Check elements of Library View
            /////////////////////////////////
            VideoView mylib = new VideoView();
            //Check Camera Close button
            IOSElement btnCameraClose = mylib.getViewElement(driver, "CAMERA_CLOSE_BTN");
            assertTrue("Camera Close button not found", btnCameraClose != null);
            //Check Camera Switch button
            IOSElement btnCameraSwitch = mylib.getViewElement(driver, "CAMERA_SWITCH_BTN");
            assertTrue("Camera Switch button not found", btnCameraSwitch != null);
            //Check Record button
            IOSElement btnRecord = mylib.getViewElement(driver, "RECORD_BTN");
            assertTrue("Record button Tab not found", btnRecord != null);
            
        } catch (Exception e) {
            //e.printStackTrace();
            fail("Test is incomplete!");
        }
    }
    
}
