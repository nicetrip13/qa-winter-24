package pageobject.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobject.BaseFunc;

public class SubcategoriesPage {
    private final By SUBCATEGORY_NAME = By.xpath(".//span[@class = 'cat-title']");
    private final By SUBCATEGORY_PAGE_TITLE = By.tagName("h1");
    private final Logger LOGGER = LogManager.getLogger(this.getClass());
    private BaseFunc baseFunc;
    public SubcategoriesPage(BaseFunc baseFunc) {
        LOGGER.info("We are on Subcategories Page");
        this.baseFunc = baseFunc;
    }

    public void selectSubcategory(String subcategoryName) {
        LOGGER.info("Selecting" + subcategoryName + "from sub-menu");
        boolean isNameFound = false;
        for (WebElement we : baseFunc.findElements(SUBCATEGORY_NAME)) {
            if (we.getText().equals(subcategoryName)) {
//               baseFunc.scrollToElement(we);
//               baseFunc.hardClick(we);
                isNameFound = true;
                we.click();
                break;
            }
        }
        baseFunc.waitForText(SUBCATEGORY_PAGE_TITLE, subcategoryName);

    }
}
