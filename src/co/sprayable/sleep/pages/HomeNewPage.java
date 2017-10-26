package co.sprayable.sleep.pages;

import co.sprayable.sleep.actions.Actions;
import org.openqa.selenium.WebElement;
import qa.util.Constants;
import qa.util.base.BasePage;
import qa.util.base.Locator;
import qa.util.base.LocatorTypes;
import qa.util.reporting.Reporter;

import java.awt.*;

public class HomeNewPage extends BasePage {
    private Locator footerBuyItNow = new Locator(LocatorTypes.XPATH, "//div[@class='lp-button-react-wrapper']/a[contains(@class, 'w-6b8abc36-0f62-5dd6-e483-0c086298cfaa')]");
    private Locator middleBuySpray  = new Locator(LocatorTypes.XPATH, "//div[@class='lp-button-react-wrapper']/a[contains(@class, 'w-acf2dc03-2e79-11db-d38a-6902d0a7cdda')]");


    private Locator liveALongerBut = new Locator(LocatorTypes.XPATH, "//div[@class='lp-button-react-wrapper']/a[contains(@class, 'w-ba4fcf6e-ef0b-42d8-39dc-369b84b15876')]");
    private Locator cleanseYourCircadianRhythmBut = new Locator(LocatorTypes.XPATH, "//div[@class='lp-button-react-wrapper']/a[contains(@class, 'w-4f270dfc-b34d-9d2f-b1ad-ff992b0994ea')]");

    private Locator clickHereToGetTheCircadianCleanseBut = new Locator(LocatorTypes.XPATH, "//div[@class='lp-button-react-wrapper']/a[contains(@class, 'w-6b8abc36-0f62-5dd6-e483-0c086298cfaa')]");

    public void scrollToClickHereToGetTheCircadianCleanseBut(){
        scrollToElement("scrolling to the middle page button", clickHereToGetTheCircadianCleanseBut);
        waitToBeClickable("wait for 'Click here to buy Sprayble today' button",clickHereToGetTheCircadianCleanseBut);
        click("click  middle page button", clickHereToGetTheCircadianCleanseBut);
    }

    public void scrollToLiveALongerBut(){
        scrollToElement("scrolling to the middle page button", liveALongerBut);
        waitToBeClickable("wait for 'Click here to buy Sprayble today' button",liveALongerBut);
        click("click  middle page button", liveALongerBut);
    }

    public void scrollToCleanseYourCircadianRhythmBut(){
        scrollToElement("scrolling to the middle page button", cleanseYourCircadianRhythmBut);
        waitToBeClickable("wait for 'Click here to buy Sprayble today' button",cleanseYourCircadianRhythmBut);
        click("click  middle page button", cleanseYourCircadianRhythmBut);
    }




}


   /* private Locator body = new Locator(LocatorTypes.XPATH, "//body");
    private Locator linkArrowDown = new Locator(LocatorTypes.XPATH, "//a[@class='arrow']");
    private Locator linkShopSprayableSleep = new Locator(LocatorTypes.XPATH, "//div[contains(@class, 'sleep description-wrapper')]//a");
    private Locator linkShopSprayableSleepFooter = new Locator(LocatorTypes.XPATH, "//div[contains(@class, 'clearfix')]/a[text()='SHOP SPRAYABLE SLEEP']");
    private Locator linkReadSprayableSleepReviews = new Locator(LocatorTypes.XPATH, "//div[contains(@class, 'clearfix')]/a[text()='Read Sprayable Sleep Reviews']");
    private Locator linkShopSprayableEnergy = new Locator(LocatorTypes.XPATH, "//div[contains(@class, 'energy description-wrapper')]//a");
    private Locator linkShopSprayableEnergyFooter = new Locator(LocatorTypes.XPATH, "//div[contains(@class, 'clearfix')]//a[text()='SHOP SPRAYABLE ENERGY']");
    private Locator linkReadSprayableEnergyReviews = new Locator(LocatorTypes.XPATH, "//div[contains(@class, 'clearfix')]//a[text()='Read Sprayable Energy Reviews']");
    private Locator linkShowMeFreeTrial = new Locator(LocatorTypes.XPATH, "//div[@class='modal-buttons']//a[contains(@class, 'btn-yellow')]");

    public void clickLinkArrowDown() {
        waitToBeClickable("waiting for link with arrow down image become clickable", linkArrowDown);
        click("click link with arrow down image", linkArrowDown);
    }

    public void clickLinkShopSprayableSleep() {
        waitToBeClickable("waiting for link 'Shop Sprayable Sleep' become clickable", linkShopSprayableSleep);
        click("click link 'Shop Sprayable Sleep'", linkShopSprayableSleep);
    }

    public void clickLinkShopSprayableSleepFooter() {
        waitToBeClickable("waiting for link 'Shop Sprayable Sleep' at the footer become clickable", linkShopSprayableSleepFooter);
        click("click link 'Shop Sprayable Sleep' at the footer", linkShopSprayableSleepFooter);
    }

    public void clickLinkReadSprayableSleepReviews() {
        waitToBeClickable("waiting for link 'Read Sprayable Sleep Reviews' become clickable", linkReadSprayableSleepReviews);
        click("click link 'Read Sprayable Sleep Reviews'", linkReadSprayableSleepReviews);
    }

    public void clickLinkShopSprayableEnergy() {
        waitToBeClickable("waiting for link 'Shop Sprayable Energy' become clickable", linkShopSprayableEnergy);
        click("click link 'Shop Sprayable Energy'", linkShopSprayableEnergy);
    }

    public void clickLinkShopSprayableEnergyFooter() {
        waitToBeClickable("waiting for link 'Shop Sprayable Energy' at the footer become clickable", linkShopSprayableEnergyFooter);
        click("click link 'Shop Sprayable Energy' at the footer", linkShopSprayableEnergyFooter);
    }

    public void clickLinkReadSprayableEnergyReviews() {
        waitToBeClickable("waiting for link 'Read Sprayable Energy Reviews' become clickable", linkReadSprayableEnergyReviews);
        click("click link 'Read Sprayable Energy Reviews'", linkReadSprayableEnergyReviews);
    }

    public void clickLinkShowMeFreeTrial() {
        waitToBeClickable("waiting for link 'Show me the FREE trial offer' become clickable", linkShowMeFreeTrial);
        click("click link 'Show me the FREE trial offer'", linkShowMeFreeTrial);
    }

    public void waitLinkShowMeFreeTrialDisappear() {
        waitForInvisibility("waiting for link 'Show me the FREE trial offer', disappear", linkShowMeFreeTrial);
    }

    public void waitLinkShopSprayableSleepDisappear() {
        waitForInvisibility("waiting for link 'Shop Sprayable Sleep' disappear", linkShopSprayableSleep);
    }

    public void waitBody() {
        waitForPresence("waiting for 'body' presents", body);
        Actions.mainActions().wait(Constants.MICRO_TIMEOUT_SECONDS);
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