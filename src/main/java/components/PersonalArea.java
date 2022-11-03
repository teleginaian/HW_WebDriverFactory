package components;

import data.InputFieldData;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PersonalArea extends AbsBaseComponent {

    public PersonalArea(WebDriver driver) {
        super(driver);
    }

    public PersonalArea clearUserDataToInputField(InputFieldData clearInputField) {

        String clearInputFieldSelector = String.format("input[name='%s']", clearInputField.getName());
        driver.findElement(By.cssSelector(clearInputFieldSelector)).clear();

        return this;
    }


    public PersonalArea setUserDataToInputField(InputFieldData inputField, String value) {

        String inputFieldSelector = String.format("input[name='%s']", inputField.getName());
        driver.findElement(By.cssSelector(inputFieldSelector)).sendKeys(value);

        return this;
    }
}


