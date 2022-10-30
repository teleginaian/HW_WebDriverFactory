package main;

import components.Auth;
import components.Header2Right;
import components.LogInButtonClick;
import data.PasswordData;
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

import java.time.Duration;

import static data.LoginData.Login;

public class LogIn_Test {

    private WebDriver driver;

    @BeforeAll
    public static void  init() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach

    public void initDriver() throws BrowserNotSupportedException {
        this.driver = new WebDriverFactory().create(DriverManagerType.CHROME, null);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @AfterEach
    public void close() {
        if(driver != null) {
            driver.close();
            driver.quit();
        }
    }

    @Test
    public void testOtusClickSingInButton() {
        new MainPage(driver)
                .open("/");

        new Header2Right(driver)
                .clickSingInButton();

        new Auth(driver).addLogin(Login)
                .addPassword(PasswordData.Password);

        new LogInButtonClick(driver)
                .clickLogInButton();





    }
}
