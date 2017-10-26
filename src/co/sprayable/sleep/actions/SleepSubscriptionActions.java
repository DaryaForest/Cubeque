package co.sprayable.sleep.actions;


import co.sprayable.sleep.pages.Pages;
import qa.util.base.BaseActions;

public class SleepSubscriptionActions extends BaseActions{
    public void clickSubscribeNowHeader(){
        Pages.sleepSubscriptionPage().scrollToHeaderLinkSubscribeNow();
        Pages.sleepSubscriptionPage().clickHeaderLinkSubscribeNow();
    }
    public void clickSubscribeNowFooter(){
        Pages.sleepSubscriptionPage().scrollToFooterLinkSubscribeNow();
        Pages.sleepSubscriptionPage().clickFooterLinkSubscribeNow();
    }
    public void clickReadyToTry(){
        Pages.sleepSubscriptionPage().scrollToRedyToTry();
        Pages.sleepSubscriptionPage().clickLinkReadyToTry();
    }
}
