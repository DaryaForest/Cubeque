package co.sprayable.sleep.tests;


import co.sprayable.sleep.actions.Actions;
import co.sprayable.sleep.data.OrderData;
import co.sprayable.sleep.pages.Pages;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import qa.util.Constants;
import qa.util.base.BaseTest;

public class EnergyHome extends BaseTest{
    private OrderData orderData = new OrderData();

    @BeforeClass
    private void genTestData() {
        orderData = orderData.generateOrderData();
    }

    @Test
    public void EnergyHome1() {
        Actions.mainActions().clearSession();
        Actions.mainActions().openPage(Constants.ENERGY_SPRAYABLE_HOME);
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Actions.energyHomeActions().clickMiddlePageButton();

        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Assert.assertTrue(driver().getCurrentUrl().contains(Constants.ENERGY_PRODUCT_ORDER_25), "Expected URL: " +
                Constants.ENERGY_PRODUCT_ORDER_25 + ". Current URL: " + driver().getCurrentUrl() + "\n");

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

    @Test
    public void EnergyHome2() {
        Actions.mainActions().clearSession();
        Actions.mainActions().openPage(Constants.ENERGY_SPRAYABLE_HOME);
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Actions.energyHomeActions().clickFooterPageButton();

        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Assert.assertTrue(driver().getCurrentUrl().contains(Constants.ENERGY_PRODUCT_ORDER_25), "Expected URL: " +
                Constants.ENERGY_PRODUCT_ORDER_25 + ". Current URL: " + driver().getCurrentUrl() + "\n");
        Actions.productOrder25Action().clickReadyToBuyNow();
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
    }

    @Test
    public void EnergyHome3() {
        Actions.mainActions().clearSession();
        Actions.mainActions().openPage(Constants.ENERGY_SPRAYABLE_HOME);
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Actions.energyHomeActions().clickMiddlePageButton();

        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Assert.assertTrue(driver().getCurrentUrl().contains(Constants.ENERGY_PRODUCT_ORDER_25), "Expected URL: " +
                Constants.ENERGY_PRODUCT_ORDER_25 + ". Current URL: " + driver().getCurrentUrl() + "\n");
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
}
