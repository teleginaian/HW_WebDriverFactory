package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SaveAndContinue extends AbsBaseComponent {

    public  SaveAndContinue(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "button[title = 'Сохранить и продолжить']")
    private WebElement SaveAndContinue;

    public SkillsAndTechnologies clickSaveAndContinue() {
        SaveAndContinue.click();
        return new SkillsAndTechnologies(driver);
    }
}
