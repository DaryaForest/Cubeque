package co.sprayable.sleep.pages;

import co.sprayable.sleep.data.OrderData;
import qa.util.base.BasePage;
import qa.util.base.Locator;
import qa.util.base.LocatorTypes;


public class GetSprayablePage extends BasePage {
    private Locator downloadButton = new Locator(LocatorTypes.XPATH, "//a[@class='hide-mobile button-red download-btn']");
    private Locator mailField = new Locator(LocatorTypes.XPATH, "//input[@id='inf_field_Email']");
    private Locator submitButton = new Locator(LocatorTypes.XPATH, "//input[@type='submit']");
    private Locator modalWindow = new Locator(LocatorTypes.XPATH, "//div[@id='lightbox']");

    public void clickDownloadButton(){
        waitToBeClickable("wait for 'download now' button be clickable",downloadButton);
        click("click 'download now' button",downloadButton);
    }

    public void waitForModalWindow(){
      waitForPresence("wait for modal window", modalWindow);
    }

    public void insertMailAddress(String mail){
        waitForVisibility("wait for mail field be visiable", mailField);
        type("typing in '...Your Email...' input", mail , mailField);
    }

    public void clickSubmitButton(){
        waitToBeClickable("wait for submit button be clickable", submitButton);
        click("click submit button", submitButton);
    }

}
