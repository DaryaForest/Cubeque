package co.sprayable.sleep.tests;


import co.sprayable.sleep.actions.Actions;
import co.sprayable.sleep.data.OrderData;
import co.sprayable.sleep.pages.Pages;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import qa.util.Constants;
import qa.util.base.BaseTest;



public class EnergyFreeTrial extends BaseTest{
    private OrderData orderData = new OrderData();

    @BeforeClass
    private void genTestData() {
        orderData = orderData.generateOrderData();
    }

    @Test
    public void EnergyFreeTrial1() {
        Actions.mainActions().clearSession();
        Actions.mainActions().openPage(Constants.ENERGY_FREE_TRIAL);
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);

        Actions.energyFreeTrialAction().clickBuyNowHeader();
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
    public void EnergyFreeTrial2(){
        Actions.mainActions().clearSession();
        Actions.mainActions().openPage(Constants.ENERGY_FREE_TRIAL);
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Actions.energyFreeTrialAction().clickReadyToTry();
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);

    }

    @Test
    public void EnergyFreeTrial3() {
        Actions.mainActions().clearSession();
        Actions.mainActions().openPage(Constants.ENERGY_FREE_TRIAL);
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Actions.energyFreeTrialAction().clickBuyNowFooter();

        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Assert.assertTrue(driver().getCurrentUrl().contains(Constants.CHECKOUT_URL), "Expected URL: " +
                Constants.CHECKOUT_URL + ". Current URL: " + driver().getCurrentUrl() + "\n");
        Actions.checkoutAction().checkOutOrder(orderData);
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS2);
        Assert.assertTrue(Pages.thankyouPage().isConfirmOrderMessagePressent(), "Thank you page is not opened.");

    }
}
