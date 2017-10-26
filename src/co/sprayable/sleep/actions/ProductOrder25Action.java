package co.sprayable.sleep.actions;

import co.sprayable.sleep.pages.Pages;
import qa.util.Constants;
import qa.util.base.BaseActions;


public class ProductOrder25Action extends BaseActions {

    public void clickHeaderBuyNow() {
        Pages.productOrder25Page().clickHeaderLinkSubscribeNow();
    }

    public void clickReadyToBuyNow() {
        Pages.productOrder25Page().scrollToRedyToTry();
        Pages.productOrder25Page().clickLinkReadyToTry();
    }

    public void clickFooterBuyNow() {
        Pages.productOrder25Page().scrollToFooterLinkSubscribeNow();
        Pages.productOrder25Page().clickFooterLinkSubscribeNow();
    }

//    public void clickButtonReadyToBuy() {
//        Pages.productOrder25Page().scrollAndClickReadyToTrySprayable();
//    }
//
//    public void scrollToFooterAndClickLinkBuyNowES() {
//        Pages.productOrder25Page().scrollToFooterLinkSubscribeNow();
//        Pages.productOrder25Page().clickLinkBuyNowES();
//    }
//    public void scrollToFooterAndClickLinkBuyNow() {
//        Pages.productOrder25Page().scrollToFooterLinkSubscribeNow();
//        Actions.mainActions().wait(Constants.MINIMUM_TIMEOUT_SECONDS);
//        Pages.productOrder25Page().clickHeaderLinkSubscribeNow();
//    }
//
//    public void scrollToFooterAndClickFreeTrial() {
//        Pages.productOrder25Page().moveToPage();
//        Pages.productOrder25Page().moveToAddressLine();
//        Pages.productOrder25Page().scrollToFreeTrialLink();
//        Pages.productOrder25Page().clickLinkShowMeFreeTrial();
//    }
//    public boolean isUpperTitleEnable(){
//        return Pages.productOrder25Page().isUpperTitleVisible();
//    }


}
