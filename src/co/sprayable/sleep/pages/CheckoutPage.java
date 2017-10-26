package co.sprayable.sleep.pages;

import org.openqa.selenium.JavascriptExecutor;
import qa.util.base.BasePage;
import qa.util.base.Locator;
import qa.util.base.LocatorTypes;

public class CheckoutPage extends BasePage {

    private Locator firstNameField = new Locator(LocatorTypes.XPATH, "//input[@id='shippingFirstName']");
    private Locator lastNameField = new Locator(LocatorTypes.XPATH, "//input[@id='shippingLastName']");
    private Locator addressField = new Locator(LocatorTypes.XPATH, "//input[@id='shippingAddress1']");
    private Locator cityField = new Locator(LocatorTypes.XPATH, "//input[@id='shippingCity']");
    private Locator stateField = new Locator(LocatorTypes.XPATH, "//input[@id='ucShippingStateFieldId']");
    private Locator zipCodeField = new Locator(LocatorTypes.XPATH, "//input[@id='shippingZip']");
    private Locator listCountries = new Locator(LocatorTypes.XPATH, "//select[@id='ucFieldShippingCountry']");
    private Locator daytimePhoneField = new Locator(LocatorTypes.XPATH, "//input[@name='shippingPhone']");
    private Locator billingInfoBlock = new Locator(LocatorTypes.XPATH, "//div[contains(@class, ' credit-card-section')]");
    private Locator emailField = new Locator(LocatorTypes.XPATH, "//input[@class='js-store-email']");
    private Locator cardNumberField = new Locator(LocatorTypes.ID, "creditCardNumber");
    private Locator cardIframe = new Locator(LocatorTypes.XPATH, "//div[@id='creditCardNumberOverlay']//iframe");
    private Locator listMonthsExprField = new Locator(LocatorTypes.ID, "creditCardExpMonth");
    private Locator listYearsExpr = new Locator(LocatorTypes.ID, "creditCardExpYear");
    private Locator cvvField = new Locator(LocatorTypes.ID, "creditCardVerificationNumber");
    private Locator placeOrderButton = new Locator(LocatorTypes.XPATH, "//button[@id='FINALIZEORDER']");
    private Locator orderSurveyForm = new Locator(LocatorTypes.XPATH, "//div[contains(@class, 'orderSurvey')]");
    private Locator removeButton = new Locator(LocatorTypes.XPATH, "//button[contains(@class, 'remove')]");
    private Locator conditionCheckbox = new Locator(LocatorTypes.CSS, "input[name='acceptCheckoutTerms']");

    protected CheckoutPage() {}

    public void waitToOrderSurvey() {
        waitForVisibility("Wait for order survey", orderSurveyForm);
        scrollToElement("Move to order survey block", orderSurveyForm);
    }
    public void setFirstName(String firstName) {
        type("Set '" + firstName + "' in 'First Name' field", firstName, firstNameField);
    }

    public void setLastName(String lastName) {
        type("Set '" + lastName + "' in 'Last Name' field", lastName, lastNameField);
    }

    public void setAddress(String address) {
        type("Set '" + address + "' in 'Address' field", address, addressField);
    }

    public void setCity(String city) {
        type("Set '" + city + "' in 'City' field", city, cityField);
    }

    public void setState(String state) {
        type("Set '" + state + "' in 'State' field", state, stateField);
    }

    public void setZipCode(String zipCode) {
        type("Set '" + zipCode + "' in 'Zip Code' field", zipCode, zipCodeField);
    }

    public void selectCountryByName(String countryName) {
        selectDropDownListOptionByText("Select '" + countryName + "'", countryName, listCountries);
    }

    public void setDaytimePhone(String phone) {
        type("Set " + phone +  " in 'Daytime phone'" , phone, daytimePhoneField);
    }

    public void setEmail(String email) {
        type("Set '" + email + "' in 'Email Address' field", email, emailField);
    }

    public void moveToBillingInfBlock() {
        scrollToElement("Move to 'BILLING INFORMATION' block", billingInfoBlock);
    }

    public void setCardNumber(String cardNumber) {
        typeJS("Set '" + cardNumber + "' in 'CARD NUMBER' field", cardNumber, cardNumberField);
    }

    public void selectExprMonth(int month) {
        selectDropDownListOptionByIndexJS("Select '" + month + "'", month, listMonthsExprField);
    }

    public void selectExprYear(int year) {
        selectDropDownListOptionByIndexJS("Select '" + year + "'", year, listYearsExpr);
    }

    public void setCVV(int cvv) {
        /*driver().switchTo().frame(driver().findElement(cvvIframe.getLocator()));
        type("Set '" + cvv + "' in 'CVV' field", String.valueOf(cvv), cvvField);
        driver().switchTo().defaultContent();*/
        String str = "" + cvv;
        typeJS("Set '" + cvv + "' in 'CVV CODE' field", str, cvvField);
    }

    public void clickPlaceOrderButton() {
        waitForVisibility("Wait the 'Place Order' button to be clickable", placeOrderButton);
        click("Click the 'Place Order' button", placeOrderButton);
    }
    public boolean isConditionCheckboxPresent() {
        return isPresent("Is 'Condition Checkbox' present?", conditionCheckbox);
    }
    public void clickConditionCheckboxPresent() {
       click("Mark 'I have read and agree with the terms and conditions of checkout' checkbox", conditionCheckbox);
    }


    public void clickRemoveButton() {
        click("Clicking Remove button", removeButton);
    }
}