package qa.util.base;

import co.sprayable.sleep.actions.Actions;
import co.sprayable.sleep.pages.Pages;
import org.apache.commons.lang3.SystemUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import qa.util.properties.Properties;
import qa.util.reporting.Reporter;

import java.lang.reflect.Field;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public abstract class BaseTest {
    private static WebDriver driver;
    public static boolean isDriverIE = false;

    //TODO protected?
    public static WebDriver driver() {
        return driver;
    }

    /*private static Capabilities configWebDriver() {
        DesiredCapabilities dCaps = new DesiredCapabilities();
        dCaps.setCapability("takesScreenshot", true);
        dCaps.setCapability(
                PhantomJSDriverService.PHANTOMJS_PAGE_SETTINGS_PREFIX + "userAgent",
                "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/53 (KHTML, like Gecko) Chrome/15.0.87"
        );
        dCaps.setCapability(
                PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,
                "C:/JaneDoycheva/jane/lib/drivers/phantomjs-2.1.1-windows/bin/phantomjs.exe"
        );
        return dCaps;
    }*/

    @BeforeClass
    public void setUp() throws MalformedURLException {

        String platformName = System.getProperty("platform");
        Platform platform;
        if (SystemUtils.IS_OS_WINDOWS) {
            platform = Platform.WINDOWS;
        } else if (SystemUtils.IS_OS_LINUX) {
            platform = Platform.LINUX;



        } else if (SystemUtils.IS_OS_MAC || SystemUtils.IS_OS_MAC_OSX || SystemUtils.IS_OS_MAC_OSX_CHEETAH || SystemUtils.IS_OS_MAC_OSX_PUMA || SystemUtils.IS_OS_MAC_OSX_JAGUAR
                || SystemUtils.IS_OS_MAC_OSX_TIGER || SystemUtils.IS_OS_MAC_OSX_LEOPARD || SystemUtils.IS_OS_MAC_OSX_LEOPARD || SystemUtils.IS_OS_MAC_OSX_SNOW_LEOPARD
                || SystemUtils.IS_OS_MAC_OSX_LION || SystemUtils.IS_OS_MAC_OSX_MOUNTAIN_LION || SystemUtils.IS_OS_MAC_OSX_MAVERICKS || SystemUtils.IS_OS_MAC_OSX_YOSEMITE) {
            platform = Platform.MAC;
        } else {
            platform = Platform.ANY;
        }

        switch (Properties.getBrowser()) {
            //TODO
            case PHANTOMJS:
                DesiredCapabilities capabilities = DesiredCapabilities.phantomjs();
                capabilities.setBrowserName("phantomjs");
                capabilities.setPlatform(platform);
                capabilities.setCapability(CapabilityType.TAKES_SCREENSHOT, true);
                String phantomeJSPath = Properties.getPhantomeJSPath();
                capabilities.setCapability("phantomjs.binary.path", phantomeJSPath);

                driver = new PhantomJSDriver(capabilities);
                break;
            case FIREFOX:

                capabilities = DesiredCapabilities.firefox();
                capabilities.setBrowserName("firefox");
                capabilities.setPlatform(platform);
                capabilities.setCapability(CapabilityType.TAKES_SCREENSHOT, true);
                driver = new FirefoxDriver(capabilities);

                break;
            case CHROME:
            default:
                String chromeDriverPath = Properties.getChromeDriverPath();
                System.setProperty("webdriver.chrome.driver", chromeDriverPath);
                ChromeOptions options = new ChromeOptions();
                options.addArguments("test-type");
                capabilities = DesiredCapabilities.chrome();
                capabilities.setBrowserName("chrome");
                capabilities.setPlatform(platform);

                driver = new ChromeDriver(options) {
                    @Override
                    public WebElement findElement(By by) {
                        try {
                            return by.findElement(this);
                        } catch (org.openqa.selenium.NoSuchElementException nse) {
                            Field f = null;
                            try {
                                f = Throwable.class.getDeclaredField("detailMessage");
                            } catch (NoSuchFieldException e) {
                                throw nse;
                            }
                            f.setAccessible(true);
                            try {
                                String error = "\n" + by.toString() + "\n" + f.get(nse);
                                f.set(nse, error);
                            } catch (IllegalAccessException ia) {
                            }
                            throw nse;
                        }
                    }
                };
                break;
            case IE:
                String IEDriverPath = Properties.getIEDriverPath();
                System.setProperty("webdriver.ie.driver", IEDriverPath);
                capabilities = DesiredCapabilities.internetExplorer();
                capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);

                capabilities.setPlatform(platform);
                capabilities.setCapability(CapabilityType.TAKES_SCREENSHOT, true);
                capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
                capabilities.setCapability(InternetExplorerDriver.REQUIRE_WINDOW_FOCUS, true);
                capabilities.setCapability(InternetExplorerDriver.UNEXPECTED_ALERT_BEHAVIOR, true);
                capabilities.setCapability(InternetExplorerDriver.ENABLE_PERSISTENT_HOVERING, false);
                capabilities.setJavascriptEnabled(true);
//                capabilities.setCapability("nativeEvents", false);
                driver = new InternetExplorerDriver(capabilities);
                isDriverIE = true;
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(BasePage.ELEMENT_EXTRALONG_TIMEOUT_SECONDS, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(BasePage.ELEMENT_MEGA_EXTRALONG_TIMEOUT_SECONDS, TimeUnit.SECONDS);

    }

    @AfterClass
    public void tearDown() {
        boolean makeAllScreenshots = Reporter.isMakeScreenShotOnLog();
        Reporter.makeScreenshotOnLog(false);
        Reporter.log(" * Stopping WebDriver");
        this.stopDriver();
        Reporter.makeScreenshotOnLog(makeAllScreenshots);
    }

    protected void stopDriver() {
        Actions.clear();
        Pages.clear();
        driver.quit();
    }

    protected void skipTest(String message) {
        throw new SkipException(message);
    }
}
