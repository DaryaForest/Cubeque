package co.sprayable.sleep.pages;


import qa.util.base.BasePage;
import qa.util.base.Locator;
import qa.util.base.LocatorTypes;

public class EnergyHomePage extends BasePage {
    private Locator middle25Off = new Locator(LocatorTypes.XPATH,
            "//a[contains(text(),'Click Here to Buy Sprayable Today (25% OFF for few hours)')]");
    private Locator footer25Off = new Locator(LocatorTypes.XPATH,
            "//a[contains(text(),'Buy It Now To Get Sprayable 25% OFF')]");

    public void scrollToMiddleOfThePage() {
        scrollToElement2("scroll to 'Click here to buy sprayable today(25% off)' button", middle25Off);
    }

    public void scrollToFooterOfThePage() {
        scrollToElement2("scroll to 'Buy it now to get sprayable 25% off' button", footer25Off);
    }

    public void clickMiddle25Off() {
        waitToBeClickable2("waiting for link 'Click here to buy sprayable today(25% off)' become clickable", middle25Off);
        click2("click link 'Click here to buy sprayable today(25% off)'", middle25Off);
    }

    public void clickFooter25Off() {
        waitToBeClickable2("waiting for link 'Buy it now to get sprayable 25% off' become clickable", footer25Off);
        click2("click link 'Buy it now to get sprayable 25% off'", footer25Off);
    }
}
