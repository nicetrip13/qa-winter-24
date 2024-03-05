package pageobject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobject.BaseFunc;

public class SubcategoriesPage {
    private final By SUBCATEGORY_NAME = By.xpath(".//span[@class = 'cat-title']");

    private BaseFunc baseFunc;

    public SubcategoriesPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void selectSubcategory(String subcategoryName) {
        //TODO add flag here & assertions after the loop
        boolean isNameFound = false;
        for (WebElement we : baseFunc.findElements(SUBCATEGORY_NAME)) {
            if (we.getText().equals(SUBCATEGORY_NAME)) {
                isNameFound = true;
                we.click();
                break;
            }
        }
    }
}
