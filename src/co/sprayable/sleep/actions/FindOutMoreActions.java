package co.sprayable.sleep.actions;

/**
 * Created by User on 27.02.2017.
 */
import co.sprayable.sleep.pages.Pages;
import qa.util.base.BaseActions;


public class FindOutMoreActions extends BaseActions {

    public void clickUpperBuyItNow(){
        Pages.findOutMorePage().clickUpperBuyItNowLink();
    }

    public void clickMiddleReadyToTrySprayable(){
        Pages.findOutMorePage().clickReadyToTrySprayableLink();
    }

    public void clickFooterBuyItNow(){
        Pages.findOutMorePage().clickFooterBuyItNowLink();
    }

    public boolean isUpperTitleEnable(){
        wait(2);
        return Pages.findOutMorePage().isUpperTitleVisible();
    }
}
