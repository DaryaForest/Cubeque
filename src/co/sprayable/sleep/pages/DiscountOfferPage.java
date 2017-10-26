package co.sprayable.sleep.pages;

import qa.util.base.BasePage;
import qa.util.base.Locator;
import qa.util.base.LocatorTypes;

public class DiscountOfferPage extends BasePage {
    private Locator footerBuyItNow = new Locator(LocatorTypes.XPATH, "//div[@class='lp-button-react-wrapper']/a[contains(@class, 'w-6b8abc36-0f62-5dd6-e483-0c086298cfaa')]");
    private Locator middleBuySpray  = new Locator(LocatorTypes.XPATH, "//div[@class='lp-button-react-wrapper']/a[contains(@class, 'w-acf2dc03-2e79-11db-d38a-6902d0a7cdda')]");

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



    private Locator getMyFreeSampleButton = new Locator(LocatorTypes.XPATH, "//div[contains(@class, 'get-free-sample-wrapper')]/a");
    private Locator getSampleProduct = new Locator(LocatorTypes.XPATH, "//div[@id='products']//div[@class='product'][1]//div[@class='pay-button-wrapper-inner']");
//    private Locator sampleProducts = new Locator(LocatorTypes.XPATH, "//div[@class='product']['%s']//div[@class='pay-button-wrapper-inner']");

    protected DiscountOfferPage() {}

    public void clickGetMyFreeSampleButton() {
        waitForVisibility("Wait the 'GET MY FREE SAMPLE' button to be visible", getMyFreeSampleButton);
        click("Click the 'GET MY FREE SAMPLE' button", getMyFreeSampleButton);
    }

    public void clickGetSampleProduct(){
        waitToBeClickable("Wait the 'Get My Sample' button to be clickable", getSampleProduct);
        click("Click the 'Get My Sample' button", getSampleProduct);
    }

//    public int clickGetSampleProduct() {
//        waitForVisibility("Wait the 'Get MY SAMPLE' button to be visible", sampleProducts, rand);
//        click("Click the 'GET MY SAMPLE' button", sampleProducts, rand);
//        return rand;
//    }
}