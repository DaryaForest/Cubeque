package co.sprayable.sleep.actions;

import co.sprayable.sleep.pages.Pages;
import qa.util.base.BaseActions;


public class FallAsleepEasilyAction extends BaseActions {

    public void clickMiddlePageButton(){
        Pages.fallAsleepEasilyPage().scrollToMiddleOfThePage();
        Pages.fallAsleepEasilyPage().clickMiddle25Off();
    }

    public void clickFooterPageButton(){
        Pages.fallAsleepEasilyPage().scrollToFooterOfThePage();
        Pages.fallAsleepEasilyPage().clickFooter25Off();

    }

}
