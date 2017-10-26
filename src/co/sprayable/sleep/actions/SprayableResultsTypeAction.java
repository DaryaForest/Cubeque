package co.sprayable.sleep.actions;

import co.sprayable.sleep.pages.Pages;
import qa.util.base.BaseActions;


public class SprayableResultsTypeAction extends BaseActions {

    public void scrollDownAndClickButton(){
        Pages.sprayableResultsTypePage().scrollToButton();
        Pages.sprayableResultsTypePage().clickBuyNowButton();

    }
}
