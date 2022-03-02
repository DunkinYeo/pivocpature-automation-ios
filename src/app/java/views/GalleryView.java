package views;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class GalleryView extends BaseView{
    public GalleryView(IOSDriver iosDriver) {
        super (iosDriver);
    }

    @iOSXCUITFindBy(accessibility = "Gallery")
    IOSElement galleryTxt;
    private final String GalleryTxt = "GalleryTxt";

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeButton")
    IOSElement settingBtn;
    private final String SettingBtn = "SettingBtn";



    /* TODO
    * All
    * Videos
    * photos
    * home
    * explore
    * plusBtn
    * First content
    * thumnail
    * thumnail image
    * thumnail numeric
    * */



    public IOSElement getViewElement(String elementText) {

        IOSElement element = null;
        switch (elementText) {
            case SettingBtn:
                element = waitAndReturn(settingBtn);
                break;
            case GalleryTxt:
                element = waitAndReturn(galleryTxt);
                break;
        }
        return element;
    }

    public void clickSettingBtn() {
        waitAndClick(settingBtn);
    }

}
