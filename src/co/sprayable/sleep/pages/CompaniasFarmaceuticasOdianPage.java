package co.sprayable.sleep.pages;

import qa.util.base.BasePage;
import qa.util.base.Locator;
import qa.util.base.LocatorTypes;


public class CompaniasFarmaceuticasOdianPage extends BasePage {
//TODO text in locator definition
    private Locator middle25OffES = new Locator(LocatorTypes.CSS, "a.lp-button-react--medium");
    private Locator footer25OffES = new Locator(LocatorTypes.CSS, "a.lp-button-react--full");

    public void scrollToMiddleOfThePage(){
        scrollToElement2("scroll to 'Presiona Aquí para Comprar Sprayable Hoy (25% de descuento por pocas horas)' button", middle25OffES);
    }

    public void scrollToFooterOfThePage(){
        scrollToElement2("scroll to 'Cómpralo Ahora Para Conseguir Sprayable Con Un 25% de Descuento' button", footer25OffES);
    }

    public void clickMiddle25Off(){
        waitToBeClickable("waiting for link 'Presiona Aquí para Comprar Sprayable Hoy (25% de descuento por pocas horas)' become clickable", middle25OffES);
        click2("click link 'Presiona Aquí para Comprar Sprayable Hoy (25% de descuento por pocas horas)'", middle25OffES);
    }

    public void clickFooter25Off(){
        waitToBeClickable("waiting for link 'Cómpralo Ahora Para Conseguir Sprayable Con Un 25% de Descuento' become clickable", footer25OffES);
        click2("click link 'Cómpralo Ahora Para Conseguir Sprayable Con Un 25% de Descuento'", footer25OffES);
    }

}
