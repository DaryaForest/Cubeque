package co.sprayable.sleep.actions;

import co.sprayable.sleep.pages.Pages;
import qa.util.base.BaseActions;

public class DiscountOfferAction extends BaseActions {
    public DiscountOfferAction() {}

    public void middlePageButtonClick(){
        Pages.discountOfferPage().scrollToMiddleBuySpray();
    }

    public void footerBuyItNowClick(){
        Pages.discountOfferPage().scrollToFooterBuyItNow();
    }

}
