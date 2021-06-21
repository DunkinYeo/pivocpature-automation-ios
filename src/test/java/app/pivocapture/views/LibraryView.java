package app.pivocapture.views;

import app.pivocapture.library.TestLibrary;

import org.openqa.selenium.WebDriver;
import io.appium.java_client.ios.IOSElement;

public class LibraryView extends TestLibrary {

    private final int SECOND30 = 30;
    //private final int SECOND60 = 60;

    private final String LIBRARY_TITLE = "LIBRARY_TITLE";
    private final String ALL_TAB = "ALL_TAB";
    private final String VIDEOS_TAB = "VIDEOS_TAB";
    private final String PHOTOS_TAB = "PHOTOS_TAB";

    private final String LOC_LIBRARY_TITLE = "Library";
    private final String LOC_ALL_TAB = "All";
    private final String LOC_VIDEOS_TAB = "Vedios";
    private final String LOC_PHOTOS_TAB = "Photos";
    
    public IOSElement getViewElement(WebDriver driver, String elementText) {

        IOSElement element = null;

        switch (elementText) {
            case LIBRARY_TITLE: element = findElementByAccessibilityIDWithWait(driver, SECOND30, LOC_LIBRARY_TITLE); break;
            case ALL_TAB: element = findElementByAccessibilityIDWithWait(driver, SECOND30, LOC_ALL_TAB); break;
            case VIDEOS_TAB: element = findElementByAccessibilityIDWithWait(driver, SECOND30, LOC_VIDEOS_TAB); break;
            case PHOTOS_TAB: element = findElementByAccessibilityIDWithWait(driver, SECOND30, LOC_PHOTOS_TAB); break;
        }
        return element;
    }


}