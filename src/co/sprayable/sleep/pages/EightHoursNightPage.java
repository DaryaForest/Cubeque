package co.sprayable.sleep.pages;


import qa.util.base.BasePage;
import qa.util.base.Locator;
import qa.util.base.LocatorTypes;

public class EightHoursNightPage extends BasePage{
    //TODO
    private Locator getGreatNightButt = new Locator(LocatorTypes.XPATH,
            "//a[contains(text(),'Get a great night')]");
    private Locator simpliClickHereButt = new Locator(LocatorTypes.XPATH,
            "//a[contains(text(),'Simply click here to claim your trial order.')]");
    private Locator claimYourRiskFreeTrialButt1 = new Locator(LocatorTypes.XPATH,
            "//h2[contains(text(),'Your ')]/preceding-sibling::*[1]/a");
    private Locator claimYourRiskFreeTrialButt2 = new Locator(LocatorTypes.XPATH,
            "//h2[contains(text(),' Sprayable Sleep has sold out twice in the last 12 months')]/preceding-sibling::*[1]/a");
    private Locator claimYourRiskFreeTrialButt3 = new Locator(LocatorTypes.XPATH,
            "//h2[contains(text(),'Right now, you have 3 choices')]/preceding-sibling::*[1]/a");
    private Locator claimYourRiskFreeTrialButt4 = new Locator(LocatorTypes.XPATH,
            "//h2[contains(text(),'Say good-bye to the 3am blues!')]/preceding-sibling::*[1]/a");
    private Locator claimYourRiskFreeTrialButt5 = new Locator(LocatorTypes.XPATH,
            "//p[contains(text(),'Warm regards')]/preceding-sibling::*[1]/a");



    public void scrollToGetGreatNightButt(){
        scrollToElement2("scroll to getTheBestSleepOfYourLife button", getGreatNightButt);
    }
    public void scrollToSimpliClickHereButt(){
        scrollToElement("scroll to simpliClickHereButt button", simpliClickHereButt);
    }
    public void scrollToclaimYourRiskFreeTrialButt1(){
        scrollToElement("scroll to claimYourRiskFreeTrialButt1 button", claimYourRiskFreeTrialButt1);
    }
    public void scrollToClaimYourRiskFreeTrialButt2(){
        scrollToElement("scroll to claimYourRiskFreeTrialButt2 button", claimYourRiskFreeTrialButt2);
    }
    public void scrollToClaimYourRiskFreeTrialButt3(){
        scrollToElement("scroll to claimYourRiskFreeTrialButt3 button", claimYourRiskFreeTrialButt3);
    }
    public void scrollToClaimYourRiskFreeTrialButt4(){
        scrollToElement("scroll to claimYourRiskFreeTrialButt4 button", claimYourRiskFreeTrialButt4);
    }
    public void scrollToClaimYourRiskFreeTrialButt5(){
        scrollToElement("scroll to claimYourRiskFreeTrialButt5 button", claimYourRiskFreeTrialButt5);
    }


    public void clickToGetGreatNightButt(){
        waitToBeClickable2("waiting for link 'getGreatNightButt'", getGreatNightButt);
        click2("click link 'getGreatNightButt'", getGreatNightButt);
    }
    public void clickSimpliClickHereButt(){
        waitToBeClickable("waiting for link 'getGreatNightButt'", simpliClickHereButt);
        click("click link 'getGreatNightButt'", simpliClickHereButt);
    }
    public void clickClaimYourRiskFreeTrialButt1(){
        waitToBeClickable("waiting for link 'getGreatNightButt'", claimYourRiskFreeTrialButt1);
        click("click link 'getGreatNightButt'", claimYourRiskFreeTrialButt1);
    }
    public void clickClaimYourRiskFreeTrialButt2(){
        waitToBeClickable("waiting for link 'getGreatNightButt'", claimYourRiskFreeTrialButt2);
        click("click link 'getGreatNightButt'", claimYourRiskFreeTrialButt2);
    }
    public void clickClaimYourRiskFreeTrialButt3(){
        waitToBeClickable("waiting for link 'getGreatNightButt'", claimYourRiskFreeTrialButt3);
        click("click link 'getGreatNightButt'", claimYourRiskFreeTrialButt3);
    }
    public void clickClaimYourRiskFreeTrialButt4(){
        waitToBeClickable("waiting for link 'getGreatNightButt'", claimYourRiskFreeTrialButt4);
        click("click link 'getGreatNightButt'", claimYourRiskFreeTrialButt4);
    }
    public void clickClaimYourRiskFreeTrialButt5(){
        waitToBeClickable("waiting for link 'getGreatNightButt'", claimYourRiskFreeTrialButt5);
        click("click link 'getGreatNightButt'", claimYourRiskFreeTrialButt5);
    }


}

