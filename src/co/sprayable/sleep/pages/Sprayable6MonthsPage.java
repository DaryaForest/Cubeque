package co.sprayable.sleep.pages;

import qa.util.base.BasePage;
import qa.util.base.Locator;
import qa.util.base.LocatorTypes;

public class Sprayable6MonthsPage extends BasePage {

    private Locator buyNowButton = new Locator(LocatorTypes.XPATH, "//div[contains(@class, 'packages')][1]//div[contains(@class, 'btnSelect')]");

    public void waitBuyNowButton(){
        waitForVisibility("Wait for 'Buy Now' button to be visible", buyNowButton);
        waitToBeClickable("Wait for 'Buy Now' button to be clickable", buyNowButton);
    }

    public void clickBuyNowButton() {
        click("click on 'Download Now' button", buyNowButton);
    }
}