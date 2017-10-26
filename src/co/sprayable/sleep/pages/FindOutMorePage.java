package co.sprayable.sleep.pages;

import qa.util.base.BasePage;
import qa.util.base.Locator;
import qa.util.base.LocatorTypes;

/**
 * Created by User on 27.02.2017.
 */
public class FindOutMorePage extends BasePage {
    private Locator buyItNowLink = new Locator(LocatorTypes.XPATH, "//div[@class='buttons']/a[contains(@class, 'js_orderButton')]");
    private Locator readyToTrySprayableLink = new Locator(LocatorTypes.XPATH, "//div[@class='buttons']/div[contains(@class, 'scrollToOffer')]");
    private Locator footerOfferBlock = new Locator(LocatorTypes.XPATH, "//div[@class = 'row customers']");
    private Locator middleOfThePage = new Locator(LocatorTypes.XPATH, "//div[@class='row why-panel ']");
    private Locator upperTitle = new Locator(LocatorTypes.XPATH, "//div[@id='ultracart-header']");

    public void clickUpperBuyItNowLink(){
        waitToBeClickable("waiting for upper link 'Buy it now' become clickable",buyItNowLink);
        click("click upper link 'Buy it now'", buyItNowLink);
    }

    public void clickReadyToTrySprayableLink(){
        scrollToElement("scroll to middle link 'I'm Ready To Try Sprayable'",middleOfThePage);
        waitToBeClickable("waiting for link 'I'm Ready To Try Sprayable' become clickable",readyToTrySprayableLink);
        click("click link 'I'm Ready To Try Sprayable' in the middle of the page", readyToTrySprayableLink);

    }

    public void clickFooterBuyItNowLink(){
        scrollToElement("scroll to footer offer block ",footerOfferBlock);
        waitToBeClickable("waiting for footer link 'Buy it now' become clickable",buyItNowLink);
        click("click footer link 'Buy it now'", buyItNowLink);
    }

    public boolean isUpperTitleVisible(){
        return isEnabled("checking for upper footer enable", upperTitle);
    }
}
