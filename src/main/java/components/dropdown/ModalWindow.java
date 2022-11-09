package components.dropdown;

import components.MainScreen;
import data.AuthData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.AbsBasePage;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ModalWindow extends AbsBasePage implements IModal {

    public ModalWindow(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "div.new-input-line_last:nth-child(5) > button:nth-child(1)")
    private WebElement logInButton;


    public ModalWindow addLogin(AuthData login) {

        WebElement modalWindow = driver.findElement(By.cssSelector("form[action*='login'] input[name='email']"));
        modalWindow.sendKeys(login.getAuth());

        return this;
    }

    public ModalWindow addPassword(AuthData password) {

        WebElement modalWindow = driver.findElement(By.cssSelector("form[action*='login']  input[type='password']"));
        modalWindow.sendKeys(password.getAuth());

        return this;
    }

    public MainScreen clickLogInButton() {
        logInButton.click();
        return new MainScreen(driver);
    }

    @Override
    public void modalShouldNotBePresent() {

        assertThat(this.waitForCondition(ExpectedConditions.not(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[data-modal-id='new-log-reg']")))))
                .as("No open modal window")
                .isTrue();
    }

    @Override
    public void modalShouldBePresent() {

        assertThat(this.waitForCondition(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[data-modal-id='new-log-reg']"))))
                .as("Open modal window")
                .isTrue();

    }
}
