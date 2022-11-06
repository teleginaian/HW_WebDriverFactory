package components;

import components.popup.ModalWindow;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Header2Right extends AbsBaseComponent {

    public Header2Right(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "div.header2__right button")
    private WebElement signInButton;

    public ModalWindow clickSingInButton() {
        signInButton.click();
        return new ModalWindow(driver);
    }
}
