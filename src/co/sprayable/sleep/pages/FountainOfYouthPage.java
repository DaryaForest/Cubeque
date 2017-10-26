package co.sprayable.sleep.pages;

import qa.util.base.BasePage;
import qa.util.base.Locator;
import qa.util.base.LocatorTypes;


public class FountainOfYouthPage extends BasePage {

    private Locator footerGetSprayable = new Locator(LocatorTypes.XPATH, "//a[text()='Get Sprayable Energy for 25% OFF ']");
    private Locator middleGetSprayable = new Locator(LocatorTypes.XPATH, "//a[text()='Get Sprayable Energy (25% OFF for a few hours!)']");
//    private Locator middleOfThePage = new Locator(LocatorTypes.XPATH, "//div[contains(@data-widget-id,'788a24140bb2')]");
//    private Locator footerOfThePage = new Locator(LocatorTypes.XPATH, "//div[contains(@data-widget-id,'e9ffa161639f')]");

    public void scrollToGetSprayableButton(){
        scrollToElement2("scroll to 'Get Sprayable' button in the middle of the page", middleGetSprayable);
    }

    public void scrollToFooterGetSprayableButton(){
        scrollToElement2("scroll to footer 'Get Sprayable' button in the footer of the page", footerGetSprayable);
    }

    public void clickMiddleGetSprayable(){
        waitToBeClickable2("waiting for link 'Get Sprayable' become clickable",middleGetSprayable);
        click2("click link 'Get Sprayable'", middleGetSprayable);
    }

    public void clickFooterGetSprayable(){
        waitToBeClickable2("waiting for footer link 'Get Sprayable' become clickable", footerGetSprayable);
        click2("click link 'Get Sprayable'", footerGetSprayable);
    }
}
