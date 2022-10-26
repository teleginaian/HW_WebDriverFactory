package components;

import org.openqa.selenium.WebDriver;
import pages.AbsBasePage;

public abstract class AbsBaseComponent {

    protected WebDriver driver;
    public AbsBaseComponent(WebDriver driver) {
        this.driver = driver;
    }
}
