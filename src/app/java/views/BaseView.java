package views;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;

public class BaseView {
    protected IOSDriver driver;
    protected WebDriverWait wait;

    static final HashMap<String, String> scrollObject = new HashMap<String, String>();
    final int ANIMATION_TIME = 2000; // ms

    public BaseView(IOSDriver iosDriver){
        this.driver = iosDriver;
        this.wait = new WebDriverWait(this.driver, 60, 1000);
        PageFactory.initElements(new AppiumFieldDecorator(iosDriver), this);
    }

    public void waitForVisibility(IOSElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForClickable(IOSElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public IOSElement waitAndReturn(IOSElement element) {
        waitForVisibility(element);
        return element;
    }

//    public IOSElement getViewElement(IOSElement element, String elementText) {
//        waitForVisibility(element);
//        return element;
//    }

    public void clear(IOSElement element) {
        waitForVisibility(element);
        element.clear();
    }

    public void click(IOSElement element) {
        waitForVisibility(element);
        element.click();
    }

    public void waitAndClick(IOSElement element) {
        waitForClickable(element);
        element.click();
    }

    public void sendText(IOSElement element, String text) {
        waitForVisibility(element);
        element.sendKeys(text);
    }

    public String getAttribute(IOSElement element, String attribute) {
        waitForVisibility(element);
        return element.getAttribute(attribute);
    }

    /*********Scroll Screen******/

    //driection parameter types will allow 'up, down, left, right'
    public void scrollScreen(String direction) {
        scrollObject.put("direction", direction);

        try {
            driver.executeScript("mobile:swipe", scrollObject);
            Thread.sleep(ANIMATION_TIME); // always allow swipe action to complete
        } catch (Exception e) {
            System.err.println("mobileSwipeScreenIOS(): FAILED\n" + e.getMessage());
            return;
        }
    }





}
