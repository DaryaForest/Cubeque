package co.sprayable.sleep.actions;


import co.sprayable.sleep.pages.Pages;
import qa.util.base.BaseActions;

public class SleepIngredientsAction extends BaseActions{
    public void clickMiddlePageButton(){
        Pages.sleepIngredientsPage().scrollToMiddleOfThePage();
        Pages.sleepIngredientsPage().clickMiddle25Off();
    }

    public void clickFooterPageButton(){
        Pages.sleepIngredientsPage().scrollToFooterOfThePage();
        Pages.sleepIngredientsPage().clickFooter25Off();
    }

}
