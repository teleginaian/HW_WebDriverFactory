package components;

import data.ContactData;
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

    public ContaintInformation deletedContact() {

        List<WebElement> delButton = driver.findElements(By.cssSelector("div[data-prefix = 'contact'] .js-formset-row:not(.hide) .js-formset-delete"));
        for(int i=0; i<delButton.size(); i++) {
            if (delButton.get(i).isDisplayed()) {
                delButton.get(i).click();
            }
        }
        return this;
    }

    public ContaintInformation contactOne(ContactData contactData) {

        String contactNameSelector = String.format("div[data-prefix = 'contact'] .js-formset-row:not(.hide) [title='%s']", contactData.getName());

        driver.findElement(By.xpath("//button[@type='button'][(text() = 'Добавить')]"))
                .click();
        driver.findElements(By.cssSelector("div[data-prefix = 'contact'] .js-formset-row:not(.hide) .input")).get(0)
                .click();
        driver.findElements(By.cssSelector(contactNameSelector)).get(0)
                .click();

        WebElement inputText = driver.findElements(By.cssSelector("div[data-prefix = 'contact'] .js-formset-row:not(.hide) input[type='text']"))
                .get(0);
        inputText.clear();
        inputText.sendKeys("@stupeg");

        return this;
    }

    public ContaintInformation contactTwo(ContactData contactData) {

        String contactNameSelector = String.format("div[data-prefix = 'contact'] .js-formset-row:not(.hide) [title='%s']", contactData.getName());

        driver.findElement(By.xpath("//button[@type='button'][(text() = 'Добавить')]"))
                .click();
        driver.findElements(By.cssSelector("div[data-prefix = 'contact'] .js-formset-row:not(.hide) .input")).get(2)
                .click();
        driver.findElements(By.cssSelector(contactNameSelector)).get(1)
                .click();

        WebElement inputText = driver.findElements(By.cssSelector("div[data-prefix = 'contact'] .js-formset-row:not(.hide) input[type='text']"))
                .get(1);
        inputText.clear();
        inputText.sendKeys("vk.com/stuprg");

        return this;
    }

    public ContaintInformation checkContactOne(String value) {

        String actualValue = driver.findElement(By.cssSelector("input[ id='id_contact-0-value']"))
                .getAttribute("value");

        assertThat(actualValue).as("It should be {}", value)
                .isEqualTo(value);

        return this;
    }

    public ContaintInformation checkContactTwo(String value) {

        String actualValue = driver.findElement(By.cssSelector("input[ id='id_contact-1-value']"))
                .getAttribute("value");

        assertThat(actualValue).as("It should be {}", value)
                .isEqualTo(value);

        return this;
    }

}
