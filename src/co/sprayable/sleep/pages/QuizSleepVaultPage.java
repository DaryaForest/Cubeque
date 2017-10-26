package co.sprayable.sleep.pages;

import qa.util.base.BasePage;
import qa.util.base.Locator;
import qa.util.base.LocatorTypes;


public class QuizSleepVaultPage extends BasePage {

    private Locator takeSleepQuizTop = new Locator(LocatorTypes.XPATH, "//div[contains(@class, 'alternative')]");
    private Locator takeSleepQuizFooter = new Locator(LocatorTypes.XPATH, "//div[contains(@class, 'narrow nocaps')]");

    public void clickTakeSleepQuizTop(){
        waitToBeClickable("wait for 'Click here to take the sleep quiz' button be clickable",takeSleepQuizTop);
        click("click 'Click here to take the sleep quiz",takeSleepQuizTop);
    }

    public void clickTakeSleepQuizFooter(){
        waitToBeClickable("wait for 'Click here to take the sleep quiz' button be clickable",takeSleepQuizFooter);
        click("click 'Click here to take the sleep quiz",takeSleepQuizFooter);
    }

    public void scrollToFooterTakeSleepQuiz(){
        scrollToElement("scroll to footer 'Click here to take the sleep quiz' button",takeSleepQuizFooter);
    }
}
