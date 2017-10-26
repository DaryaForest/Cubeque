package co.sprayable.sleep.actions;


import co.sprayable.sleep.data.OrderData;
import co.sprayable.sleep.pages.Pages;
import qa.util.Random;
import qa.util.base.BaseActions;

public class CheckOutActionNew extends BaseActions{


        public CheckOutActionNew() {}

        public void checkOutOrder(OrderData data) {
            Pages.chekoutPageNew().waitToOrderSurvey();
            Pages.chekoutPageNew().setFirstName(data.getFirstName());
            Pages.chekoutPageNew().setLastName(data.getLastName());
            Pages.chekoutPageNew().setAddress(Random.genAddress());
            Pages.chekoutPageNew().setCity(data.getCity());
            Pages.chekoutPageNew().setState(data.getState());
            Pages.chekoutPageNew().setZipCode(data.getZipCode());
            Pages.chekoutPageNew().selectCountryByName(data.getCountry());
            Pages.chekoutPageNew().setDaytimePhone(Random.genPhone());
            Pages.chekoutPageNew().setEveningPhone(Random.genPhone());
            Pages.chekoutPageNew().setEmail(Random.genEmail());
            Pages.chekoutPageNew().moveToBillingInfBlock();
            Pages.chekoutPageNew().setCardNumber(data.getCrediteCard());
            Pages.chekoutPageNew().selectExprMonth(data.getExprMonth());
            Pages.chekoutPageNew().selectExprYear(data.getExprYear());
            Pages.chekoutPageNew().setCVV(data.getCvv());
            Pages.chekoutPageNew().clickPlaceOrderButton();
        }
}
