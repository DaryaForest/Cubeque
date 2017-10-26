package co.sprayable.sleep.actions;


import co.sprayable.sleep.pages.Pages;
import qa.util.base.BaseActions;


public class ProductOrder25EsActions extends BaseActions{
    public void clickReadyToBuyNow(){
        Pages.productOrder25EsPage().scrollToRedyToTry();
        Pages.productOrder25EsPage().clickLinkReadyToTry();
    }

    public void clickFooterBuyNow(){
        Pages.productOrder25EsPage().scrollToFooterLinkSubscribeNow();
        Pages.productOrder25EsPage().clickFooterLinkSubscribeNow();
    }

    public void clickHeaderLinkSubscribeNow() {
        Pages.productOrder25EsPage().scrollToHeaderLinkSubscribeNow();
        Pages.productOrder25EsPage().clickHeaderLinkSubscribeNow();
    }

}
