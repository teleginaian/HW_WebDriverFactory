package components;

import data.InputContactInformationData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ContaintInformation extends AbsBaseComponent {

    public ContaintInformation(WebDriver driver) {
        super(driver);
    }

    public ContaintInformation contactOne() {

        driver.findElement(By.xpath("//button[@type='button'][(text() = 'Удалить')]"))
                .click();
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

    public ContaintInformation checkContactOne() {

        String actualValue = driver.findElement(By.cssSelector("input[ id='id_contact-1-value']"))
                .getAttribute("vk.com/stuprg");

        assertThat(actualValue).as("Error: value in input field {} should be {}").isEqualTo("vk.com/stuprg");

        return this;
    }

    public ContaintInformation checkContactTwo() {

        String actualValue = driver.findElement(By.cssSelector("input[ id='id_contact-2-value']"))
                .getAttribute("@stupeg");

        assertThat(actualValue).as("Error: value in input field {} should be {}").isEqualTo("@stupeg");

        return this;
    }
}
