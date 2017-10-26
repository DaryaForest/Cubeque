package co.sprayable.sleep.pages;

import org.openqa.selenium.JavascriptExecutor;
import qa.util.base.BasePage;
import qa.util.base.Locator;
import qa.util.base.LocatorTypes;
import qa.util.reporting.Reporter;

public class SpecialOrderPage extends BasePage {
    private Locator footerBuyItNow = new Locator(LocatorTypes.XPATH, "//div[@class='lp-button-react-wrapper']/a[contains(@class, 'w-6b8abc36-0f62-5dd6-e483-0c086298cfaa')]");
    private Locator middleBuySpray  = new Locator(LocatorTypes.XPATH, "//div[@class='lp-button-react-wrapper']/a[contains(@class, 'w-acf2dc03-2e79-11db-d38a-6902d0a7cdda')]");


    private Locator liveALongerBut = new Locator(LocatorTypes.XPATH, "//div[@class='lp-button-react-wrapper']/a[contains(@class, 'w-ba4fcf6e-ef0b-42d8-39dc-369b84b15876')]");
    private Locator cleanseYourCircadianRhythmBut = new Locator(LocatorTypes.XPATH, "//div[@class='lp-button-react-wrapper']/a[contains(@class, 'w-4f270dfc-b34d-9d2f-b1ad-ff992b0994ea')]");

    private Locator clickHereToGetTheCircadianCleanseBut = new Locator(LocatorTypes.XPATH, "//div[@class='lp-button-react-wrapper']/a[contains(@class, 'w-6b8abc36-0f62-5dd6-e483-0c086298cfaa')]");

    public void scrollToClickHereToGetTheCircadianCleanseBut(){
        scrollToElement("scrolling to the middle page button", clickHereToGetTheCircadianCleanseBut);
        waitToBeClickable("wait for 'Click here to buy Sprayble today' button",clickHereToGetTheCircadianCleanseBut);
        click("click  middle page button", clickHereToGetTheCircadianCleanseBut);
    }

    public void scrollToLiveALongerBut(){
        scrollToElement("scrolling to the middle page button", liveALongerBut);
        waitToBeClickable("wait for 'Click here to buy Sprayble today' button",liveALongerBut);
        click("click  middle page button", liveALongerBut);
    }

    public void scrollToCleanseYourCircadianRhythmBut(){
        scrollToElement("scrolling to the middle page button", cleanseYourCircadianRhythmBut);
        waitToBeClickable("wait for 'Click here to buy Sprayble today' button",cleanseYourCircadianRhythmBut);
        click("click  middle page button", cleanseYourCircadianRhythmBut);
    }

    /*private Locator divReadyToTrySprayable = new Locator(LocatorTypes.XPATH, "//div[@class='buttons']/div[contains(@class, 'btnBuy ')]");
    private Locator linkBuyNow = new Locator(LocatorTypes.XPATH, "//div[@class='buttons']/a[contains(@class, 'js_orderButton')]");

    public void moveToReadyToTrySprayable() {
        Reporter.logAction("Scrolling page to 'Ready To Try Sprayable' link");

        JavascriptExecutor je = (JavascriptExecutor) driver();
        je.executeScript("arguments[0].scrollIntoView(true);", driver().findElement(divReadyToTrySprayable.getLocator()));
    }

    public void clickReadyToTrySprayable() {
        click("click div 'Im Ready To Try Sprayable'", divReadyToTrySprayable);
    }

    public void clickLinkBuyNow() {
        waitToBeClickable("waiting for link 'Buy Now' become clickable", linkBuyNow);
        click("click link 'Buy Now'", linkBuyNow);
    }

    public void waitReadyToTrySprayableDisappear() {
        waitForInvisibility("waiting for div 'Im Ready To Try Sprayable' disappear", divReadyToTrySprayable);
    }*/
}