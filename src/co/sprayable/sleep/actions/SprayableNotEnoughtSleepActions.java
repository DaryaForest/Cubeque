package co.sprayable.sleep.actions;


import co.sprayable.sleep.pages.Pages;
import qa.util.base.BaseActions;

public class SprayableNotEnoughtSleepActions extends BaseActions{
    public void clickMiddlePageButton(){
        Pages.sprayableNotEnoughtSleepPage().scrollToMiddleOfThePage();
        Pages.sprayableNotEnoughtSleepPage().clickMiddle25Off();
    }

    public void clickFooterPageButton(){
        Pages.sprayableNotEnoughtSleepPage().scrollToFooterOfThePage();
        Pages.sprayableNotEnoughtSleepPage().clickFooter25Off();
    }
}
