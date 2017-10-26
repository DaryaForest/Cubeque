package co.sprayable.sleep.pages;

import qa.util.base.BasePage;
import qa.util.base.Locator;
import qa.util.base.LocatorTypes;

public class SprayableEnergyFountainOfYouthPage extends BasePage {

    private Locator getSprayableEnergyButton = new Locator(LocatorTypes.XPATH, "//div[contains(@class, 'layout')][2]//div[@class='btn-container']");
    private Locator getSprayableEnergyFor25OffButton = new Locator(LocatorTypes.XPATH, "//div[contains(@class, 'layout')][3]//div[@class='btn-container']");

    public void waitSprayableEnergyButton(){
        waitForVisibility("Wait for 'Get Sprayable energy' button to be visible", getSprayableEnergyButton);
        waitToBeClickable("Wait for 'Get Sprayable energy' button to be clickable", getSprayableEnergyButton);
    }

    public void clickSprayableEnergyButton() {
        click("click on 'Get Sprayable energy' button", getSprayableEnergyButton);
    }

    public void waitSprayableEnergyFor25OffButton(){
        waitForVisibility("Wait for 'Get Sprayable energy for 25% OFF' button to be visible", getSprayableEnergyFor25OffButton);
        waitToBeClickable("Wait for 'Get Sprayable energy for 25% OFF' button to be clickable", getSprayableEnergyFor25OffButton);
    }

    public void clickSprayableEnergyFor25OffButton() {
        click("click on 'Get Sprayable energy for 25% OFF' button", getSprayableEnergyFor25OffButton);
    }
}