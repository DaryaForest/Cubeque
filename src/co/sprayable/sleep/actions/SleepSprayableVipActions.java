package co.sprayable.sleep.actions;

import co.sprayable.sleep.pages.Pages;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.Reporter;
import qa.util.Constants;
import qa.util.base.BaseActions;
import qa.util.base.BasePage;

public class SleepSprayableVipActions extends BaseActions {

    public SleepSprayableVipActions() {
    }

    public void checkPageScrolling() {
        JavascriptExecutor executor = (JavascriptExecutor) driver();
        Long startOffset = (Long) executor.executeScript("return window.pageYOffset;");

        Pages.sleepSprayableVipPage().moveToReadyToTrySprayable();
        Long afterScrollingDownOffset = (Long) executor.executeScript("return window.pageYOffset;");

        Pages.sleepSprayableVipPage().clickReadyToTrySprayable();
        Actions.mainActions().wait(Constants.MINIMUM_TIMEOUT_SECONDS);

        Long afterScrollingUpOffset = (Long) executor.executeScript("return window.pageYOffset;");

        Reporter.log("startOffset = " + startOffset + "; afterScrollingDownOffset = " + afterScrollingDownOffset + "; afterScrollingUpOffset = " + afterScrollingUpOffset);

        Assert.assertTrue(afterScrollingDownOffset > afterScrollingUpOffset, "Expected startOffset = " + startOffset + " is equal to afterScrollingUpOffset = " + afterScrollingUpOffset);
        Assert.assertFalse(startOffset.equals(afterScrollingDownOffset), "Expected startOffset = " + startOffset + " is not equal to afterScrollingDownOffset = " + afterScrollingDownOffset);
    }

    public void performShowMeFreeTrialActivity() {
        Pages.sleepSprayableVipPage().waitBody();
        Pages.sleepSprayableVipPage().moveToPage();
        Pages.sleepSprayableVipPage().moveToAddressLine();
        Pages.sleepSprayableVipPage().clickLinkShowMeFreeTrial();
    }

    public void clickButtonBuyNow() {
        Pages.sleepSprayableVipPage().clickLinkBuyNow();
    }

    public void clickButtonReadyToBuy() {
        Pages.sleepSprayableVipPage().scrollAndClickReadyToTrySprayable();
    }

    public void scrollToFooterAndClickLinkBuyNow() {
        Pages.sleepSprayableVipPage().scrollToFooter();
        Actions.mainActions().wait(Constants.MINIMUM_TIMEOUT_SECONDS);
        Pages.sleepSprayableVipPage().clickLinkBuyNow();
    }

    public void scrollToFooterAndClickLinkBuyNowES() {
        Pages.sleepSprayableVipPage().scrollToFooter();

        Pages.sleepSprayableVipPage().clickLinkBuyNowES();
    }

    public void scrollToFooterAndClickFreeTrial() {
        Pages.sleepSprayableVipPage().moveToPage();
        Pages.sleepSprayableVipPage().moveToAddressLine();
        wait(3);
        Pages.sleepSprayableVipPage().scrollToFreeTrialLink();
        Pages.sleepSprayableVipPage().clickLinkShowMeFreeTrial();
    }
}
