package co.sprayable.sleep.actions;

import co.sprayable.sleep.data.OrderData;
import co.sprayable.sleep.pages.Pages;
import qa.util.base.BaseActions;


public class GetSprayableAction extends BaseActions {

    public void clickDownload(){
        Pages.getSprayablePage().clickDownloadButton();
    }

    public void fullFillModalWindow(OrderData orderData){
        Pages.getSprayablePage().waitForModalWindow();
        Pages.getSprayablePage().insertMailAddress(orderData.getEmail());
        Pages.getSprayablePage().clickSubmitButton();
    }
}
