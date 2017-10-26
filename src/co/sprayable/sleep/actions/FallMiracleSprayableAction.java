package co.sprayable.sleep.actions;

import co.sprayable.sleep.pages.Pages;
import qa.util.base.BaseActions;

/**
 * Created by user on 1/20/17.
 */
public class FallMiracleSprayableAction extends BaseActions {

    public void middlePageButtonClick(){
        Pages.fallMiracleSprayablePage().scrollToMiddleBuySpray();
    }

    public void footerBuyItNowClick(){
        Pages.fallMiracleSprayablePage().scrollToFooterBuyItNow();
    }
}
