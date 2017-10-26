package co.sprayable.sleep.pages;


import qa.util.base.BasePage;
import qa.util.base.Locator;
import qa.util.base.LocatorTypes;

public class EnergyToSparePage extends BasePage{
    private Locator addToCard1 = new Locator(LocatorTypes.CSS, "div#hero a");
    private Locator addToCard2 = new Locator(LocatorTypes.CSS, "div#introducing a");
    private Locator getStarted = new Locator(LocatorTypes.CSS, "div#get-your-life-back a");
    private Locator orderNow = new Locator(LocatorTypes.CSS, "div#guarantee a");




    public void clickaddToCard1(){
        waitToBeClickable("waiting for link 'addToCard1' become clickable", addToCard1);
        click("click link 'addToCard1'", addToCard1);
    }

    public void scrollToAddToCard1(){
        scrollToElement("scroll to 'addToCard1' button",addToCard1);
    }

    public void clickaddToCard2(){
        waitToBeClickable("waiting for link 'addToCard2' become clickable", addToCard2);
        click("click link 'addToCard1'", addToCard2);
    }

    public void scrollToAddToCard2(){
        scrollToElement("scroll to 'addToCard2' button",addToCard2);
    }

    public void clickGetStarted(){
        waitToBeClickable("waiting for link 'getStarted' become clickable", getStarted);
        click("click link 'getStarted'", getStarted);
    }

    public void scrollToGetStarted(){
        scrollToElement("scroll to 'getStarted' button",getStarted);
    }

    public void clickOrderNow(){
        waitToBeClickable("waiting for link 'orderNow' become clickable", orderNow);
        click("click link 'addToCard1'", orderNow);
    }

    public void scrollToOrderNow(){
        scrollToElement("scroll to 'orderNow' button",orderNow);
    }

}
