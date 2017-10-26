package co.sprayable.sleep.pages;


import qa.util.base.BasePage;
import qa.util.base.Locator;
import qa.util.base.LocatorTypes;

public class BuySprayableEnergyPage extends BasePage{
    private Locator middle25Off = new Locator(LocatorTypes.XPATH,
            "//a[contains(text(),'Get Sprayable Energy (25% OFF for a few hours!)')]");
    private Locator footer25Off = new Locator(LocatorTypes.XPATH,
            "//a[text()='(Until Midnight ONLY)']");

    public void scrollToMiddleOfThePage(){
        scrollToElement2("scroll to 'Get Sprayable Energy (25% OFF for a few hours!)' middle page button", middle25Off);
    }

    public void scrollToFooterOfThePage(){
        scrollToElement2("scroll to 'Get Sprayable Energy (Until Midnight ONLY)' footer page button", footer25Off);
    }

    public void clickMiddle25Off(){
        waitToBeClickable2("Waiting for link 'Get Sprayable Energy (25% OFF for a few hours!)' become clickable", middle25Off);
        click2("click link 'Get Sprayable Energy (25% OFF for a few hours!)'", middle25Off);
    }
    public void clickFooter25Off(){
        waitToBeClickable2("Waiting for link 'Get Sprayable Energy (Until Midnight ONLY)' become clickable", footer25Off);
        click2("click link 'Get Sprayable Energy (Until Midnight ONLY)'", footer25Off);
    }
}

