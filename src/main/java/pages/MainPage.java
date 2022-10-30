package pages;

import data.MainRightMenuItemsData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MainPage extends AbsBasePage {

   public MainPage(WebDriver driver) {
       super(driver);
   }

   private String mainRightMenuTemplateLocator = "//*[contains(@class, 'header2__right')]/*[contains(@class, 'header2-menu__item-')]";

   public MainPage moveCursorToItem(MainRightMenuItemsData mainRightMenuItemsData) {
       String locator = String.format(mainRightMenuTemplateLocator, mainRightMenuItemsData.getName());

       WebElement mainRightMenu = driver.findElement(By.xpath(locator));
       Actions actions = new Actions(driver);
       actions.moveToElement(mainRightMenu).build().perform();

       return this;
   }

// 1:12
}
