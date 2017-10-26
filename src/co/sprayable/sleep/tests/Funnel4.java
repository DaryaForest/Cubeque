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

public class Funnel4 extends BaseTest {

    private QuizData quizData = new QuizData();
    private OrderData orderData = new OrderData();

    @BeforeClass
    private void genTestData() {
        quizData = quizData.generateQuizData();
        orderData = orderData.generateOrderData();
    }

    @Test
    public void funnelTestFour() {
        Actions.mainActions().clearSession();
        Actions.mainActions().openPage(Constants.THE_ULTIMATE_SLEEP_QUIZ_URL);
        Actions.mainActions().wait(Constants.MINIMUM_TIMEOUT_SECONDS);

        Actions.takeSleepTypeQuizAction().takeSleepTypeQuiz(quizData, true);

        Actions.mainActions().wait(Constants.SMALL_TIMEOUT_SECONDS);
        Assert.assertTrue(driver().getCurrentUrl().contains(Constants.THE_QUIZ_RESULT_URL), "Expected URL: " + Constants.THE_QUIZ_RESULT_URL + ". Current URL: " + driver().getCurrentUrl() + "\n");

        Pages.sleepTypeDiscountOfferPage().clickLearnMoreButton();

        Assert.assertTrue(driver().getCurrentUrl().contains(Constants.GETS_SLEEP_SAVE_URL), "Expected URL: " + Constants.GETS_SLEEP_SAVE_URL + ". Current URL: " + driver().getCurrentUrl() + "\n");

        Actions.getsSleepAction().getSleepQuiz(quizData);

        // Pages.orderGetSleepPage().waitSelectProduct(Constants.FREE_TRIAL_SUPPLY);

        Assert.assertTrue(driver().getCurrentUrl().contains(Constants.ORDER_GETS_SLEEP_SAVE_URL), "Expected URL: " + Constants.ORDER_GETS_SLEEP_SAVE_URL + ". Current URL: " + driver().getCurrentUrl() + "\n");
    }
}