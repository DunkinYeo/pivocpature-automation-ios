package app.pivocapture.tests;

import app.pivocapture.views.LibraryView;

import io.appium.java_client.ios.IOSElement;

import org.testng.annotations.Test;
import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LibraryTest extends BaseTest {
    //private IOSDriver<WebElement> driver;

    @Test (groups = {"LibraryTest"})
    public void verifyLibraryUI() {
        
        try {
            /////////////////////////////////
            //Check elements of Library View
            /////////////////////////////////
            LibraryView mylib = new LibraryView();
            //Check view title ("Library")
            IOSElement txtViewTitle = mylib.getViewElement(driver, "LIBRARY_TITLE");
            assertTrue("View Title not found", txtViewTitle != null);
        //System.out.println("Title");
            //Check 'All' Tab
            IOSElement txtAllTab = mylib.getViewElement(driver, "ALL_TAB");
            assertTrue("'All' Tab not found", txtAllTab != null);
        //System.out.println("All tab");
            //Check 'Videos' Tab
            IOSElement txtVideosTab = mylib.getViewElement(driver, "VIDEOS_TAB");
            assertTrue("'Videos' Tab not found", txtVideosTab != null);
        //System.out.println("Video tab");
            //Check 'Photos' Tab
            IOSElement txtPhotosTab = mylib.getViewElement(driver, "PHOTOS_TAB");
            assertTrue("'Photos' Tab not found", txtPhotosTab != null);
        //System.out.println("Photo tab");
            //Check Record button
            IOSElement btnGotoCapture = mylib.getViewElement(driver, "GOTO_CAPTURE_BTN");
            assertTrue("'Goto Capture' button not found", btnGotoCapture != null);

        } catch (Exception e) {
            e.printStackTrace();
            fail("Test is incomplete!");
        }
    }

    @Test (groups = {"LibraryTest"}, dependsOnMethods = {"verifyLibraryUI"})
    public void verifyLibraryFilter() {
        try {
            /////////////////////////////////
            //Check Library Filter (All/Videos/Photos)
            /////////////////////////////////
            LibraryView mylib = new LibraryView();
            //Check 'Videos' Tab
            IOSElement txtVideosTab = mylib.getViewElement(driver, "VIDEOS_TAB");
            txtVideosTab.click();
            //Assert to be added
            //
            //Check 'Photos' Tab
            IOSElement txtPhotosTab = mylib.getViewElement(driver, "PHOTOS_TAB");
            txtPhotosTab.click();
            //Assert to be added
            //
            //Check 'All' Tab
            IOSElement txtAllTab = mylib.getViewElement(driver, "ALL_TAB");
            txtAllTab.click();
            //Assert to be added
            //
            
        } catch (Exception e) {
            e.printStackTrace();
            fail("Test is incomplete!");
        }
    }

    public String getCurrntDateTime() {
        SimpleDateFormat dateFormat = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss");
        Date time = new Date();
        String curentDateTime = dateFormat.format(time);
        return curentDateTime;
    }
    
        
}
