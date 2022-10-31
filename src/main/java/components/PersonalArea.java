package components;

import data.UserData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PersonalArea extends AbsBaseComponent {

    public PersonalArea(WebDriver driver) {
        super(driver);
    }

    private String fNameTemplayLocator = "input[id='id_fname']";
    private String lNameTemplayLocator = "input[id='id_lname']";

    private String fNameLatin = "input[id='id_fname_latin']";

    private String lNameLatin = "input[id='id_lname_latin']";

    public PersonalArea addFName(UserData userData) {
        String locator = String.format(fNameTemplayLocator, userData.getUserData());

        WebElement fName = driver.findElement(By.cssSelector(locator));
        fName.sendKeys();

        return this;
    }

    public PersonalArea addLName(UserData userData) {

        String locator = String.format(lNameTemplayLocator, userData.getUserData());

        WebElement lName = driver.findElement(By.cssSelector(locator));
        lName.sendKeys();

        return this;
    }

}


