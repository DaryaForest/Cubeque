package co.sprayable.sleep.actions;

import co.sprayable.sleep.pages.Pages;
import qa.util.base.BaseActions;


public class EnergyVipActions extends BaseActions {
    public void clickMiddleBuyNow(){
        Pages.energyVipPage().scrollToMiddleOfThePage();
        Pages.energyVipPage().clickMiddleLinkBuyNow();
    }

    public void clickTopLinkBuyNow() {
        Pages.energyVipPage().clickTopLinkBuyNow();
    }

    public void clickFooterLinkBuyNow() {
        Pages.energyVipPage().clickFooterLinkBuyNow();
    }


}
