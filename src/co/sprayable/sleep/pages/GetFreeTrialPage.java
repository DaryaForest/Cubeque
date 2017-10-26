package co.sprayable.sleep.pages;

import qa.util.base.BasePage;
import qa.util.base.Locator;
import qa.util.base.LocatorTypes;

public class GetFreeTrialPage extends BasePage {
    private Locator linkBuyNow = new Locator(LocatorTypes.XPATH, "//div[contains(@class, 'btnSelect btnBlue')]");
    private Locator linkReadyToBuyNow = new Locator(LocatorTypes.XPATH, "//div[contains(@class, 'scrollToOffer')]");
    private Locator linkOrderSprayNow = new Locator(LocatorTypes.XPATH, "//a[contains(@class, 'move-up-btn')]");
    // TODO
    private Locator footerPageOffer = new Locator(LocatorTypes.XPATH, "//div[@class='row packages'][2]");

    private Locator middlePage = new Locator(LocatorTypes.XPATH, "//div[@class='row why-panel ']");

    public void clickLinkBuyNow(){
        waitToBeClickable("waiting for link 'Buy Now' become clickable", linkBuyNow);
        click("click link 'Buy Now'", linkBuyNow);
    }

    public void scrollToLinkReadyToBuyNow(){
        scrollToElement("scroll to 'I'm ready to buy sprayable now' button",middlePage);
    }

    public void scrollToLinkOrderSprayNow(){
        scrollToElement("scroll to 'Order sprayable now' button", linkOrderSprayNow);
    }

    public void clickLinkReadyToBuyNow(){
        waitToBeClickable("waiting for link 'I'm ready to buy sprayable now' become clickable",linkReadyToBuyNow);
        click("click link 'I'm ready to buy sprayable now'", linkReadyToBuyNow);
    }

    public void clickLinkOrderSprayNow(){
        waitToBeClickable("waiting for link 'Order sprayable now' become clickable",linkOrderSprayNow);
        click("click link 'Order sprayable now'", linkOrderSprayNow);
    }

    public void scrollToFooterPage(){
        scrollToElement("scroll to 'I'm ready to buy sprayable now' button",footerPageOffer);
    }

   /* private Locator linkClaimFreeSampleTop = new Locator(LocatorTypes.XPATH, "//p[@class='center']/a");
    private Locator linkClaimFreeSampleBottom = new Locator(LocatorTypes.XPATH, "//div[contains(@class, 'submit-container')]/a");

    public void clickLinkClaimFreeSampleTop() {
        waitToBeClickable("waiting for link 'Claim Sample' in the top of page become clickable", linkClaimFreeSampleTop);
        click("click link 'Claim Sample' in th etop of page", linkClaimFreeSampleTop);
    }

    public void clickLinkClaimFreeSampleBottom() {
        click("click link 'Claim Sample' in the bottom of page", linkClaimFreeSampleBottom);
    }

    public void waitLinkClaimFreeSampleBottomDisappear() {
        waitForInvisibility("waiting for link 'Claim Sample' in the bottom of page disappears", linkClaimFreeSampleBottom);
    }*/
}