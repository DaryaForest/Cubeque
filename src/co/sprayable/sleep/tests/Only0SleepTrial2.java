package co.sprayable.sleep.tests;

import co.sprayable.sleep.actions.Actions;
import co.sprayable.sleep.data.OrderData;
import co.sprayable.sleep.pages.Pages;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import qa.util.Constants;
import qa.util.base.BaseTest;

public class Only0SleepTrial2 extends BaseTest {

    private OrderData orderData = new OrderData();

    @BeforeClass
    private void genTestData() {
        orderData = orderData.generateOrderData();
    }

    @Test
    public void Only0SleepTrial21() {
        Actions.mainActions().clearSession();
        Actions.mainActions().openPage(Constants.TRY_SPRAYABLE_SLEEP_FIRST_MONTH_FREE);
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);

        Actions.trySprayablesSeepFirstMonthFreeAction().clickTopLinkBuyNow();
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Assert.assertTrue(driver().getCurrentUrl().contains(Constants.CHECKOUT_URL), "Expected URL: " + Constants.CHECKOUT_URL + ". Current URL: " + driver().getCurrentUrl() + "\n");

        Actions.checkoutAction().checkOutOrder(orderData);
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);

        Assert.assertTrue(Pages.thankyouPage().isConfirmOrderMessagePressent(), "Thank you page is not opened.");
        Assert.assertTrue(driver().getCurrentUrl().contains(Constants.THANK_YOU_URL), "Expected URL: " + Constants.THANK_YOU_URL + ". Current URL: " + driver().getCurrentUrl() + "\n");
    }


    @Test
    public void Only0SleepTrial22() {
        Actions.mainActions().clearSession();
        Actions.mainActions().openPage(Constants.TRY_SPRAYABLE_SLEEP_FIRST_MONTH_FREE);
        Actions.trySprayablesSeepFirstMonthFreeAction().clickMiddleBuyNow();
        Actions.mainActions().wait(Constants.MINIMUM_TIMEOUT_SECONDS);
        Assert.assertTrue(driver().getCurrentUrl().contains(Constants.TRY_SPRAYABLE_SLEEP_FIRST_MONTH_FREE), "Expected URL: " + Constants.TRY_SPRAYABLE_SLEEP_FIRST_MONTH_FREE + ". Current URL: " + driver().getCurrentUrl() + "\n");

    }


    @Test
    public  void Only0SleepTrial23(){
        Actions.mainActions().clearSession();
        Actions.mainActions().openPage(Constants.TRY_SPRAYABLE_SLEEP_FIRST_MONTH_FREE);


        Actions.trySprayablesSeepFirstMonthFreeAction().clickFooterLinkBuyNow();
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Assert.assertTrue(driver().getCurrentUrl().contains(Constants.CHECKOUT_URL), "Expected URL: " + Constants.ENERGY_VIP + ". Current URL: " + driver().getCurrentUrl() + "\n");


        Actions.checkoutAction().checkOutOrder(orderData);
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);

        Assert.assertTrue(Pages.thankyouPage().isConfirmOrderMessagePressent(), "Thank you page is not opened.");
        Assert.assertTrue(driver().getCurrentUrl().contains(Constants.THANK_YOU_URL), "Expected URL: " + Constants.THANK_YOU_URL + ". Current URL: " + driver().getCurrentUrl() + "\n");

    }

    /*@Test
    public void testOnly0SleepTrial2 () {
        Actions.mainActions().clearSession();
        Actions.mainActions().openPage(Constants.TRY_SPRAYABLE_SLEEP_FIRST_MONTH_FREE);

        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);

        Pages.trySprayablesSeepFirstMonthFreePage().clickLinkTakeTheFirstMonth();
        Pages.trySprayablesSeepFirstMonthFreePage().waitLinkTakeTheFirstMonthDisappear();

        Assert.assertTrue(driver().getCurrentUrl().contains(Constants.CHECKOUT_URL), "Expected URL: " + Constants.CHECKOUT_URL + ". Current URL: " + driver().getCurrentUrl() + "\n");
        Actions.checkoutAction().checkOutOrder(orderData);
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
    //  Assert.assertTrue(driver().getCurrentUrl().contains(Constants.SPECIAL_OFFERS_URL), "Expected URL: " + Constants.SPECIAL_OFFERS_URL + ". Current URL: " + driver().getCurrentUrl() + "\n");
    //  Pages.specialOffersPage().clickAddToMyOrderButton();
        Assert.assertTrue(Pages.thankyouPage().isConfirmOrderMessagePressent(), "Thank you page is not opened.");
        Assert.assertTrue(driver().getCurrentUrl().contains(Constants.THANK_YOU_URL), "Expected URL: " + Constants.THANK_YOU_URL + ". Current URL: " + driver().getCurrentUrl() + "\n");
    }
    */
}