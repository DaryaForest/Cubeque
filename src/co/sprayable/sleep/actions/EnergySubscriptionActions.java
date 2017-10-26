package co.sprayable.sleep.actions;


import co.sprayable.sleep.pages.Pages;
import qa.util.base.BaseActions;

public class EnergySubscriptionActions extends BaseActions{
    public void subscribeNowButtClick(){
        Pages.energySubscriptionPage().scrollSubscribeNow();
        Pages.energySubscriptionPage().clickSubscribeNow();
    }

}
