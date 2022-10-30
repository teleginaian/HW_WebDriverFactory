package components;

import data.AuthData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbsBasePage;

public class ModalWindow extends AbsBasePage {

    public ModalWindow(WebDriver driver) {
        super(driver);
    }



    @FindBy(css = "div.new-input-line_last:nth-child(5) > button:nth-child(1)")
    private WebElement logInButton;

    private String loginInputTemplayLocator = "//input[@type='text' and @placeholder='Ёлектронна€ почта']";
    private String passwordInputTemplayLocator = "//input[@placeholder='¬ведите пароль']";

//    public LogIn clickLogInButton() {
//        logInButton.click();
//        return new  LogIn(driver);
//    }

    public ModalWindow addLogin(AuthData login) {

        String locator = String.format(loginInputTemplayLocator, login.getAuth());

        WebElement modalWindow = driver.findElement(By.xpath(locator));
        modalWindow.sendKeys();

        return null;
    }

    public ModalWindow addPassword(AuthData password) {

        String locator = String.format(passwordInputTemplayLocator, password.getAuth());

        WebElement modalWindow = driver.findElement(By.xpath(locator));
        modalWindow.sendKeys();

        return null;
    }

    public MainScreen clickLogInButton() {
        logInButton.click();
        return new MainScreen(driver);
    }


}
