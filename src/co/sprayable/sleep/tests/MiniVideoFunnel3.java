package co.sprayable.sleep.tests;

import co.sprayable.sleep.actions.Actions;
import co.sprayable.sleep.data.OrderData;
import co.sprayable.sleep.pages.Pages;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import qa.util.Constants;
import qa.util.base.BaseTest;

public class MiniVideoFunnel3 extends BaseTest {

    private OrderData orderData = new OrderData();

    @BeforeClass
    private void genTestData() {
        orderData = orderData.generateOrderData();
    }
/*
    @Test
    public void testMiniVideoFunnel3 () {
        Actions.mainActions().clearSession();
        Actions.mainActions().openPage(Constants.SPRAYABLE_SLEEP_SPECIAL_OFFER_URL);

        Actions.sleepSpecialOfferActions().checkVideoPlaying();

        Actions.mainActions().openPage(Constants.SPRAYABLE_SLEEP_SPECIAL_OFFER_URL);
        Actions.sleepSpecialOfferActions().performAddressLineHovering();
        Pages.sleepSpecialOfferPage().waitLinkGetMyDiscountDissapear();

        Assert.assertTrue(driver().getCurrentUrl().contains(Constants.SLEEP_SPRAYABLE_VIP_URL), "Expected URL: " + Constants.SLEEP_SPRAYABLE_VIP_URL + ". Current URL: " + driver().getCurrentUrl() + "\n");

        Actions.mainActions().openPage(Constants.SPRAYABLE_SLEEP_SPECIAL_OFFER_URL);
        Pages.sleepSpecialOfferPage().clickLinkBuyItNow();
        Pages.sleepSpecialOfferPage().waitLinkBuyItNowDisappear();
     // ORDER_URL
        Assert.assertTrue(driver().getCurrentUrl().contains(Constants.SLEEP_SPRAYABLE_VIP_URL), "Expected URL: " + Constants.SLEEP_SPRAYABLE_VIP_URL + ". Current URL: " + driver().getCurrentUrl() + "\n");

        Actions.mainActions().openPage(Constants.SPRAYABLE_SLEEP_SPECIAL_OFFER_URL);
        Pages.sleepSpecialOfferPage().clickLinkIWantToTryItNow();
        Pages.sleepSpecialOfferPage().waitLinkGetMyDiscountDissapear();
        Assert.assertTrue(driver().getCurrentUrl().contains(Constants.ORDER_URL), "Expected URL: " + Constants.ORDER_URL + ". Current URL: " + driver().getCurrentUrl() + "\n");

        Actions.mainActions().openPage(Constants.SPRAYABLE_SLEEP_SPECIAL_OFFER_URL);
        Pages.sleepSpecialOfferPage().clickLinkLearnMore();
        Pages.sleepSpecialOfferPage().waitLinkGetMyDiscountDissapear();
     // was before FREE_TRIAL_URL
        Assert.assertTrue(driver().getCurrentUrl().contains(Constants.ORDER_URL), "Expected URL: " + Constants.ORDER_URL + ". Current URL: " + driver().getCurrentUrl() + "\n");

     // Actions.mainActions().openPage(Constants.FREE_TRIAL_URL);
     // Pages.freeTrialPage().clickLinkOrderNow();
     // Pages.freeTrialPage().waitLinkOrderNowDisappear();
     // Assert.assertTrue(driver().getCurrentUrl().contains(Constants.ORDER_FREE_TRIAL_URL), "Expected URL: " + Constants.ORDER_FREE_TRIAL_URL + ". Current URL: " + driver().getCurrentUrl() + "\n");

     // Actions.mainActions().openPage(Constants.ORDER_FREE_TRIAL_URL);
     // Pages.orderFreeTrialPage().selectProductBySupplyType(Constants.FREE_TRIAL_SUPPLY);
     // Pages.orderFreeTrialPage().waitSelectProductDisappear(Constants.FREE_TRIAL_SUPPLY);
     // Assert.assertTrue(driver().getCurrentUrl().contains(Constants.CHECKOUT_URL), "Expected URL: " + Constants.CHECKOUT_URL + ". Current URL: " + driver().getCurrentUrl() + "\n");
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
     // Assert.assertTrue(driver().getCurrentUrl().contains(Constants.SLEEP_SPRAYABLE_VIP_URL), "Expected URL: " + Constants.SLEEP_SPRAYABLE_VIP_URL + ". Current URL: " + driver().getCurrentUrl() + "\n");
        Actions.sleepSprayableVipActions().clickButtonBuyNow();

        Actions.mainActions().wait(Constants.MINIMUM_TIMEOUT_SECONDS);
        Assert.assertTrue(driver().getCurrentUrl().contains(Constants.CHECKOUT_URL), "Expected URL: " + Constants.CHECKOUT_URL + ". Current URL: " + driver().getCurrentUrl() + "\n");
        Actions.checkoutAction().checkOutOrder(orderData);
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
     // Assert.assertTrue(driver().getCurrentUrl().contains(Constants.SPECIAL_OFFERS_URL), "Expected URL: " + Constants.SPECIAL_OFFERS_URL + ". Current URL: " + driver().getCurrentUrl() + "\n");
     // Pages.specialOffersPage().clickAddToMyOrderButton();
        Assert.assertTrue(Pages.thankyouPage().isConfirmOrderMessagePressent(), "Thank you page is not opened.");
        Assert.assertTrue(driver().getCurrentUrl().contains(Constants.THANK_YOU_URL), "Expected URL: " + Constants.THANK_YOU_URL + ". Current URL: " + driver().getCurrentUrl() + "\n");
    }
    */

    @Test
    public void testMiniVideoFunnel1V1() {
        Actions.mainActions().clearSession();
        Actions.mainActions().openPage(Constants.SPRAYABLE_SLEEP_SPECIAL_OFFER_URL);
        Actions.mainActions().wait(Constants.MINIMUM_TIMEOUT_SECONDS);

        Actions.sleepSpecialOfferActions().clickReadyToBuyNow();
        Assert.assertTrue(Actions.sleepSpecialOfferActions().isUpperTitleEnable(), "upper title of the page in not enabled");

    }

    @Test
    public void testMiniVideoFunnel1V2() {
        Actions.mainActions().clearSession();
        Actions.mainActions().openPage(Constants.SPRAYABLE_SLEEP_SPECIAL_OFFER_URL);
        Actions.mainActions().wait(Constants.MINIMUM_TIMEOUT_SECONDS);

        Actions.sleepSpecialOfferActions().clickBuyNow();

        Assert.assertTrue(driver().getCurrentUrl().contains(Constants.CHECKOUT_URL), "Expected URL: " + Constants.CHECKOUT_URL + ". Current URL: " + driver().getCurrentUrl() + "\n");
        Actions.mainActions().wait(Constants.MINIMUM_TIMEOUT_SECONDS);
        Actions.checkoutAction().checkOutOrder(orderData);

        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Assert.assertTrue(Pages.thankyouPage().isConfirmOrderMessagePressent(), "Thank you page is not opened.");
        Assert.assertTrue(driver().getCurrentUrl().contains(Constants.THANK_YOU_URL), "Expected URL: " + Constants.THANK_YOU_URL + ". Current URL: " + driver().getCurrentUrl() + "\n");

    }


    @Test
    public void testMiniVideoFunnel1V3() {
        Actions.mainActions().clearSession();
        Actions.mainActions().openPage(Constants.SPRAYABLE_SLEEP_SPECIAL_OFFER_URL);
        Actions.mainActions().wait(Constants.MINIMUM_TIMEOUT_SECONDS);

        Actions.sleepSpecialOfferActions().clickFooterBuyNow();

        Assert.assertTrue(driver().getCurrentUrl().contains(Constants.CHECKOUT_URL), "Expected URL: " + Constants.CHECKOUT_URL + ". Current URL: " + driver().getCurrentUrl() + "\n");
        Actions.mainActions().wait(Constants.MINIMUM_TIMEOUT_SECONDS);
        Actions.checkoutAction().checkOutOrder(orderData);

        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Assert.assertTrue(Pages.thankyouPage().isConfirmOrderMessagePressent(), "Thank you page is not opened.");
        Assert.assertTrue(driver().getCurrentUrl().contains(Constants.THANK_YOU_URL), "Expected URL: " + Constants.THANK_YOU_URL + ". Current URL: " + driver().getCurrentUrl() + "\n");
    }
}