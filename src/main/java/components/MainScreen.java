package components;

import data.MainRightMenuItemsData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.AbsBasePage;

public class MainScreen extends AbsBasePage {

    public MainScreen(WebDriver driver) {
        super(driver);
    }

    private String mainRightMenuTemplateLocator = "//*[contains(@class, 'header2__right')]/*[contains(@class, 'header2-menu__item-')]";

    public MainScreen moveCursorToItem(MainRightMenuItemsData mainRightMenuItemsData) {
        String locator = String.format(mainRightMenuTemplateLocator, mainRightMenuItemsData.getName());

        WebElement mainRightMenu = driver.findElement(By.xpath(locator));
        Actions actions = new Actions(driver);
        actions.moveToElement(mainRightMenu).build().perform();

        return this;
    }
}
