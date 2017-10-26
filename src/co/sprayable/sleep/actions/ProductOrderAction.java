package co.sprayable.sleep.actions;

import co.sprayable.sleep.pages.Pages;
import qa.util.base.BaseActions;


public class ProductOrderAction extends BaseActions {

    public void clickSubscribeNowHeader() {
        Pages.energyFreeTrialPage().scrollToHeaderLinkSubscribeNow();
        Pages.energyFreeTrialPage().clickHeaderLinkSubscribeNow();
    }

    public void clickSubscribeNowFooter() {
        Pages.energyFreeTrialPage().scrollToFooterLinkSubscribeNow();
        Pages.energyFreeTrialPage().clickFooterLinkSubscribeNow();
    }

    public void clickReadyToTry() {
        Pages.energyFreeTrialPage().scrollToRedyToTry();
        Pages.energyFreeTrialPage().clickLinkReadyToTry();
    }

}
