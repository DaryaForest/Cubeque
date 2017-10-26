package qa.util;

import qa.util.base.BaseActions;
import qa.util.reporting.Reporter;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


public class AllAddressCheck {
    public void testingAllRoutesAvailability(String[] addressStack) throws IOException {
        List<String> brokenSitesAmount = new ArrayList<String>();
        String userAgent = "User-Agent";
        String userAgentData = "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:25.0) Gecko/20100101 Firefox/25.0";
        URL url;
        HttpURLConnection connection = null;
        for (int i = 0; i < addressStack.length; i++) {
            try {
                BaseActions.wait(1);
                url = new URL(addressStack[i]);
            } catch (MalformedURLException e) {
                Reporter.log("incorrect URL address....  " + e);
                brokenSitesAmount.add("incorrect URL address....  " + e);
                continue;
            }
            connection = (HttpURLConnection) url.openConnection();
            connection.addRequestProperty(userAgent, userAgentData);
            String redirect = connection.getHeaderField("Location");
            if (redirect != null) {
                connection = (HttpURLConnection) new URL(redirect).openConnection();
                connection.addRequestProperty(userAgent, userAgentData);
            }
            int statusCode = connection.getResponseCode();
            if (statusCode != 200) {
                Reporter.log("FAILED OPEN| " + addressStack[i] + "\nhttp status code " + statusCode);
                brokenSitesAmount.add("FAILED OPEN| " + addressStack[i] + " http status code " + statusCode);
            }
        }
        assert connection != null;
        connection.disconnect();
        if (brokenSitesAmount.size() > 0) {
            EmailSender emailSender = new EmailSender();
            emailSender.sendMail(brokenSitesAmount);
        }
    }
}
