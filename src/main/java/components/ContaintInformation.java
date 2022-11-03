package components;

import data.InputContactInformationData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContaintInformation extends AbsBaseComponent {

    public ContaintInformation(WebDriver driver) {
        super(driver);
    }

    public ContaintInformation contactOne() {

        driver.findElement(By.xpath("//button[@type='button'][(text() = 'Добавить')]"))
                .click();
        driver.findElement(By.xpath("//*[contains(@class, 'select')][.//*[text() = 'Способ связи']]"))
                .click();
        driver.findElement(By.cssSelector(".lk-cv-block__select-options:not(.hide) .js-custom-select-options button[title ='VK']"))
                .click();
        driver.findElement(By.cssSelector("input[ id='id_contact-0-value']"))
                .sendKeys("vk.com/stuprg");

        return this;
    }

//    public ContaintInformation inputContactOne(InputContactInformationData inputContactInformationData, String value) {
//
//        String inputContactOneSelector = String.format("input[ id='s%']", inputContactInformationData.getName());
//        driver.findElement(By.cssSelector(inputContactOneSelector)).sendKeys(value);
//
//        return this;
//    }


    public ContaintInformation contactTwo() {

        driver.findElement(By.xpath("//button[@type='button'][(text() = 'Добавить')]"))
                .click();
        driver.findElement(By.xpath("//*[contains(@class, 'select')][.//*[text() = 'Способ связи']]"))
                .click();
        driver.findElement(By.cssSelector(".lk-cv-block__select-options:not(.hide) .js-custom-select-options button[title ='Тelegram']"))
                .click();
        driver.findElement(By.cssSelector("input[ id='id_contact-0-value']")).sendKeys("@stupeg");

        return this;
    }

//    public ContaintInformation inputContactTwo(InputContactInformationData inputContactInformationData, String value) {
//
//        String inputContactTwoSelector = String.format("input[ id='s%']", inputContactInformationData.getName());
//        driver.findElement((By.cssSelector(inputContactTwoSelector))).sendKeys(value);
//
//        return this;
//    }
}
