package co.sprayable.sleep.actions;

import co.sprayable.sleep.pages.Pages;
import org.testng.Assert;
import qa.util.Constants;
import qa.util.base.BaseActions;

public class SleepSpecialOfferActions extends BaseActions {

    public void checkVideoPlaying() {
        driver().switchTo().defaultContent();
        Pages.sleepSpecialOfferPage().clickLargePlay();
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);

        driver().switchTo().defaultContent();
        Assert.assertTrue(Pages.sleepSpecialOfferPage().isVideoPlaying());

        driver().switchTo().defaultContent();
        Pages.sleepSpecialOfferPage().clickPause();

        driver().switchTo().defaultContent();
        Assert.assertTrue(Pages.sleepSpecialOfferPage().isVideoNotPlaying());
    }

    public void performAddressLineHovering() {
        driver().switchTo().defaultContent();
        Pages.sleepSpecialOfferPage().waitBody();
        Pages.sleepSpecialOfferPage().moveToPage();
        Pages.sleepSpecialOfferPage().moveToAddressLine();
        Pages.sleepSpecialOfferPage().clickLinkGetMyDiscount();
    }

    public void clickBuyNow(){
        Pages.sleepSpecialOfferPage().clickLinkBuyNow();
    }

    public void clickReadyToBuyNow(){
        Pages.sleepSpecialOfferPage().scrollToLinkReadyToBuyNow();
        Pages.sleepSpecialOfferPage().clickLinkReadyToBuyNow();
    }

    public void clickFooterBuyNow(){
        Pages.sleepSpecialOfferPage().clickFooterLinkBuyNow();
    }

    public boolean isUpperTitleEnable(){
        wait(2);
        return Pages.sleepSpecialOfferPage().isUpperTitleVisible();
    }
}