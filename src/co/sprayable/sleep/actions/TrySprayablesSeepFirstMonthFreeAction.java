package co.sprayable.sleep.actions;

import co.sprayable.sleep.pages.Pages;
import qa.util.base.BaseActions;


public class TrySprayablesSeepFirstMonthFreeAction extends BaseActions{
    public TrySprayablesSeepFirstMonthFreeAction() {}

    public void clickMiddleBuyNow(){
        Pages.trySprayableSleepFirstMonthOneDollarPage().scrollToMiddleOfThePage();
        Pages.trySprayableSleepFirstMonthOneDollarPage().clickMiddleLinkBuyNow();
    }

    public void clickTopLinkBuyNow() {
        Pages.trySprayableSleepFirstMonthOneDollarPage().clickTopLinkBuyNow();
    }

    public void clickFooterLinkBuyNow() {

        Pages.trySprayableSleepFirstMonthOneDollarPage().clickFooterLinkBuyNow();
    }
}
