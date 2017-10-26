package co.sprayable.sleep.pages;

import org.openqa.selenium.JavascriptExecutor;
import qa.util.base.BasePage;
import qa.util.base.Locator;
import qa.util.base.LocatorTypes;
import qa.util.reporting.Reporter;

public class OrderFreeTrialPage extends BasePage {

    private Locator topListProduct = new Locator(LocatorTypes.XPATH,
            "//div[contains(@class, 'packages')][1]//div[div[@class='header']" +
                    "//div[contains(text(), '%s')]]//div[contains(@class, 'btnSelect ')]");

    private Locator genericTopListProduct = new Locator(LocatorTypes.XPATH,
            "//div[contains(@class, 'packages')][2]//div[div[@class='header']" +
                    "//div[contains(text(), '%s')]]//div[contains(@class, 'btnSelect ')]");

    private Locator divReadyToTrySprayable = new Locator(LocatorTypes.XPATH,
            "//div[@class='buttons']/div[contains(@class, 'btnBuy ')]");


    private Locator linkSubscribeNowFooter = new Locator(LocatorTypes.XPATH,
            "//div[contains(text(),'BUY NOW')]");
    private Locator linkSubscribeNowFooterBlock = new Locator(LocatorTypes.CSS,
            "div.row.customers");

    private Locator linkRedyToTry = new Locator(LocatorTypes.CSS,
            "div.btn.btn-danger.btnBuy.move-up-btn.scrollToOffer");

//    private Locator topOfPage = new Locator(LocatorTypes.XPATH,
//            "//div[@id='order_page_top']");
    private Locator linkSubscribeNowHeader = new Locator(LocatorTypes.XPATH,
            "//a[@class='js_orderButton no-close-popup']//div[contains(text(),'BUY NOW')]");





    public void selectProductBySupplyType(String supplyType) {
        waitForVisibility("Wait for " + supplyType + "supply become visible", topListProduct, supplyType);
        clickJS("Select product with " + supplyType + " supply", topListProduct, supplyType);
    }

    public void waitSelectProductDisappear (String supplyType) {
        waitForInvisibility("Wait for " + supplyType + " disappear", topListProduct, supplyType);
    }

    public void selectProductBySupplyTypeAtFooter(String supplyType) {
        clickJS("click 'Free Trial' link at the bottom of page", genericTopListProduct, supplyType);
    }

    public void moveToReadyToTrySprayable() {
        Reporter.logAction("Scrolling page to link 'Ready To Try Sprayable'");

        JavascriptExecutor je = (JavascriptExecutor) driver();
        je.executeScript("arguments[0].scrollIntoView(true);", driver().findElement(divReadyToTrySprayable.getLocator()));
    }

    public void clickReadyToTrySprayable() {
        click("click div 'Im Ready To Try Sprayable'", divReadyToTrySprayable);
    }

    public void waitReadyToTrySprayableDisappear() {
        waitForInvisibility("waiting for div 'Im Ready To Try Sprayable' disappear", divReadyToTrySprayable);
    }

//    public void scrollToHeaderLinkSubscribeNow() {
//        scrollToElement("scroll to 'SubscribeNowHeader' button", topOfPage);
//    }

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