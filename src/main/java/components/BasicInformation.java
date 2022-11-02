package components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
}
