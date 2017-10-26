package co.sprayable.sleep.pages;

import qa.util.base.BasePage;
import qa.util.base.Locator;
import qa.util.base.LocatorTypes;


public class ThankYouSalesPhpPage extends BasePage {

    private Locator downloadButtonNow = new Locator(LocatorTypes.XPATH, "//div[@class='col-md-12']/a[@class='button-blue downloadnow']");
    private Locator haveYouEverBox = new Locator(LocatorTypes.XPATH, "//div[@class='box']");
    private Locator trySprayableSleep = new Locator(LocatorTypes.XPATH, "//a[@class='button-red ordernow']");
    private Locator introducingBlock = new Locator(LocatorTypes.XPATH, "//section[@id='intro-product']");
    private Locator introOrderNow = new Locator(LocatorTypes.XPATH, "//div[@class='col-md-4 col-md-offset-1 image text-center']/a");
    private Locator pharmaCompaniesHateSprayBlock = new Locator(LocatorTypes.XPATH, "//section[@id='hate-this']");
    private Locator pharmaCompaniesHateSprayOrderNow = new Locator(LocatorTypes.XPATH, "//div[@class='col-md-8 col-md-offset-2 text-center']//a");
    private Locator deepRestfulSleepBlock = new Locator(LocatorTypes.XPATH, "//section[@id='moneyback']");
    private Locator deepRestfulSleepOrderNow = new Locator(LocatorTypes.XPATH, "//div[@class='text-center']/a[@class='button-blue ordernow']");
    private Locator footerBlock = new Locator(LocatorTypes.XPATH, "//section[@id='sales-footer']");
    private Locator footerOrderNow = new Locator(LocatorTypes.XPATH, "//a[@class='button-outline ordernow']");

    public void clickDownloadButton() {
        waitToBeClickable("wait for 'download now' button be clickable", downloadButtonNow);
        click("click 'download now' button", downloadButtonNow);
    }

    public void clickTrySprayable() {
        waitToBeClickable("wait for 'try sprayable sleep' button be clickable", downloadButtonNow);
        click("click 'try sprayable sleep' button", trySprayableSleep);
    }

    public void clickIntroOrderNow() {
        waitToBeClickable("wait for 'order now' button be clickable", introOrderNow);
        click("click 'order now' button", introOrderNow);
    }

    public void clickPharmaCompaniesOrderNow() {
        waitToBeClickable("wait for 'order now' button be clickable", pharmaCompaniesHateSprayOrderNow);
        click("click 'order now' button", pharmaCompaniesHateSprayOrderNow);
    }

    public void clickDeepRestfulSleepOrderNow() {
        waitToBeClickable("wait for 'order now' button be clickable", deepRestfulSleepOrderNow);
        click("click 'order now' button", deepRestfulSleepOrderNow);
    }

    public void clickFooterOrderNow() {
        waitToBeClickable("wait for 'order now' button be clickable", footerOrderNow);
        click("click 'order now' button", footerOrderNow);
    }


    public void scrollToTrySprayable() {
        scrollToElement("scroll to 'have you ever...' box", haveYouEverBox);
    }

    public void scrollToIntroducingBlock() {
        scrollToElement("scroll to 'introducing the world`s First...' box", introducingBlock);
    }

    public void scrollPharmaCompaniesHateSprayBlock() {
        scrollToElement("scroll to 'Pharmaceutical companies hate this spay...' box", pharmaCompaniesHateSprayBlock);
    }

    public void scrollDeepRestfulSleepBlock() {
        scrollToElement("scroll to 'Deep restful sleep...' box", deepRestfulSleepBlock);
    }

    public void scrollToFooterBlock() {
        scrollToElement("scroll to footer box", footerBlock);
    }
}
