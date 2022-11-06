package components;

import data.InputFieldData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


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

    public PersonalArea checkUserDataInputField(InputFieldData inputFieldData, String value) {

        String inputFieldSelector = String.format("input[name='%s']", inputFieldData.getName());
        String actualValue = driver.findElement(By.cssSelector(inputFieldSelector))
                .getAttribute("value");

        assertThat(actualValue).as("Error: value in input field {Name} should be {}", inputFieldData
                .getName(), value).isEqualTo(value);

        return this;
    }
}


