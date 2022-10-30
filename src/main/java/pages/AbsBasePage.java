package pages;

import org.openqa.selenium.WebDriver;
import pageobject.AbsPageObject;

public abstract class AbsBasePage extends AbsPageObject {

    private String BASE_URL = System.getProperty("base.url");
    private String AUTH = System.getProperty("login");

    public AbsBasePage(WebDriver driver) {
        super(driver);
    }

    public void open(String path) {
        driver.get(BASE_URL + path);
    }

//    public void addLogin(String login) {
//        driver.get(AUTH + login);
//    }

}
