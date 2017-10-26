package co.sprayable.sleep.actions;

import co.sprayable.sleep.pages.Pages;
import qa.util.base.BaseActions;

public class PharmaCompaniesHateMiracleSprayAction extends BaseActions{

    public void middlePageButtonClick(){
        Pages.pharmaCompaniesHateMiracleSpray().middlePageScrollDown();
    }
    public void footerPageButtonClick(){
        Pages.pharmaCompaniesHateMiracleSpray().footerPageScrollDown();
    }

}
