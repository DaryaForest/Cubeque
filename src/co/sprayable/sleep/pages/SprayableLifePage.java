package co.sprayable.sleep.pages;

import qa.util.base.BasePage;
import qa.util.base.Locator;
import qa.util.base.LocatorTypes;

public class SprayableLifePage extends BasePage {

    private Locator topBuyNowButton = new Locator(LocatorTypes.XPATH, "//div[contains(@class, 'packages')][1]//div[contains(@class, 'noPadding')]/div[1]//div[contains(@class, 'btnSelect')]");
    private Locator middleBuyNowButton = new Locator(LocatorTypes.XPATH, "//div[contains(@class, 'version2')]//div[contains(@class, 'scrollToOffer')]");
    private Locator footerBuyNowButton = new Locator(LocatorTypes.XPATH, "//div[contains(@class, 'packages')][2]//div[contains(@class, 'noPadding')]/div[1]//div[contains(@class, 'btnSelect')]");

    public void waitTopBuyNowButton(){
        waitForVisibility("Wait for 'Buy Now' button to be visible", topBuyNowButton);
        waitToBeClickable("Wait for 'Buy Now' button to be clickable", topBuyNowButton);
    }

    public void clickTopBuyNowButton() {
        click("click on 'Download Now' button", topBuyNowButton);
    }

    public void waitMiddleBuyNowButton(){
        waitForVisibility("Wait for 'Buy Now' button to be visible", middleBuyNowButton);
    }

    public void moveToMiddleBuyNowButton(){
        moveToElement("Move to 'Buy now' button", middleBuyNowButton, 0, 0).perform();
    }

    public void clickMiddleBuyNowButton() {
        click("click on 'Download Now' button", middleBuyNowButton);
    }

    public void waitFooterBuyNowButton(){
        waitForVisibility("Wait for 'Buy Now' button to be visible", footerBuyNowButton);
        waitToBeClickable("Wait for 'Buy Now' button to be clickable", footerBuyNowButton);
    }

    public void clickFooterBuyNowButton() {
        click("click on 'Download Now' button", footerBuyNowButton);
    }
}