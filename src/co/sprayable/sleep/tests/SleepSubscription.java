package co.sprayable.sleep.tests;


import co.sprayable.sleep.actions.Actions;
import co.sprayable.sleep.data.OrderData;
import co.sprayable.sleep.pages.Pages;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import qa.util.Constants;
import qa.util.base.BaseTest;

public class SleepSubscription extends BaseTest {
    private OrderData orderData = new OrderData();

    @BeforeClass
    private void genTestData() {
        orderData = orderData.generateOrderData();
    }

    @Test
    public void SleepSubscription1() {
        Actions.mainActions().clearSession();
        Actions.mainActions().openPage(Constants.SLEEP_ORDER_SUBSCRIPTION);
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Actions.sleepSubscriptionActions().clickSubscribeNowHeader();
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Assert.assertTrue(driver().getCurrentUrl().contains(Constants.CHECKOUT_URL), "Expected URL: "
                + Constants.CHECKOUT_URL + ". Current URL: " + driver().getCurrentUrl() + "\n");
        Actions.checkoutAction().checkOutOrder(orderData);
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Assert.assertTrue(Pages.thankyouPage().isConfirmOrderMessagePressent(), "Thank you page is not opened.");
        Assert.assertTrue(driver().getCurrentUrl().contains(Constants.THANK_YOU_URL), "Expected URL: "
                + Constants.THANK_YOU_URL + ". Current URL: " + driver().getCurrentUrl() + "\n");
    }

    @Test
    public void SleepSubscription2(){
        Actions.mainActions().clearSession();
        Actions.mainActions().openPage(Constants.SLEEP_ORDER_SUBSCRIPTION);
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);

        Actions.sleepSubscriptionActions().clickReadyToTry();
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);

    }

    @Test
    public void SleepSubscription3() {
        Actions.mainActions().clearSession();
        Actions.mainActions().openPage(Constants.SLEEP_ORDER_SUBSCRIPTION);
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);

        Actions.sleepSubscriptionActions().clickSubscribeNowFooter();
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Assert.assertTrue(driver().getCurrentUrl().contains(Constants.CHECKOUT_URL), "Expected URL: "
                + Constants.CHECKOUT_URL + ". Current URL: " + driver().getCurrentUrl() + "\n");

        Actions.checkoutAction().checkOutOrder(orderData);
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Assert.assertTrue(Pages.thankyouPage().isConfirmOrderMessagePressent(), "Thank you page is not opened.");
        Assert.assertTrue(driver().getCurrentUrl().contains(Constants.THANK_YOU_URL), "Expected URL: "
                + Constants.THANK_YOU_URL + ". Current URL: " + driver().getCurrentUrl() + "\n");

    }
}


