package pages;

import org.openqa.selenium.WebDriver;

public abstract class AbsBasePage {

    private  String hostname = System.getProperty("base.url");

    protected WebDriver driver;

    public AbsBasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get(hostname);
    }
}
