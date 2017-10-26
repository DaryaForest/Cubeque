package co.sprayable.sleep.actions;


import co.sprayable.sleep.pages.Pages;
import qa.util.base.BaseActions;

public class LandingStayAsleepLongerAction extends BaseActions {
    public void clickaddToCard1() {
        Pages.lendingStayAsleepLongerPage().scrollToAddToCard1();
        Pages.lendingStayAsleepLongerPage().clickaddToCard1();
    }

    public void clickaddToCard2() {
        Pages.lendingStayAsleepLongerPage().scrollToAddToCard2();
        Pages.lendingStayAsleepLongerPage().clickaddToCard2();
    }

    public void clickGetStarted() {
        Pages.lendingStayAsleepLongerPage().scrollToGetStarted();
        Pages.lendingStayAsleepLongerPage().clickGetStarted();
    }

    public void clickOrderNow() {
        Pages.lendingStayAsleepLongerPage().scrollToOrderNow();
        Pages.lendingStayAsleepLongerPage().clickOrderNow();
    }
}
