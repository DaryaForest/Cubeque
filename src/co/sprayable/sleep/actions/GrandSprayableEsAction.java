package co.sprayable.sleep.actions;

import co.sprayable.sleep.pages.Pages;
import qa.util.base.BaseActions;


public class GrandSprayableEsAction extends BaseActions {

    public void middlePageButtonClick(){
        Pages.grandSprayableEsPage().scrollToMiddleBuySpray();
    }

    public void footerBuyItNowClick(){
        Pages.grandSprayableEsPage().scrollToFooterBuyItNow();
    }

}
