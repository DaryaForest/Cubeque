package co.sprayable.sleep.actions;

import co.sprayable.sleep.pages.Pages;
import qa.util.base.BaseActions;


public class CompaniasFarmaceuticasOdianAction extends BaseActions {

    public void clickMiddlePageButton(){
        Pages.companiasFarmaceuticasOdianPage().scrollToMiddleOfThePage();
        Pages.companiasFarmaceuticasOdianPage().clickMiddle25Off();
    }

    public void clickFooterPageButton(){
        Pages.companiasFarmaceuticasOdianPage().scrollToFooterOfThePage();
        Pages.companiasFarmaceuticasOdianPage().clickFooter25Off();

    }
}
