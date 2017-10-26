package co.sprayable.sleep.actions;


import co.sprayable.sleep.pages.Pages;
import qa.util.base.BaseActions;

public class EnergyFreeTrialAction extends BaseActions{
    public void clickBuyNowHeader(){
        Pages.energyFreeTrialPage().scrollToHeaderLinkSubscribeNow();
        Pages.energyFreeTrialPage().clickHeaderLinkSubscribeNow();
    }
    public void clickBuyNowFooter(){
        Pages.energyFreeTrialPage().scrollToFooterLinkSubscribeNow();
        Pages.energyFreeTrialPage().clickFooterLinkSubscribeNow();
    }
    public void clickReadyToTry(){
        Pages.energyFreeTrialPage().scrollToRedyToTry();
        Pages.energyFreeTrialPage().clickLinkReadyToTry();
    }
}
