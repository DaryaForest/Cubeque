package co.sprayable.sleep.actions;

import co.sprayable.sleep.pages.Pages;
import qa.util.base.BaseActions;


public class FountainOfYouthAction extends BaseActions {

    public void clickMiddleGetSprayable(){
        Pages.fountainOfYouthPage().scrollToGetSprayableButton();
        Pages.fountainOfYouthPage().clickMiddleGetSprayable();
    }

    public void clickFooterGetSprayable(){
        Pages.fountainOfYouthPage().scrollToFooterGetSprayableButton();
        Pages.fountainOfYouthPage().clickFooterGetSprayable();
    }


}
