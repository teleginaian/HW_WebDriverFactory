package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public abstract class AbsPageObject {

    protected WebDriver driver;
    protected Actions actions;
    protected WebDriverWait webDriverWait;
    public AbsPageObject(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
        this.webDriverWait = new WebDriverWait(driver, 5);

        PageFactory.initElements(driver, this);
    }

    public boolean waitForCondition(ExpectedCondition condition) {

        try {
            webDriverWait.until(condition);

            return true;
        } catch (Exception ignoring) {

            return false;
        }
    }
}
