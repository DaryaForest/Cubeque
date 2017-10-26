package co.sprayable.sleep.tests;


import co.sprayable.sleep.actions.Actions;
import co.sprayable.sleep.data.OrderData;
import co.sprayable.sleep.pages.Pages;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import qa.util.Constants;
import qa.util.base.BaseTest;

public class EightHoursNight extends BaseTest {
    private OrderData orderData = new OrderData();

    @BeforeClass
    private void genTestData() {
        orderData = orderData.generateOrderData();
    }

    @Test
    public void EightHoursNightV1() {
        Actions.mainActions().clearSession();
        Actions.mainActions().openPage(Constants.EIGHT_HOURS_A_NIGHT);
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Actions.eightHoursNightActions().clickToGetGreatNightButt();
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Assert.assertTrue(driver().getCurrentUrl().contains(Constants.PRODUCT_ORDER_25), "Expected URL: "
                + Constants.PRODUCT_ORDER_25 + ". Current URL: " + driver().getCurrentUrl() + "\n");
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Actions.productOrder25Action().clickHeaderBuyNow();//top
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
    public void EightHoursNightV2() {
        Actions.mainActions().clearSession();
        Actions.mainActions().openPage(Constants.EIGHT_HOURS_A_NIGHT);
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Actions.eightHoursNightActions().clickSimpliClickHereButt();
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Assert.assertTrue(driver().getCurrentUrl().contains(Constants.PRODUCT_ORDER_25), "Expected URL: "
                + Constants.PRODUCT_ORDER_25 + ". Current URL: " + driver().getCurrentUrl() + "\n");
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Actions.productOrder25Action().clickReadyToBuyNow();//middle
        Assert.assertTrue(driver().getCurrentUrl().contains(Constants.PRODUCT_ORDER_25), "Expected URL: "
                + Constants.PRODUCT_ORDER_25 + ". Current URL: " + driver().getCurrentUrl() + "\n");
    }

    @Test
    public void EightHoursNightV3() {
        Actions.mainActions().clearSession();
        Actions.mainActions().openPage(Constants.EIGHT_HOURS_A_NIGHT);
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Actions.eightHoursNightActions().clickClaimYourRiskFreeTrialButt1();
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Assert.assertTrue(driver().getCurrentUrl().contains(Constants.PRODUCT_ORDER_25), "Expected URL: "
                + Constants.PRODUCT_ORDER_25 + ". Current URL: " + driver().getCurrentUrl() + "\n");
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Actions.productOrder25Action().clickFooterBuyNow();//top
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
    public void EightHoursNightV4() {
        Actions.mainActions().clearSession();
        Actions.mainActions().openPage(Constants.EIGHT_HOURS_A_NIGHT);
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Actions.eightHoursNightActions().clickClaimYourRiskFreeTrialButt2();
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Assert.assertTrue(driver().getCurrentUrl().contains(Constants.PRODUCT_ORDER_25), "Expected URL: "
                + Constants.PRODUCT_ORDER_25 + ". Current URL: " + driver().getCurrentUrl() + "\n");
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Actions.productOrder25Action().clickHeaderBuyNow();//top
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
    public void EightHoursNightV5() {
        Actions.mainActions().clearSession();
        Actions.mainActions().openPage(Constants.EIGHT_HOURS_A_NIGHT);
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Actions.eightHoursNightActions().clickClaimYourRiskFreeTrialButt3();
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Assert.assertTrue(driver().getCurrentUrl().contains(Constants.PRODUCT_ORDER_25), "Expected URL: "
                + Constants.PRODUCT_ORDER_25 + ". Current URL: " + driver().getCurrentUrl() + "\n");
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Actions.productOrder25Action().clickHeaderBuyNow();//top
        Assert.assertTrue(driver().getCurrentUrl().contains(Constants.PRODUCT_ORDER_25), "Expected URL: "
                + Constants.PRODUCT_ORDER_25 + ". Current URL: " + driver().getCurrentUrl() + "\n");


    }

    @Test
    public void EightHoursNightV6() {
        Actions.mainActions().clearSession();
        Actions.mainActions().openPage(Constants.EIGHT_HOURS_A_NIGHT);
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Actions.eightHoursNightActions().clickClaimYourRiskFreeTrialButt4();
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Assert.assertTrue(driver().getCurrentUrl().contains(Constants.PRODUCT_ORDER_25), "Expected URL: " +
                Constants.PRODUCT_ORDER_25 + ". Current URL: " + driver().getCurrentUrl() + "\n");
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Actions.productOrder25Action().clickFooterBuyNow();
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
    public void EightHoursNightV7() {
        Actions.mainActions().clearSession();
        Actions.mainActions().openPage(Constants.EIGHT_HOURS_A_NIGHT);
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Actions.eightHoursNightActions().clickClaimYourRiskFreeTrialButt5();
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Assert.assertTrue(driver().getCurrentUrl().contains(Constants.PRODUCT_ORDER_25), "Expected URL: " +
                Constants.PRODUCT_ORDER_25 + ". Current URL: " + driver().getCurrentUrl() + "\n");
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Actions.productOrder25Action().clickHeaderBuyNow();
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
