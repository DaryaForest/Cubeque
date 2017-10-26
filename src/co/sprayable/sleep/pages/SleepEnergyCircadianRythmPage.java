package co.sprayable.sleep.pages;


import qa.util.base.BasePage;
import qa.util.base.Locator;
import qa.util.base.LocatorTypes;

public class SleepEnergyCircadianRythmPage extends BasePage{
    private Locator liveALongerBut = new Locator(LocatorTypes.XPATH, "//a[contains(text(),'Cleanse Your Circadian Rhythm')]");
    private Locator cleanseYourCircadianRhythmBut = new Locator(LocatorTypes.XPATH, "//a[contains(text(),'Live a longer, healthier life with The Circadian Cleanse')]");

    private Locator clickHereToGetTheCircadianCleanseButt = new Locator(LocatorTypes.XPATH, "//a[contains(text(),'Click HERE to Get The Circadian Cleanse')]");

    public void scrollToClickHereToGetTheCircadianCleanseButt(){
        scrollToElement("scrolling to the 'Click HERE to Get The Circadian Cleanse' page button", clickHereToGetTheCircadianCleanseButt);
    }
    public void clickToClickHereToGetTheCircadianCleanseButt(){
        waitToBeClickable("wait for 'Click HERE to Get The Circadian Cleanse' button",clickHereToGetTheCircadianCleanseButt);
        click("click  middle page button", clickHereToGetTheCircadianCleanseButt);
    }


    public void scrollToLiveALongerBut(){
        scrollToElement("scrolling to the middle page button", liveALongerBut);
    }
    public void clickToLiveALongerBut(){
        waitToBeClickable("wait for 'Live a longer, healthier life with The Circadian Cleanse' button",liveALongerBut);
        click("click  middle page button", liveALongerBut);
    }

    public void scrollToCleanseYourCircadianRhythmBut(){
        scrollToElement("scrolling to the middle page button", cleanseYourCircadianRhythmBut);

    }
    public void clickToCleanseYourCircadianRhythmBut(){
        waitToBeClickable("wait for 'Cleanse Your Circadian Rhythm' button",cleanseYourCircadianRhythmBut);
        click("click  middle page button", cleanseYourCircadianRhythmBut);
    }
}
