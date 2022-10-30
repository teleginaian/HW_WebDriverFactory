package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class AbsPageObject {

    protected WebDriver driver;


    public AbsPageObject(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver, this);
    }
}
