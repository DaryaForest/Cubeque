package co.sprayable.sleep.tests;

import co.sprayable.sleep.actions.Actions;
import co.sprayable.sleep.data.OrderData;
import co.sprayable.sleep.pages.Pages;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import qa.util.Constants;
import qa.util.base.BaseTest;


public class SleepOrderV1 extends BaseTest {

    private OrderData orderData = new OrderData();

    @BeforeClass
    private void genTestData() {
        orderData = orderData.generateOrderData();
    }

    @Test
    public void testSleepOrderV11() {

        Actions.mainActions().clearSession();
        Actions.mainActions().openPage(Constants.SLEEP_LANDING_STAY_ASLEEP_LONGER);
        Actions.landingStayAsleepLongerAction().clickaddToCard1();
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Actions.orderFreeTrialActions().clickHeaderBuyNow();
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Assert.assertTrue(driver().getCurrentUrl().contains(Constants.CHECKOUT_URL), "Expected URL: " +
                Constants.CHECKOUT_URL + ". Current URL: " + driver().getCurrentUrl() + "\n");
        Actions.checkoutAction().checkOutOrder(orderData);
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Assert.assertTrue(Pages.thankyouPage().isConfirmOrderMessagePressent(), "Thank you page is not opened.");
        Assert.assertTrue(driver().getCurrentUrl().contains(Constants.THANK_YOU_URL), "Expected URL: " +
                Constants.THANK_YOU_URL + ". Current URL: " + driver().getCurrentUrl() + "\n");
    }

    @Test
    public void testSleepOrderV12() {
        Actions.mainActions().clearSession();
        Actions.mainActions().openPage(Constants.SLEEP_LANDING_STAY_ASLEEP_LONGER);
        Actions.landingStayAsleepLongerAction().clickaddToCard2();
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);

        Assert.assertTrue(driver().getCurrentUrl().contains(Constants.SLEEP_PRODUCT_ORDER), "Expected URL: " +
                Constants.SLEEP_PRODUCT_ORDER + ". Current URL: " + driver().getCurrentUrl() + "\n");
        Actions.orderFreeTrialActions().clickReadyToBuyNow();
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Assert.assertTrue(driver().getCurrentUrl().contains(Constants.SLEEP_PRODUCT_ORDER), "Expected URL: " +
                Constants.SLEEP_PRODUCT_ORDER + ". Current URL: " + driver().getCurrentUrl() + "\n");
    }

    @Test
    public void testSleepOrderV13() {

        Actions.mainActions().clearSession();
        Actions.mainActions().openPage(Constants.SLEEP_LANDING_STAY_ASLEEP_LONGER);
        Actions.landingStayAsleepLongerAction().clickGetStarted();
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Assert.assertTrue(driver().getCurrentUrl().contains(Constants.SLEEP_PRODUCT_ORDER), "Expected URL: " +
                Constants.SLEEP_PRODUCT_ORDER + ". Current URL: " + driver().getCurrentUrl() + "\n");

        Actions.orderFreeTrialActions().clickFooterBuyNow();
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Assert.assertTrue(driver().getCurrentUrl().contains(Constants.CHECKOUT_URL), "Expected URL: " +
                Constants.CHECKOUT_URL + ". Current URL: " + driver().getCurrentUrl() + "\n");
        Actions.checkoutAction().checkOutOrder(orderData);
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Assert.assertTrue(Pages.thankyouPage().isConfirmOrderMessagePressent(), "Thank you page is not opened.");
        Assert.assertTrue(driver().getCurrentUrl().contains(Constants.THANK_YOU_URL), "Expected URL: " +
                Constants.THANK_YOU_URL + ". Current URL: " + driver().getCurrentUrl() + "\n");
    }

    @Test
    public void testSleepOrderV14() {
        Actions.mainActions().clearSession();
        Actions.mainActions().openPage(Constants.SLEEP_LANDING_STAY_ASLEEP_LONGER);
        Actions.landingStayAsleepLongerAction().clickOrderNow();
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Assert.assertTrue(driver().getCurrentUrl().contains(Constants.SLEEP_PRODUCT_ORDER), "Expected URL: " +
                Constants.SLEEP_PRODUCT_ORDER + ". Current URL: " + driver().getCurrentUrl() + "\n");
        Actions.orderFreeTrialActions().clickHeaderBuyNow();
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Assert.assertTrue(driver().getCurrentUrl().contains(Constants.CHECKOUT_URL), "Expected URL: " +
                Constants.CHECKOUT_URL + ". Current URL: " + driver().getCurrentUrl() + "\n");
        Actions.checkoutAction().checkOutOrder(orderData);
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Assert.assertTrue(Pages.thankyouPage().isConfirmOrderMessagePressent(), "Thank you page is not opened.");
        Assert.assertTrue(driver().getCurrentUrl().contains(Constants.THANK_YOU_URL), "Expected URL: " +
                Constants.THANK_YOU_URL + ". Current URL: " + driver().getCurrentUrl() + "\n");
    }


}