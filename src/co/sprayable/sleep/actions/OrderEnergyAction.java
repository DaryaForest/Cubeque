package co.sprayable.sleep.actions;

import co.sprayable.sleep.pages.Pages;
import qa.util.base.BaseActions;


public class OrderEnergyAction extends BaseActions {

    public void clickTopLinkBuyNowEnergy(){
        Pages.orderEnergyPage().clickBuyNowEnergyTopButton();
    }

    public void clickMiddleBuyNowButton(){
        Pages.orderEnergyPage().scrollToBuyNowMiddleButton();
        Pages.orderEnergyPage().clickMiddleBuyNowButton();
    }

    public void clickFooterLinkBuyNowEnergy(){
        Pages.orderEnergyPage().scrollToFooterBuyNowSection();
        Pages.orderEnergyPage().clickBuyNowEnergyTopButton();
    }




}
