package main;

import components.TitleComponent;
import data.DriverData;
import exceptions.BrowserNotSupportedException;
import driver.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pages.MainPage;

public class MainPage_Test {

    private WebDriver driver;

    @BeforeAll
    public static void  init() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void initDriver() throws BrowserNotSupportedException {
        driver = new  WebDriverFactory().getDriver(DriverManagerType.CHROME, null);
    }

    @AfterEach
    public void close() {
        if(driver != null) {
            driver.close();
            driver.quit();
        }
    }

    @Test
    public void testOtus(){
        new MainPage(driver).open();
        new TitleComponent(driver).pageTitleShouldBeSameAs("");
    }
}
