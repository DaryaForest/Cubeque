package co.sprayable.sleep.tests;

import org.testng.annotations.Test;
import qa.util.AllAddressCheck;
import qa.util.Constants;
import qa.util.base.BaseTest;
import qa.util.reporting.Reporter;

import java.io.IOException;


public class RoutesTest extends BaseTest {
    @Test
    public void setAllAddressCheckTest() throws IOException {
        AllAddressCheck allAddressCheck = new AllAddressCheck();
        Reporter.log("Check urls");
        allAddressCheck.testingAllRoutesAvailability(Constants.urlsList);
    }
}
