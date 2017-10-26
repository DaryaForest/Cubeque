package co.sprayable.sleep.pages;

import qa.util.base.BasePage;
import qa.util.base.Locator;
import qa.util.base.LocatorTypes;


public class OrderEnergyPage extends BasePage {
    private Locator linkBuyNowEnergy = new Locator(LocatorTypes.XPATH, "//div[@class='buttons']/a[contains(@class, 'js_orderButton')]");
    private Locator middleBuyNowButton = new Locator(LocatorTypes.XPATH, "//div[contains(@class,'scrollToOffer')]");
    // TODO
    private Locator footerBuyNowSection = new Locator(LocatorTypes.XPATH, "//div[@class='row packages'][2]");

    public void clickBuyNowEnergyTopButton(){
        waitToBeClickable("wait for 'Buy now and say goodbye to being tired' button be clickable",linkBuyNowEnergy);
        click("click 'Buy now and say goodbye to being tired'",linkBuyNowEnergy);
    }

    public void clickMiddleBuyNowButton(){
        waitToBeClickable("wait for 'Buy Now' button be clickable",middleBuyNowButton);
        click("click 'Buy Now'",middleBuyNowButton);
    }

    public void scrollToBuyNowMiddleButton(){
        scrollToElement("scroll to middle 'Buy Now' button ",middleBuyNowButton);
    }

    public void scrollToFooterBuyNowSection(){
        scrollToElement("scroll to footer buy now section ",footerBuyNowSection);
    }



}
