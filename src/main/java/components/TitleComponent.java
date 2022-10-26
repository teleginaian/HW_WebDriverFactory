package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TitleComponent extends AbsBaseComponent {

    public TitleComponent(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "")
    private WebElement title;
    public void pageTitleShouldBeSameAs(String title) {
    }
}
