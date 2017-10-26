package co.sprayable.sleep.actions;

import co.sprayable.sleep.pages.Pages;
import qa.util.base.BaseActions;


public class ThankYouSalesAction extends BaseActions {

    public void clickDownload(){
        Pages.thankYouSalesPhpPage().clickDownloadButton();
    }

    public void scrollAndClickTrySprayable(){
        Pages.thankYouSalesPhpPage().scrollToTrySprayable();
        Pages.thankYouSalesPhpPage().clickTrySprayable();
    }

    public void scrollAndClickIntroOrderNow(){
        Pages.thankYouSalesPhpPage().scrollToIntroducingBlock();
        Pages.thankYouSalesPhpPage().clickIntroOrderNow();
    }

    public void scrollAndClickPharmaCompaniesOrderNow(){
        Pages.thankYouSalesPhpPage().scrollPharmaCompaniesHateSprayBlock();
        Pages.thankYouSalesPhpPage().clickPharmaCompaniesOrderNow();
    }

    public void scrollAndClickDeepRestfulSleepOrderNow(){
        Pages.thankYouSalesPhpPage().scrollDeepRestfulSleepBlock();
        Pages.thankYouSalesPhpPage().clickDeepRestfulSleepOrderNow();
    }

    public void scrollAndClickFooterOrderNow(){
        Pages.thankYouSalesPhpPage().scrollToFooterBlock();
        Pages.thankYouSalesPhpPage().clickFooterOrderNow();
    }


}
