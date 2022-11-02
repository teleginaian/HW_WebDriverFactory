package components;

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
        driver.findElement(By.xpath("")).click();

        return this;
    }

    public ContaintInformation contactTwo() {

        driver.findElement(By.xpath("//button[@type='button'][(text() = 'Добавить')]"))
                .click();
        driver.findElement(By.xpath("//*[contains(@class, 'select')][.//*[text() = 'Способ связи']]"))
                .click();
        driver.findElement(By.xpath("")).click();

        return this;
    }
}
