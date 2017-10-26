package co.sprayable.sleep.tests;


import co.sprayable.sleep.actions.Actions;
import co.sprayable.sleep.data.OrderData;
import co.sprayable.sleep.pages.Pages;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import qa.util.Constants;
import qa.util.base.BaseTest;

public class SleepOrder25OffV2 extends BaseTest {
    private OrderData orderData = new OrderData();

    @BeforeClass
    private void genTestData() {
        orderData = orderData.generateOrderData();
    }

    @Test
    public void testSleepOrder25OffV21() {
        Actions.mainActions().clearSession();
        Actions.mainActions().openPage(Constants.COMPANIAS_FARMACEUTICAS_ODIAN);
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Actions.companiasFarmaceuticasOdianAction().clickMiddlePageButton();

        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Assert.assertTrue(driver().getCurrentUrl().contains(Constants.PRODUCT_ORDER_25_ES), "Expected URL: " +
                Constants.PRODUCT_ORDER_25_ES + ". Current URL: " + driver().getCurrentUrl() + "\n");
        Pages.productOrder25EsPage().clickHeaderLinkSubscribeNow();

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
    public void testSleepOrder25OffV22() {
        Actions.mainActions().clearSession();
        Actions.mainActions().openPage(Constants.COMPANIAS_FARMACEUTICAS_ODIAN);
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);        Actions.companiasFarmaceuticasOdianAction().clickFooterPageButton();

        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Assert.assertTrue(driver().getCurrentUrl().contains(Constants.PRODUCT_ORDER_25_ES), "Expected URL: " +
                Constants.PRODUCT_ORDER_25_ES + ". Current URL: " + driver().getCurrentUrl() + "\n");
        Pages.productOrder25EsPage().clickHeaderLinkSubscribeNow();
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
    public void testSleepOrder25OffV23() {
        Actions.mainActions().clearSession();
        Actions.mainActions().openPage(Constants.COMPANIAS_FARMACEUTICAS_ODIAN);
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Actions.companiasFarmaceuticasOdianAction().clickMiddlePageButton();

        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Assert.assertTrue(driver().getCurrentUrl().contains(Constants.PRODUCT_ORDER_25_ES), "Expected URL: " +
                Constants.PRODUCT_ORDER_25_ES + ". Current URL: " + driver().getCurrentUrl() + "\n");
        Actions.productOrder25EsActions().clickReadyToBuyNow();
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);

    }

    @Test
    public void testSleepOrder25OffV24() {
        Actions.mainActions().clearSession();
        Actions.mainActions().openPage(Constants.COMPANIAS_FARMACEUTICAS_ODIAN);
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Actions.companiasFarmaceuticasOdianAction().clickMiddlePageButton();

        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Assert.assertTrue(driver().getCurrentUrl().contains(Constants.PRODUCT_ORDER_25_ES), "Expected URL: " +
                Constants.PRODUCT_ORDER_25_ES + ". Current URL: " + driver().getCurrentUrl() + "\n");
        Actions.productOrder25EsActions().clickFooterBuyNow();

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


