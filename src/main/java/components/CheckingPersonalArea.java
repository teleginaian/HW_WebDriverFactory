package components;

import data.InputFieldData;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckingPersonalArea extends AbsBaseComponent {

    public CheckingPersonalArea(WebDriver driver) {
        super(driver);
    }

    public CheckingPersonalArea checkUserDataToInputField(InputFieldData clearInputField) {

        String clearInputFieldSelector = String.format("input[name='%s']", clearInputField.getName());
        Assertions.assertEquals("Егор", InputFieldData.FNAME, "Егор");

        return this;
    }
}
