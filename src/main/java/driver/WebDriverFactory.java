package driver;

import data.DriverData;
import driver.factory.ChromeWebDriver;
import exceptions.BrowserNotSupportedException;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverFactory {

    public WebDriver create(DriverManagerType driverData, MutableCapabilities options) throws BrowserNotSupportedException {
        switch(driverData) {
            case CHROME:

                return new ChromeWebDriver().newDriver();

            default:
                throw new BrowserNotSupportedException(driverData);
        }
    }
}
