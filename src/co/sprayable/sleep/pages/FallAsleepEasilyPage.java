package co.sprayable.sleep.pages;

import qa.util.base.BasePage;
import qa.util.base.Locator;
import qa.util.base.LocatorTypes;


public class FallAsleepEasilyPage extends BasePage {

    private Locator middle25Off = new Locator(LocatorTypes.CSS, "a.lp-button-react--large");
    private Locator footer25Off = new Locator(LocatorTypes.CSS, "a.lp-button-react--medium");

    public void scrollToMiddleOfThePage(){
        scrollToElement("scroll to 'Click here to buy sprayable today(25% off)' button", middle25Off);
    }

    public void scrollToFooterOfThePage(){
        scrollToElement("scroll to 'Buy it now to get sprayable 25% off' button", footer25Off);
    }

    public void clickMiddle25Off(){
        waitToBeClickable("waiting for link 'Click here to buy sprayable today(25% off)' become clickable", middle25Off);
        click("click link 'Click here to buy sprayable today(25% off)'", middle25Off);
    }

    public void clickFooter25Off(){
        waitToBeClickable("waiting for link 'Buy it now to get sprayable 25% off' become clickable", footer25Off);
        click("click link 'Buy it now to get sprayable 25% off'", footer25Off);
    }

}
