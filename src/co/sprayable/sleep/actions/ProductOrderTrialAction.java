package co.sprayable.sleep.actions;

import co.sprayable.sleep.pages.Pages;
import qa.util.base.BaseActions;


public class ProductOrderTrialAction extends BaseActions {

    public void clickBuyNow(){
        Pages.productOrderTrialPage().clickLinkBuyNow();
    }

    public void clickReadyToBuyNow(){
        Pages.productOrderTrialPage().scrollToLinkReadyToBuyNow();
        Pages.productOrderTrialPage().clickLinkReadyToBuyNow();
    }

    public void clickFooterBuyNow(){
        Pages.productOrderTrialPage().scrollToFooterPage();
        Pages.productOrderTrialPage().clickLinkBuyNow();
    }
}
