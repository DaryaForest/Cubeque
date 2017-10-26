package co.sprayable.sleep.pages;


import qa.util.base.BasePage;
import qa.util.base.Locator;
import qa.util.base.LocatorTypes;

public class ProductOrderTrialPage extends BasePage {
    // TODO
    private Locator linkBuyNow = new Locator(LocatorTypes.XPATH, "//div[@id='order_page_top']/../following-sibling::*[2]//div[contains(text(),'1 Month Supply')]/../../..//a");
    private Locator linkReadyToBuyNow = new Locator(LocatorTypes.XPATH, "//div[contains(@class, 'scrollToOffer')]");
    private Locator middlePage = new Locator(LocatorTypes.XPATH, "//div[@class='row why-panel ']");
    private Locator footerPageOffer = new Locator(LocatorTypes.XPATH, "//div[@class='row customers']/following-sibling::div[1]//div[contains(text(),'1 Month Supply')]/../../..//a");

    public void clickLinkBuyNow(){
        waitToBeClickable("waiting for link 'Buy Now' become clickable", linkBuyNow);
        click("click link 'Buy Now'", linkBuyNow);
    }

    public void scrollToLinkReadyToBuyNow(){
        scrollToElement("scroll to 'I'm ready to buy sprayable now' button",middlePage);
    }

    public void clickLinkReadyToBuyNow(){
        waitToBeClickable("waiting for link 'I'm ready to buy sprayable now' become clickable",linkReadyToBuyNow);
        click("click link 'I'm ready to buy sprayable now'", linkReadyToBuyNow);
    }

    public void scrollToFooterPage(){
        scrollToElement("scroll to 'I'm ready to buy sprayable now' button",footerPageOffer);
    }
}

