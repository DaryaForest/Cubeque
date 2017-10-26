package co.sprayable.sleep.actions;


import co.sprayable.sleep.pages.Pages;
import qa.util.base.BaseActions;

public class BuySprayableEnergyActions extends BaseActions{
    public void clickMiddlePageButton(){
        Pages.buySprayableEnergyPage().scrollToMiddleOfThePage();
        Pages.buySprayableEnergyPage().clickMiddle25Off();
    }

    public void clickFooterPageButton(){
        Pages.buySprayableEnergyPage().scrollToFooterOfThePage();
        Pages.buySprayableEnergyPage().clickFooter25Off();
    }
}
