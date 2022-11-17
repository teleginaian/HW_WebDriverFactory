package components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.fail;

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
                    .click();
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
                    .click();
        }

        return this;
    }

    public BasicInformation englishLevel() {

        if (!driver.findElement(By.xpath("//*[contains(@class, 'select')]/*[contains(text(), 'Начальный уровень (Beginner)')]"))
                .getText().contains("Начальный уровень (Beginner)"))
        {
            driver.findElement(By.cssSelector("input[name='english_level']+div.input"))
                    .click();
            driver.findElement(By.cssSelector("button[title='Начальный уровень (Beginner)']"))
                    .click();
        }

        return this;
    }

    public BasicInformation checkCountry(String value) {

        String actualValue = driver.findElement(By.cssSelector("div[data-slave-selector='.js-lk-cv-dependent-slave-city']"))
                .getText();

        assertThat(actualValue).as("Error: value in input field {} should be {}").isEqualTo(value);

        return this;
    }

    public BasicInformation checkCity(String value) {

        String actualValue = driver.findElement(By.cssSelector("div.js-lk-cv-dependent-slave-city  div.js-custom-select-presentation"))
                .getText();

        assertThat(actualValue).as("Error: value in input field {} should be {}")
                .isEqualTo(value);

        return this;
    }

public BasicInformation checkEnglishLevel(String value) {

    String actualValue = driver.findElement(By.cssSelector("input[name='english_level']+div.input"))
            .getText();

    assertThat(actualValue).as("Error: value in input field {} should be {}")
            .isEqualTo(value);

    return this;
    }
}
