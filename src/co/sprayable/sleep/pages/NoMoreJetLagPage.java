package co.sprayable.sleep.pages;

import org.openqa.selenium.WebElement;
import qa.util.Constants;
import qa.util.base.BasePage;
import qa.util.base.Locator;
import qa.util.base.LocatorTypes;
import qa.util.reporting.Reporter;

import java.awt.*;

public class NoMoreJetLagPage extends BasePage {
    private Locator footerBuyItNow = new Locator(LocatorTypes.XPATH, "//div[@class='lp-button-react-wrapper']/a[contains(@class, 'w-6b8abc36-0f62-5dd6-e483-0c086298cfaa')]");
    private Locator middleBuySpray  = new Locator(LocatorTypes.XPATH, "//div[@class='lp-button-react-wrapper']/a[contains(@class, 'w-acf2dc03-2e79-11db-d38a-6902d0a7cdda')]");

    public void scrollToMiddleBuySpray(){
        scrollToElement("scrolling to the middle page button", middleBuySpray);
        waitToBeClickable("wait for 'Click here to buy Sprayble today' button",middleBuySpray);
        click("click  middle page button", middleBuySpray);
    }

    public void scrollToFooterBuyItNow(){
        scrollToElement("scrolling to the middle page button", footerBuyItNow);
        waitToBeClickable("wait for 'Click here to buy Sprayble today' button",footerBuyItNow);
        click("click  middle page button", footerBuyItNow);
    }
}
/*
    private Locator body = new Locator(LocatorTypes.XPATH, "//body");
    private Locator linkClaimSample = new Locator(LocatorTypes.XPATH, "//a[img[@alt='Claim Sample']]");
    private Locator linkClaimSampleSecond = new Locator(LocatorTypes.XPATH, "//input[contains(@src, 'claim-button2')]");
    private Locator linkShowMeFreeTrial = new Locator(LocatorTypes.XPATH, "//div[@class='modal-buttons']//a[contains(@class, 'btn-yellow')]");


    public void clickClaimSampleButton() {
        waitToBeClickable("waiting for 'Claim sample' link become clickable", linkClaimSample);
        click("Click 'Claim Sample' button", linkClaimSample);
    }

    public void clickClaimSampleSecondButton() {
        waitToBeClickable("waiting for 'Claim Sample' link become clickable", linkClaimSampleSecond);
        click("Click 'Claim Sample' button again", linkClaimSampleSecond);
    }

    public void waitClaimSampleButtonDisappear() {
        waitForInvisibility("waiting for button 'Claim You Free 10-Day Sample' disappear", linkClaimSampleSecond);
    }

    public void waitLinkShowMeFreeTrialDisappear() {
        waitForInvisibility("waiting for link 'Show me the FREE trial offer', disappear", linkShowMeFreeTrial);
    }

    public void clickLinkShowMeFreeTrial() {
        waitToBeClickable("waiting for link 'Show me the FREE trial offer' become clickable", linkShowMeFreeTrial);
        click("click link 'Show me the FREE trial offer'", linkShowMeFreeTrial);
    }

    public void waitBody() {
        waitForPresence("waiting for 'body' presents", body);
        co.sprayable.sleep.actions.Actions.mainActions().wait(Constants.MICRO_TIMEOUT_SECONDS);
    }

    public void moveToAddressLine() {
        Reporter.logAction("Moving cursor to address line");

        WebElement elemBody = driver().findElement(body.getLocator());

        int x = elemBody.getSize().getWidth() / Constants.BODY_WITH_DIVIDER;

        try {
            new Robot().mouseMove(x, 0);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public void moveToPage() {
        Reporter.logAction("Moving cursor to page");

        WebElement elemBody = driver().findElement(body.getLocator());

        int xShift = elemBody.getSize().getWidth() / Constants.BODY_WITH_DIVIDER;

        try {
            new Robot().mouseMove(driver().manage().window().getPosition().getX() + xShift, driver().manage().window().getPosition().getY() + Constants.Y_SHIFT);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}
*/