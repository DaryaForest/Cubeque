package co.sprayable.sleep.actions;


import co.sprayable.sleep.pages.Pages;
import qa.util.base.BaseActions;

public class EnergyHomeActions extends BaseActions{
    public void clickMiddlePageButton(){
        Pages.energyHomePage().scrollToMiddleOfThePage();
        Pages.energyHomePage().clickMiddle25Off();
    }

    public void clickFooterPageButton(){
        Pages.energyHomePage().scrollToFooterOfThePage();
        Pages.energyHomePage().clickFooter25Off();
    }

}
