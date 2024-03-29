package co.sprayable.sleep.actions;

import co.sprayable.sleep.pages.Pages;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.Reporter;
import qa.util.Constants;
import qa.util.base.BaseActions;

public class OrderFreeTrialActions extends BaseActions {

    public OrderFreeTrialActions() {
    }

    public void checkPageScrolling() {
        JavascriptExecutor executor = (JavascriptExecutor) driver();
        Long startOffset = (Long) executor.executeScript("return window.pageYOffset;");

        Pages.orderFreeTrialPage().moveToReadyToTrySprayable();
        Long afterScrollingDownOffset = (Long) executor.executeScript("return window.pageYOffset;");

        Pages.orderFreeTrialPage().clickReadyToTrySprayable();
        Actions.mainActions().wait(Constants.MINIMUM_TIMEOUT_SECONDS);

        Long afterScrollingUpOffset = (Long) executor.executeScript("return window.pageYOffset;");

        Reporter.log("startOffset = " + startOffset + "; afterScrollingDownOffset = " + afterScrollingDownOffset +
                "; afterScrollingUpOffset = " + afterScrollingUpOffset);

        Assert.assertTrue(afterScrollingDownOffset > afterScrollingUpOffset, "Expected startOffset = " +
                startOffset + " is equal to afterScrollingUpOffset = " + afterScrollingUpOffset);
        Assert.assertFalse(startOffset.equals(afterScrollingDownOffset), "Expected startOffset = " + startOffset +
                " is not equal to afterScrollingDownOffset = " + afterScrollingDownOffset);
    }

    public void clickHeaderBuyNow() {
        Pages.orderFreeTrialPage().clickHeaderLinkSubscribeNow();
    }

    public void clickReadyToBuyNow() {
        Pages.orderFreeTrialPage().scrollToRedyToTry();
        Pages.orderFreeTrialPage().clickLinkReadyToTry();
    }

    public void clickFooterBuyNow() {
        Pages.orderFreeTrialPage().scrollToFooterLinkSubscribeNow();
        Pages.orderFreeTrialPage().clickFooterLinkSubscribeNow();
    }

}