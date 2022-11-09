package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DropdownHeader2 extends AbsBaseComponent {

    public
    DropdownHeader2 (WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//b[@class='header2-menu__dropdown-text_name']")
    private WebElement dropdownPersonalArea;

    public PersonalArea clickDropdownPersonalArea() {
        dropdownPersonalArea.click();
        return new PersonalArea(driver);
    }
}
