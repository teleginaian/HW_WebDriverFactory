package components;

import data.AuthData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Auth extends AbsBaseComponent {

    public Auth(WebDriver driver) {
        super(driver);
    }

    private String loginInputTemplayLocator = "//input[@type='text' and @placeholder='Ёлектронна€ почта']";
    private String passwordInputTemplayLocator = "//input[@placeholder='¬ведите пароль']";

    public Auth addAuth(AuthData authData, AuthData password) {
        String locator = String.format(loginInputTemplayLocator, passwordInputTemplayLocator, authData.getAuth());

        driver.findElement(By.xpath(locator)).submit();

        return this;
    }





//       public Auth addLogin(LoginData loginAuthData) {
//        String locator = String.format(loginInputTemplayLocator, loginAuthData.getLogin());
//
//        driver.findElement(By.xpath(locator)).submit();
//
//        return this;
//    }
//
//    private String passwordInputTemplayLocator = "//input[@placeholder='¬ведите пароль']";
//
//    public  Auth addPassword(PasswordData passwordAuthData) {
//        String locator = String.format(passwordInputTemplayLocator, passwordAuthData.getPassword());
//
//        driver.findElement(By.xpath(locator)).submit();
//
//        return this;
//    }

}
