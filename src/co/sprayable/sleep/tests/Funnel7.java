package co.sprayable.sleep.tests;

import co.sprayable.sleep.actions.Actions;
import co.sprayable.sleep.data.OrderData;
import co.sprayable.sleep.data.QuizData;
import co.sprayable.sleep.pages.Pages;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import qa.util.Constants;
import qa.util.base.BaseTest;

import java.awt.*;

public class Funnel7 extends BaseTest {

    private QuizData quizData = new QuizData();
    private OrderData orderData = new OrderData();

    @BeforeClass
    private void genTestData() {
        quizData = quizData.generateQuizData();
        orderData = orderData.generateOrderData();
    }

    @Test
    public void funnelTestSevenV1() {
        Actions.mainActions().clearSession();
        Actions.mainActions().openPage(Constants.SPRAYABLE_SLEEP_WHAT_IS_YOUR_SLEEP_TYPE_SLEEP_QUIZ_3_URL);
        Actions.mainActions().wait(Constants.MINIMUM_TIMEOUT_SECONDS);

        Actions.takeSleepTypeQuizAction().takeSleepTypeQuiz(quizData, true);

        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Assert.assertTrue(driver().getCurrentUrl().contains(Constants.TYPES_URL), "Expected URL: " + Constants.TYPES_URL + ". Current URL: " + driver().getCurrentUrl() + "\n");
        Pages.sleepTypeDiscountOfferPage().clickLearnMoreButton();

        // Pages.fallAsleepFasterPage().clickAddToCart();
        //  Pages.fallAsleepFasterPage().clickYesPleaseButton();

        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Assert.assertTrue(driver().getCurrentUrl().contains(Constants.FIND_OUT_MORE), "Expected URL: " + Constants.FIND_OUT_MORE + ". Current URL: " + driver().getCurrentUrl() + "\n");

        // Pages.sleepTypeDiscountOfferPage().clickLearnMoreButton();

        Actions.findOutMoreActions().clickUpperBuyItNow();
        Assert.assertTrue(driver().getCurrentUrl().contains(Constants.CHECKOUT_URL), "Expected URL: " + Constants.CHECKOUT_URL + ". Current URL: " + driver().getCurrentUrl() + "\n");
        Actions.mainActions().wait(Constants.MINIMUM_TIMEOUT_SECONDS);
        Actions.checkoutAction().checkOutOrder(orderData);
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        // Assert.assertTrue(driver().getCurrentUrl().contains(Constants.SPECIAL_OFFERS_URL), "Expected URL: " + Constants.SPECIAL_OFFERS_URL + ". Current URL: " + driver().getCurrentUrl() + "\n");
        // Pages.specialOffersPage().clickAddToMyOrderButton();
        Assert.assertTrue(Pages.thankyouPage().isConfirmOrderMessagePressent(), "Thank you page is not opened.");
        Assert.assertTrue(driver().getCurrentUrl().contains(Constants.THANK_YOU_URL), "Expected URL: " + Constants.THANK_YOU_URL + ". Current URL: " + driver().getCurrentUrl() + "\n");
    }

    @Test
    public void funnelTestSevenV2() {
        Actions.mainActions().clearSession();
        Actions.mainActions().openPage(Constants.SPRAYABLE_SLEEP_WHAT_IS_YOUR_SLEEP_TYPE_SLEEP_QUIZ_3_URL);
        Actions.mainActions().wait(Constants.MINIMUM_TIMEOUT_SECONDS);

        Actions.takeSleepTypeQuizAction().takeSleepTypeQuiz(quizData, true);

        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Assert.assertTrue(driver().getCurrentUrl().contains(Constants.TYPES_URL), "Expected URL: " + Constants.TYPES_URL + ". Current URL: " + driver().getCurrentUrl() + "\n");
        Pages.sleepTypeDiscountOfferPage().clickLearnMoreButton();

        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Assert.assertTrue(driver().getCurrentUrl().contains(Constants.FIND_OUT_MORE), "Expected URL: " + Constants.FIND_OUT_MORE + ". Current URL: " + driver().getCurrentUrl() + "\n");
        Actions.findOutMoreActions().clickMiddleReadyToTrySprayable();

        Assert.assertTrue(Actions.findOutMoreActions().isUpperTitleEnable(), "Upper title is not enable.");

    }


    @Test
    public void funnelTestSevenV3() {
        Actions.mainActions().clearSession();
        Actions.mainActions().openPage(Constants.SPRAYABLE_SLEEP_WHAT_IS_YOUR_SLEEP_TYPE_SLEEP_QUIZ_3_URL);
        Actions.mainActions().wait(Constants.MINIMUM_TIMEOUT_SECONDS);

        Actions.takeSleepTypeQuizAction().takeSleepTypeQuiz(quizData, true);

        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Assert.assertTrue(driver().getCurrentUrl().contains(Constants.TYPES_URL), "Expected URL: " + Constants.TYPES_URL + ". Current URL: " + driver().getCurrentUrl() + "\n");
        Pages.sleepTypeDiscountOfferPage().clickLearnMoreButton();

        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Assert.assertTrue(driver().getCurrentUrl().contains(Constants.FIND_OUT_MORE), "Expected URL: " + Constants.FIND_OUT_MORE + ". Current URL: " + driver().getCurrentUrl() + "\n");

        // Pages.fallAsleepFasterPage().clickNoThanksButton();
        //  Pages.fallAsleepFasterPage().clickSetMonthTrial();
        // Pages.fallAsleepFasterPage().clickAddOneTime();
        Actions.findOutMoreActions().clickFooterBuyItNow();
        Assert.assertTrue(driver().getCurrentUrl().contains(Constants.CHECKOUT_URL), "Expected URL: " + Constants.CHECKOUT_URL + ". Current URL: " + driver().getCurrentUrl() + "\n");
        Actions.mainActions().wait(Constants.MINIMUM_TIMEOUT_SECONDS);
        Actions.checkoutAction().checkOutOrder(orderData);
        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);

        // Assert.assertTrue(driver().getCurrentUrl().contains(Constants.SPECIAL_OFFERS_URL), "Expected URL: " + Constants.SPECIAL_OFFERS_URL + ". Current URL: " + driver().getCurrentUrl() + "\n");
        // Pages.specialOffersPage().clickAddToMyOrderButton();
        Assert.assertTrue(Pages.thankyouPage().isConfirmOrderMessagePressent(), "Thank you page is not opened.");
        Assert.assertTrue(driver().getCurrentUrl().contains(Constants.THANK_YOU_URL), "Expected URL: " + Constants.THANK_YOU_URL + ". Current URL: " + driver().getCurrentUrl() + "\n");
    }
}