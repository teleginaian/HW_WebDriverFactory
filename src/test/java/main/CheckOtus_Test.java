package main;

import components.*;
import components.dropdown.ModalWindow;
import data.AuthData;
import data.InputFieldData;
import data.InputOtherData;
import data.MainRightMenuItemsData;
import driver.WebDriverFactory;
import exceptions.BrowserNotSupportedException;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pages.MainPage;

import java.util.concurrent.TimeUnit;

public class CheckOtus_Test {

    public WebDriver driver;

    @BeforeAll
    public static void init() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach

    public void initDriver() throws BrowserNotSupportedException {
        this.driver = new WebDriverFactory().create(DriverManagerType.CHROME, null);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @AfterEach
    public void close() {
        if(driver != null) {
            driver.close();
            driver.quit();
        }
    }

    @Test
    public void checkOtusTest() throws BrowserNotSupportedException {
        new MainPage(driver)
                .open("/");

        ModalWindow modalWindowReturn = new ModalWindow(driver);
        modalWindowReturn.modalShouldNotBePresent();

        new Header2Right(driver)
                .clickSingInButton();

        modalWindowReturn.modalShouldBePresent();

        new ModalWindow(driver)
                .addLogin(AuthData.Login)
                .addPassword(AuthData.Password)
                .clickLogInButton();

        new MainScreen(driver)
                .moveCursorToItem(MainRightMenuItemsData.PersonalAerea);

        new DropdownHeader2(driver)
                .clickDropdownPersonalArea();

        new PersonalArea(driver)
                .checkUserDataInputField(InputFieldData.FNAME, "Егор")
                .checkUserDataInputField(InputFieldData.FNAMELATIN, "Egor")
                .checkUserDataInputField(InputFieldData.LNAME, "Степанов")
                .checkUserDataInputField(InputFieldData.LNAMELATIN, "Stepanov")
                .checkUserDataInputField(InputFieldData.BLOGNAME, "stup.eg")
                .checkUserDataInputField(InputFieldData.DATAOFBIRTH, "18.04.1995");

//        new BasicInformation(driver)
//                .checkCountry()
//                .checkCity();

        new ContaintInformation(driver)
                .checkContactOne("vk.com/stuprg")
                .checkContactTwo("@stupeg");

        new Other(driver)
                .checkGender("Мужской")
                .checkCompany(InputOtherData.COMPANY, "ООО Айтулабс")
                .checkJobTitle(InputOtherData.WORK, "Инженер по тестированию 2 категории");
    }
}
