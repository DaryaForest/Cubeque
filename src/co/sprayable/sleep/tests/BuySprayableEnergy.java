package co.sprayable.sleep.tests;


import co.sprayable.sleep.actions.Actions;
import co.sprayable.sleep.data.OrderData;
import co.sprayable.sleep.pages.Pages;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import qa.util.Constants;
import qa.util.base.BaseTest;

public class BuySprayableEnergy extends BaseTest{
    private OrderData orderData = new OrderData();

    @BeforeClass
    private void genTestData() {
        orderData = orderData.generateOrderData();
    }

    @Test
    public void BuySprayableEnergy1(){
        Actions.mainActions().clearSession();
        Actions.mainActions().openPage(Constants.BUY_SPRAYABLE_ENERGY);
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Actions.buySprayableEnergyActions().clickMiddlePageButton();

        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Assert.assertTrue(driver().getCurrentUrl().contains(Constants.PRODUCT_ORDER_25_ENERGY), "Expected URL: "
                + Constants.PRODUCT_ORDER_25_ENERGY + ". Current URL: " + driver().getCurrentUrl() + "\n");
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);

        Actions.productOrder25Action().clickFooterBuyNow();
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
    public void BuySprayableEnergy2() {
        Actions.mainActions().clearSession();
        Actions.mainActions().openPage(Constants.BUY_SPRAYABLE_ENERGY);
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Actions.buySprayableEnergyActions().clickFooterPageButton();

        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Assert.assertTrue(driver().getCurrentUrl().contains(Constants.PRODUCT_ORDER_25_ENERGY), "Expected URL: "
                + Constants.PRODUCT_ORDER_25_ENERGY + ". Current URL: " + driver().getCurrentUrl() + "\n");
        Actions.productOrder25Action().clickReadyToBuyNow();
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
    }

    @Test
    public void BuySprayableEnergy3() {
        Actions.mainActions().clearSession();
        Actions.mainActions().openPage(Constants.BUY_SPRAYABLE_ENERGY);
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Actions.buySprayableEnergyActions().clickMiddlePageButton();

        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Assert.assertTrue(driver().getCurrentUrl().contains(Constants.PRODUCT_ORDER_25_ENERGY), "Expected URL: "
                + Constants.PRODUCT_ORDER_25_ENERGY + ". Current URL: " + driver().getCurrentUrl() + "\n");
        Actions.productOrder25Action().clickFooterBuyNow();
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Assert.assertTrue(driver().getCurrentUrl().contains(Constants.CHECKOUT_URL), "Expected URL: " +
                Constants.CHECKOUT_URL + ". Current URL: " + driver().getCurrentUrl() + "\n");
        Actions.checkoutAction().checkOutOrder(orderData);
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);

        Assert.assertTrue(Pages.thankyouPage().isConfirmOrderMessagePressent(), "Thank you page is not opened.");
        Assert.assertTrue(driver().getCurrentUrl().contains(Constants.THANK_YOU_URL), "Expected URL: "
                + Constants.THANK_YOU_URL + ". Current URL: " + driver().getCurrentUrl() + "\n");
    }

}
