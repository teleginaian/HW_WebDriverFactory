package driver.factory;

import data.DriverData;
import exceptions.BrowserNotSupportedException;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.Config;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.WebDriver;

import static data.DriverData.CHROME;

public interface IDriver {
    WebDriver newDriver() throws BrowserNotSupportedException;

    default public void downloadLocalWebDriver(DriverManagerType driverType) throws BrowserNotSupportedException {
        Config wdmConfig = WebDriverManager.globalConfig();
        wdmConfig.setAvoidBrowserDetection(true);

        String browserVersion = System.getProperty("browser.version", "");

        if (!browserVersion.isEmpty()) {
            switch (driverType) {
                case CHROME:
                    wdmConfig.setChromeDriverVersion(browserVersion);
                    break;
                default:
                    throw new BrowserNotSupportedException(driverType);
            }
        }

        WebDriverManager.getInstance(driverType).setup();
    }
}
