package co.sprayable.sleep.pages;

import qa.util.base.BasePage;
import qa.util.base.Locator;
import qa.util.base.LocatorTypes;

public class EnergyVipPage extends BasePage {

    private Locator linkBuyNow = new Locator(LocatorTypes.XPATH, "//div[@class='buttons']/a[contains(@class, 'js_orderButton')]");
    private Locator middleLinkBuyNow = new Locator(LocatorTypes.XPATH, "//div[contains(@class, 'move-up-btn scrollToOffer')]");
    private Locator middleOfThePage = new Locator(LocatorTypes.XPATH, "//div[@class='row why-panel  version5 ']");
    private Locator footerLinkBuyNow = new Locator(LocatorTypes.XPATH, "//div[@class='row packages'][2]//div[contains(@class, 'btnSelect btnBlue')]");
    //private Locator footerPageOffer = new Locator(LocatorTypes.XPATH, "//div[@class='row packages'][2]");
    private Locator topLinkBuyNow = new Locator(LocatorTypes.XPATH, "//div[contains(@class, 'btnSelect btnBlue')]");
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
}