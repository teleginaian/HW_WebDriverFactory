package components;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@Slf4j
public class ContaintInformation extends AbsBaseComponent {

    public ContaintInformation(WebDriver driver) {
        super(driver);
    }

    public ContaintInformation contactOne() {

//        driver.findElement(By.xpath("//button[@type='button'][(text() = 'Удалить')]"))
//                .click();
        driver.findElement(By.xpath("//button[@type='button'][(text() = 'Добавить')]"))
                .click();
        driver.findElement(By.xpath("//*[contains(@class, 'select')][.//*[text() = 'Способ связи']]"))
                .click();
        driver.findElement(By.cssSelector(".lk-cv-block__select-options:not(.hide) .js-custom-select-options button[title ='VK']"))
                .click();

        WebElement inputText = driver.findElement(By.cssSelector("input[ id='id_contact-0-value']"));
        inputText.clear();
        inputText.sendKeys("vk.com/stuprg");

        return this;
    }

    public ContaintInformation contactTwo() {

        driver.findElement(By.xpath("//button[@type='button'][(text() = 'Добавить')]"))
                .click();
        driver.findElement(By.xpath("//*[contains(@class, 'input')][.//*[text() = 'Способ связи']]"))
                .click();
        driver.findElement(By.cssSelector(".lk-cv-block__select-options:not(.hide) .js-custom-select-options button[title ='Тelegram']"))
                .click();

        WebElement inputText = driver.findElement(By.cssSelector("input[ id='id_contact-1-value']"));
        inputText.clear();
        inputText.sendKeys("@stupeg");

        return this;
    }

    public ContaintInformation checkContactOne(String value) {

        String actualValue = driver.findElement(By.cssSelector("input[ value='id_contact-0-value']"))
                .getAttribute(value);

        assertThat(actualValue).as("It should be {}", value).isEqualTo(value);

        return this;
    }

    public ContaintInformation checkContactTwo(String value) {

        String actualValue = driver.findElement(By.cssSelector("input[ id='id_contact-1-value']"))
                .getAttribute(value);

        assertThat(actualValue).as("It should be {vk.com/stuprg}", value).isEqualTo(value);

        return this;
    }

}
