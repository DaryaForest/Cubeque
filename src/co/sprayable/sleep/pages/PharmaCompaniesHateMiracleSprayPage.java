package co.sprayable.sleep.pages;

import qa.util.base.BasePage;
import qa.util.base.Locator;
import qa.util.base.LocatorTypes;

public class PharmaCompaniesHateMiracleSprayPage extends BasePage {
    private Locator middleBuySpray = new Locator(LocatorTypes.XPATH, "//div[@data-widget-id='6b8abc36-0f62-5dd6-e483-0c086298cfaa']//div/a");
    private Locator footerBuySpray = new Locator(LocatorTypes.XPATH, "//div[@data-widget-id='acf2dc03-2e79-11db-d38a-6902d0a7cdda']//div/a");


    public void middlePageScrollDown(){
        scrollToElement("scrolling to the middle page button", middleBuySpray);
        click("click  middle page button", middleBuySpray);
    }

    public void footerPageScrollDown(){
        scrollToElement("scrolling to the footer page button", footerBuySpray);
        waitToBeClickable("wait for footer button became clicable", footerBuySpray);
        click("click footer button", footerBuySpray);
    }

}
