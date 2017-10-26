package co.sprayable.sleep.actions;

import co.sprayable.sleep.pages.Pages;
import qa.util.base.BaseActions;


public class EnergyProductOrderAction extends BaseActions {

    public void clickTopBuyNow(){
        Pages.energyProductOrderPage().clickHeaderLinkSubscribeNow();
    }

    public void clickMiddleBuyNow(){
        Pages.energyProductOrderPage().scrollToRedyToTry();
        Pages.energyProductOrderPage().clickLinkReadyToTry();
    }

    public void clickFooterBuyNow(){
        Pages.energyProductOrderPage().scrollToFooterLinkSubscribeNow();
        Pages.energyProductOrderPage().clickFooterLinkSubscribeNow();
    }
}
