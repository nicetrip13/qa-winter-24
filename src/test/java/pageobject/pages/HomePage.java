package pageobject.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageobject.BaseFunc;

import java.util.List;

public class HomePage {
    private final By ACCEPT_COOKIES_BTN = By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");
    private final By MENU_ITEM = By.xpath(".//li[contains(@class, 'submenu-lvl1__list-item--has-child')]/a");
    private final By MENU = By.xpath(".//div[contains(@class, 'submenu-lvl1--index')]");
    private final By REGISTRATION_BTN = By.xpath(".//div[@class = 'user-block__title']");
    private final Logger LOGGER = LogManager.getLogger(this.getClass());
    private BaseFunc baseFunc;

    public HomePage(BaseFunc baseFunc) {
        LOGGER.info("We are on Home Page");
        this.baseFunc = baseFunc;
    }

    public void acceptCookies() {
      LOGGER.info("Accepting cookies");
        baseFunc.click(ACCEPT_COOKIES_BTN);
    }

    public void selectMenuItem(String menuItemName) {
        LOGGER.info("Selecting" + menuItemName + "from menu");
        WebElement menuBlock = baseFunc.findElement(MENU);
        List<WebElement> items = menuBlock.findElements(MENU_ITEM); //must be refactored
        boolean isSectionFound = false;
        for (WebElement we : items) {
            if (we.getText().equals(menuItemName)) {
                isSectionFound = true;
                we.click();
                break;
            }
        }

        Assertions.assertTrue(isSectionFound, "Can't find menu item " + menuItemName);
    }
    public void openLoginPage() {
        LOGGER.info("Opening Login Page");
        baseFunc.click(REGISTRATION_BTN);
    }
}
