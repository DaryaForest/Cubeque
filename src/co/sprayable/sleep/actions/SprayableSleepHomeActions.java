package co.sprayable.sleep.actions;


import co.sprayable.sleep.pages.Pages;
import qa.util.base.BaseActions;

public class SprayableSleepHomeActions extends BaseActions{
    public void clickMiddlePageButton(){
        Pages.sprayableSleepHomePage().scrollToMiddleOfThePage();
        Pages.sprayableSleepHomePage().clickMiddle25Off();
    }

    public void clickFooterPageButton(){
        Pages.sprayableSleepHomePage().scrollToFooterOfThePage();
        Pages.sprayableSleepHomePage().clickFooter25Off();
    }
}
