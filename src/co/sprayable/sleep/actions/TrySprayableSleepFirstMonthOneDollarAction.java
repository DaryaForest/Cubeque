package co.sprayable.sleep.actions;

import co.sprayable.sleep.pages.Pages;
import qa.util.base.BaseActions;


public class TrySprayableSleepFirstMonthOneDollarAction extends BaseActions{
    public TrySprayableSleepFirstMonthOneDollarAction() {}


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
