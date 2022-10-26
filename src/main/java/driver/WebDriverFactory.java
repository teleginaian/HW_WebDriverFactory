package driver;

import data.DriverData;
import exceptions.BrowserNotSupportedException;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverFactory {

//    private String browserName = System.getProperty("browser");

    public WebDriver getDriver(DriverManagerType driverData, MutableCapabilities options) throws BrowserNotSupportedException {
        switch(driverData) {
            case CHROME:
                ChromeOptions chromeOptions = new ChromeOptions();
                if(options != null) {
                    chromeOptions.merge(options);
                }
                return new ChromeDriver(chromeOptions);

            default:
                throw new BrowserNotSupportedException(driverData);
        }
    }
}
