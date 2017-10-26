package co.sprayable.sleep.pages;

import qa.util.base.BasePage;
import qa.util.base.Locator;
import qa.util.base.LocatorTypes;

public class TrySprayableSleepFirstMonthOneDollarPage extends BasePage {

    private Locator linkTakeTheFirstMonth = new Locator(LocatorTypes.XPATH, "//a[@class='pay-original-button']");

    private Locator linkBuyNow = new Locator(LocatorTypes.XPATH, "//div[@class='buttons']/a[contains(@class, 'js_orderButton')]");
    //private Locator middleLinkBuyNow = new Locator(LocatorTypes.XPATH, "//div[contains(@class, 'btn btn-primary btnSelect btnBlue')]");
    //div[2]/div[2]/div[2]/a/div
    private Locator middleLinkBuyNow = new Locator(LocatorTypes.XPATH, "//div[contains(@class, 'btn btn-danger btnBuy move-up-btn scrollToOffer')]");
    private Locator middleOfThePage = new Locator(LocatorTypes.XPATH, "//div[@class='col-md-5 sprayable-buy']");
    //private Locator footerPageOffer = new Locator(LocatorTypes.XPATH, "//div[@class='row packages'][2]");
    //TODO
    private Locator topLinkBuyNow = new Locator(LocatorTypes.XPATH, "//div[2]/div[2]/div[2]/a/div");
    private Locator footerLinkBuyNow = new Locator(LocatorTypes.XPATH, "//div[11]/div/div/div/div[2]/div[2]/div[2]/a/div");
    // private Locator topLinkBuyNow = new Locator(LocatorTypes.XPATH, "//div[contains(@class, 'btnSelect btnBlue')]");


    public void clickLinkBuyNow() {
        waitToBeClickable("waiting for link 'Buy Now' become clickable", linkBuyNow);
        click("click link 'Buy Now'", linkBuyNow);
    }
    public void scrollToMiddleOfThePage(){
        scrollToElement("scroll to middle 'Buy now' button", middleOfThePage);
    }

    public void clickMiddleLinkBuyNow(){
        waitToBeClickable("waiting for link 'Buy now' become clickable", middleLinkBuyNow);
        click("click link 'Buy Now'", middleLinkBuyNow);
    }

    /*public void scrollToFooterPage(){
        scrollToElement("scroll to footer 'Buy now and say goodbye to being tired' button",footerPageOffer);
    }*/

    public void clickFooterLinkBuyNow(){
        waitToBeClickable("waiting for footer link 'Buy now and say goodbye to being tired' become clickable", footerLinkBuyNow);
        click("click footer link 'Buy now and say goodbye to being tired'", footerLinkBuyNow);
    }
    public void clickTopLinkBuyNow(){
        waitToBeClickable("waiting for link 'Buy now and say goodbye to being tired' become clickable", topLinkBuyNow);
        click("click link 'Buy Now'", topLinkBuyNow);
    }


    /*public void clickLinkTakeTheFirstMonth() {
        waitToBeClickable("waiting for link 'Okay, I’ll Take The First-Month-Free Offer' become clickable", linkTakeTheFirstMonth);
        clickJS("click link 'Okay, I’ll Take The First-Month-Free Offer'", linkTakeTheFirstMonth);
    }

    public void waitLinkTakeTheFirstMonthDisappear() {
        waitForInvisibility("waiting for link 'Okay, I’ll Take The First-Month-Free Offer' disappears", linkTakeTheFirstMonth);
    }*/
}