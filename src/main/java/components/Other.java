package components;

import data.OtherData;
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
            driver.findElement(By.cssSelector("select[id = 'id_gender']")).click();
        }

        return this;
    }

    public  Other setCompany(OtherData inputOtherCompany, String value) {

        String otherCompanySelector = String.format("input[name = 'company']", inputOtherCompany.getName());
        driver.findElement(By.cssSelector(otherCompanySelector)).clear();
        driver.findElement(By.cssSelector(otherCompanySelector)).sendKeys(value);

        return this;
    }

    public Other jobTitle(OtherData inputOtherJobTitle, String value){

        String otherJobTitleSelector = String.format("input[name = 'work']", inputOtherJobTitle.getName());

        return this;
    }

}
