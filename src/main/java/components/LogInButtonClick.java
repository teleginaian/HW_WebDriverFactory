package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInButtonClick extends AbsBaseComponent {

    public LogInButtonClick(WebDriver driver){
        super(driver);
    }

    @FindBy(css = "div.new-input-line_last:nth-child(5) > button:nth-child(1)")
    private WebElement logInButton;

    public LogIn clickLogInButton() {
        logInButton.click();
        return new  LogIn(driver);
    }


}
