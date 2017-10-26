package co.sprayable.sleep.pages;

import qa.util.base.BasePage;
import qa.util.base.Locator;
import qa.util.base.LocatorTypes;

public class EnergySubscriptionPage extends BasePage {
    private Locator  subscribeNow = new Locator(LocatorTypes.XPATH,
            "//div[contains(text(),'SUBSCRIBE NOW')]");

    public void clickSubscribeNow() {
        waitToBeClickable("waiting for link 'SUBSCRIBE NOW' become clickable", subscribeNow);
        click("click link 'SUBSCRIBE NOW'", subscribeNow);
    }

    public void scrollSubscribeNow() {
        scrollToElement("scroll to 'SUBSCRIBE NOW' button", subscribeNow);
    }

}
