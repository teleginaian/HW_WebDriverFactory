package components;

import data.InputOtherData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Other extends AbsBaseComponent {

    public Other(WebDriver driver) {
        super(driver);
    }

    public Other gender() {

//        if(!driver.findElement(By.cssSelector("select[id = 'id_gender']"))
//                .getText().contains("Не указано"))
//        {
            driver.findElement(By.cssSelector("select[id = 'id_gender']")).click();
            driver.findElement(By.cssSelector("option[value='m']")).click();
//        }

        return this;
    }

    public Other cleanSetCompany(InputOtherData clearInputOtherCompany, String value) {

        String cleanOtherCompanySelector = String.format("input[name = 'company']", clearInputOtherCompany.getName());
        driver.findElement(By.cssSelector(cleanOtherCompanySelector)).clear();

        return this;
    }

    public  Other setCompany(InputOtherData inputOtherCompany, String value) {

        String otherCompanySelector = String.format("input[name = 'company']", inputOtherCompany.getName());
        driver.findElement(By.cssSelector(otherCompanySelector)).sendKeys(value);

        return this;
    }

    public Other cleanJobTitle(InputOtherData cleanInputOtherJobTitle, String value) {

        String cleanOtherJobTitleSelector = String.format("input[name = 'work']", cleanInputOtherJobTitle.getName());
        driver.findElement(By.cssSelector(cleanOtherJobTitleSelector)).clear();

        return this;
    }


    public Other jobTitle(InputOtherData inputOtherJobTitle, String value) {

        String otherJobTitleSelector = String.format("input[name = 'work']", inputOtherJobTitle.getName());
        driver.findElement(By.cssSelector(otherJobTitleSelector)).clear();
        driver.findElement(By.cssSelector(otherJobTitleSelector)).sendKeys(value);

        return this;
    }

    public Other checkGender(String value) {

        String selector = driver.findElement(By.cssSelector("#id_gender [selected]"))
                .getText();

                assertThat(selector).as("It should be {}", value)
                        .isEqualTo(value);

        return this;
    }

    public Other checkCompany(InputOtherData inputOtherData, String value) {

        String inputFieldSelector = String.format("input[name = 'company']", inputOtherData.getName());
        String actualValue = driver.findElement(By.cssSelector(inputFieldSelector))
                .getAttribute("value");

        assertThat(actualValue).as("Error: value in input field {} should be {}", inputOtherData
                .getName(), value).isEqualTo(value);

        return this;
    }

    public Other checkJobTitle(InputOtherData inputOtherData, String value) {

        String inputFieldSelector = String.format("input[name = 'work']", inputOtherData.getName());
        String actualValue = driver.findElement(By.cssSelector(inputFieldSelector))
                .getAttribute("value");

        assertThat(actualValue).as("Error: value in input field {} should be {}", inputOtherData
                .getName(), value).isEqualTo(value);

        return this;
    }

}
