package co.sprayable.sleep.actions;

import co.sprayable.sleep.pages.Pages;
import qa.util.base.BaseActions;


public class EnergyTrialAction extends BaseActions {
    public void clickMiddleBuyNow() {
        Pages.energyTrialPage().scrollToMiddleOfThePage();
        Pages.energyTrialPage().clickMiddleLinkBuyNow();
    }
}
