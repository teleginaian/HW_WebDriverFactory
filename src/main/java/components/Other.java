package components;

import data.InputOtherData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Other extends AbsBaseComponent {

    public Other(WebDriver driver) {
        super(driver);
    }

    public Other gender() {

        if(!driver.findElement(By.cssSelector("select[id = 'id_gender']"))
                .getText().contains("Не указано"))
        {
            driver.findElement(By.cssSelector("select[id = 'id_gender']  option[value='m']")).click();
        }

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

}
