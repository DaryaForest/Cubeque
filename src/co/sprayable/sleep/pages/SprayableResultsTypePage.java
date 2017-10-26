package co.sprayable.sleep.pages;

import qa.util.base.BasePage;
import qa.util.base.Locator;
import qa.util.base.LocatorTypes;


public class SprayableResultsTypePage extends BasePage {

    private Locator buyNowButton = new Locator(LocatorTypes.XPATH, "//a[@class='yellowBtn']");
    private Locator upperSection = new Locator(LocatorTypes.XPATH, "//div[@class='upsell_offer_box row']");


    public void clickBuyNowButton(){
        waitToBeClickable("wait for 'Buy now and finally  get good sleep' button be clickable",buyNowButton);
        click("click 'Buy now and finally  get good sleep' button ",buyNowButton);
    }

    public void scrollToButton(){
        scrollToElement("scroll to 'Buy now and finally  get good sleep' button",upperSection);
    }
}
