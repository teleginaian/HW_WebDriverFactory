package components;

import data.LoginData;
import data.PasswordData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Auth extends AbsBaseComponent {

    public Auth(WebDriver driver) {
        super(driver);
    }

    private String loginInputTemplayLocator = "//input[@type='text' and @placeholder='����������� �����']";

    public Auth addLogin(LoginData loginAuthData) {
        String locator = String.format(loginInputTemplayLocator, loginAuthData.getLogin());

        driver.findElement(By.xpath(locator)).submit();

        return this;
    }

    private String passwordInputTemplayLocator = "//input[@placeholder='������� ������']";

    public  Auth addPassword(PasswordData passwordAuthData) {
        String locator = String.format(passwordInputTemplayLocator, passwordAuthData.getPassword());

        driver.findElement(By.xpath(locator)).submit();

        return this;
    }

}
