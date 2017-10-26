package co.sprayable.sleep.actions;


import co.sprayable.sleep.pages.Pages;
import qa.util.base.BaseActions;
import qa.util.base.BasePage;

public class EnergyToSpareAction extends BaseActions{
    public void clickaddToCard1(){
        Pages.energyToSparePage().scrollToAddToCard1();
        Pages.energyToSparePage().clickaddToCard1();
    }
    public void clickaddToCard2(){
        Pages.energyToSparePage().scrollToAddToCard2();
        Pages.energyToSparePage().clickaddToCard2();
    }
    public void clickgetStarted(){
        Pages.energyToSparePage().scrollToGetStarted();
        Pages.energyToSparePage().clickGetStarted();
    }
    public void clickorderNow(){
        Pages.energyToSparePage().scrollToOrderNow();
        Pages.energyToSparePage().clickOrderNow();
    }
}
