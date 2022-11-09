package components;

import data.InputFieldData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static javax.swing.text.html.CSS.getAttribute;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BasicInformation extends AbsBaseComponent {

    public BasicInformation (WebDriver driver) {
        super(driver);
    }

    public BasicInformation country() {

        if(!driver.findElement(By.cssSelector("div[class='select lk-cv-block__input lk-cv-block__input_full js-lk-cv-dependent-master js-lk-cv-custom-select']"))
                .getText().contains("Россия"))
        {
            driver.findElement(By.cssSelector("div[class='select lk-cv-block__input lk-cv-block__input_full js-lk-cv-dependent-master js-lk-cv-custom-select']"))
                    .click();
            driver.findElement(By.xpath("//*[contains(text(), 'Россия')]"))
                    .submit();
        }

        return this;
    }

    public BasicInformation city() {

        if (!driver.findElement(By.cssSelector(".js-lk-cv-dependent-slave-city > label:nth-child(1) > div:nth-child(2)"))
                .getText().contains("Тула"))
        {
            driver.findElement(By.cssSelector(".js-lk-cv-dependent-slave-city > label:nth-child(1) > div:nth-child(2)"))
                    .click();
            driver.findElement(By.xpath("//*[contains(text(), 'Тула')]"))
                    .submit();
        }

        return this;
    }

    public BasicInformation checkCountry() {

        String actualValue = driver.findElement(By.xpath("//*[contains(text(), 'Россия')]"))
                .getAttribute("Россия");

        assertThat(actualValue).as("Error: value in input field {Country} should be {Россия}").isEqualTo("Россия");

        return this;
    }

    public BasicInformation checkCity() {

        String actualValue = driver.findElement(By.xpath("//*[contains(text(), 'Тула')]"))
                .getAttribute("Тула");

        assertThat(actualValue).as("Error: value in input field {City} should be {Тула}")
                .isEqualTo("Тула");

        return this;
    }
}
