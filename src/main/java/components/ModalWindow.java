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


    public ModalWindow addLogin(AuthData login) {

        WebElement modalWindow = driver.findElement(By.cssSelector("form[action*='login'] input[name='email']"));
        modalWindow.sendKeys(login.getAuth());

        return null;
    }

    public ModalWindow addPassword(AuthData password) {

        WebElement modalWindow = driver.findElement(By.cssSelector("form[action*='login']  input[type='password']"));
        modalWindow.sendKeys(password.getAuth());

        return null;
    }

    public MainScreen clickLogInButton() {
        logInButton.click();
        return new MainScreen(driver);
    }
}
