package co.sprayable.sleep.pages;

import qa.util.base.BasePage;
import qa.util.base.Locator;
import qa.util.base.LocatorTypes;


public class EnergyProductOrderPage extends BasePage {

    private Locator linkSubscribeNowFooter = new Locator(LocatorTypes.XPATH,
            "//div[contains(text(),'BUY NOW')]");
    private Locator linkSubscribeNowFooterBlock = new Locator(LocatorTypes.CSS,
            "div.row.customers");

    private Locator linkRedyToTry = new Locator(LocatorTypes.CSS,
            "div.btn.btn-danger.btnBuy.move-up-btn.scrollToOffer");

    private Locator topOfPage = new Locator(LocatorTypes.XPATH,
            "//div[@id='order_page_top']");
    private Locator linkSubscribeNowHeader = new Locator(LocatorTypes.XPATH,
            "//a[@class='js_orderButton no-close-popup']//div[contains(text(),'BUY NOW')]");


    // private Locator linkSubscribeNowHeader = new Locator(LocatorTypes.XPATH, "//div[@class='row packages'][1]//div[2]/div[2]/div[2]/a/div");


    // TODO
    public void
    scrollToHeaderLinkSubscribeNow() {
        scrollToElement("scroll to 'SubscribeNowHeader' button", topOfPage);
    }

    public void clickHeaderLinkSubscribeNow() {
        waitToBeClickable("waiting for link 'SubscribeNowHeader' become clickable", linkSubscribeNowHeader);
        click("click link 'SubscribeNowHeader'", linkSubscribeNowHeader);
    }

    public void scrollToFooterLinkSubscribeNow() {
        scrollToElement("scroll to 'SubscribeNowFooter' button", linkSubscribeNowFooterBlock);

    }

    public void clickFooterLinkSubscribeNow() {
        waitToBeClickable("waiting for link 'SubscribeNowFooter' become clickable", linkSubscribeNowFooter);
        click("click link 'SubscribeNowHeader'", linkSubscribeNowFooter);
    }

    public void clickLinkReadyToTry() {
        waitToBeClickable("waiting for link 'I'm ready to try sprayable now' become clickable", linkRedyToTry);
        click("click link 'I'm ready to try sprayable now'", linkRedyToTry);
    }

    public void scrollToRedyToTry() {
        scrollToElement("scroll to 'I'm ready to try sprayable now' button", linkRedyToTry);
    }


}
