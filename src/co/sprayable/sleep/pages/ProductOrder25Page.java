package co.sprayable.sleep.pages;

import org.openqa.selenium.WebElement;
import qa.util.Constants;
import qa.util.base.BasePage;
import qa.util.base.Locator;
import qa.util.base.LocatorTypes;
import qa.util.reporting.Reporter;

import java.awt.*;


public class ProductOrder25Page extends BasePage {

//    private Locator divReadyToTrySprayable = new Locator(LocatorTypes.XPATH, "//div[@class='buttons']/div[contains(@class, 'btn btn-danger btnBuy move-up-btn scrollToOffer')]");
//
//    private Locator linkBuyNowES = new Locator(LocatorTypes.XPATH, "//div[@class='row packages'][2]//div[@class='buttons']/a[contains(@class, 'js_orderButton')]");
//    private Locator body = new Locator(LocatorTypes.XPATH, "//body");
//    private Locator linkShowMeFreeTrial = new Locator(LocatorTypes.XPATH, "//div[@class='modal-buttons']//a[contains(@class, 'btn-yellow')]");
//    private Locator upperTitle = new Locator(LocatorTypes.XPATH, "//div[@id='ultracart-header']");


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


//
//    public void moveToPage() {
//        Reporter.logAction("Moving cursor to page");
//
//        WebElement elemBody = driver().findElement(body.getLocator());
//
//        int xShift = elemBody.getSize().getWidth() / Constants.BODY_WITH_DIVIDER;
//
//        try {
//            new Robot().mouseMove(driver().manage().window().getPosition().getX() + xShift, driver().manage().window().getPosition().getY() + Constants.Y_SHIFT);
//        } catch (AWTException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void moveToAddressLine() {
//        Reporter.logAction("Moving cursor to address line");
//
//        WebElement elemBody = driver().findElement(body.getLocator());
//
//        int x = elemBody.getSize().getWidth() / Constants.BODY_WITH_DIVIDER;
//
//        try {
//            new Robot().mouseMove(x, 0);
//        } catch (AWTException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void scrollToFreeTrialLink() {
//        scrollToElement("scroll to free trial link", linkShowMeFreeTrial);
//
//    }
//
//    public void clickLinkShowMeFreeTrial() {
//        waitToBeClickable("waiting for link 'Show me the FREE trial offer' become clickable", linkShowMeFreeTrial);
//        click("click link 'Show me the FREE trial offer'", linkShowMeFreeTrial);
//    }
//
//    public boolean isUpperTitleVisible() {
//        return isEnabled("checking for upper footer enable", upperTitle);
//    }


}
