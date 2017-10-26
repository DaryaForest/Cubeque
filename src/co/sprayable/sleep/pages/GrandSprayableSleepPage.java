package co.sprayable.sleep.pages;

import qa.util.base.BasePage;
import qa.util.base.Locator;
import qa.util.base.LocatorTypes;

/**
 * Created by user on 1/20/17.
 */
public class GrandSprayableSleepPage extends BasePage {
    //TODO locator
    private Locator middleBuySpray = new Locator(LocatorTypes.XPATH, "//div[@class='lp-button-react-wrapper']/a[contains(@class, 'w-6b8abc36-0f62-5dd6-e483-0c086298cfaa')]");
    private Locator footerBuyItNow = new Locator(LocatorTypes.XPATH, "//div[@class='lp-button-react-wrapper']/a[contains(@class, 'w-acf2dc03-2e79-11db-d38a-6902d0a7cdda')]");
    private Locator linkBuyNow = new Locator(LocatorTypes.XPATH, "//div[@class='buttons']/a[contains(@class, 'js_orderButton')]");

    public void scrollToMiddleBuySpray(){
        scrollToElement("scrolling to the middle page button", middleBuySpray);
        waitToBeClickable("wait for 'Click here to buy Sprayble today' button",middleBuySpray);
        click("click  middle page button", middleBuySpray);
    }

    public void scrollToFooterBuyItNow(){
        scrollToElement("scrolling to the middle page button", footerBuyItNow);
        waitToBeClickable("wait for 'Click here to buy Sprayble today' button",footerBuyItNow);
        click("click  middle page button", footerBuyItNow);
    }


}
