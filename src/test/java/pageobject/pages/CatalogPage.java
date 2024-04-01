package pageobject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobject.BaseFunc;

import java.util.ArrayList;
import java.util.List;

public class CatalogPage {
    private final By PRICE_FROM = By.id("attr-from-price");
    private final By PRICE_TO = By.id("attr-to-price");
    private final By FILTER_VALUE = By.xpath(".//span[@class = 'catalog-taxons-filter-tools__active-filter']");
    private final By CATALOG_ITEM = By.xpath(".//div[contains(@class, 'catalog-taxons-product--grid-view')]");
    private final By DISCOUNT_PRICE = By.xpath(".//span[contains(@class, 'price-number')]");
    private final By REGULAR_PRICE = By.xpath(".//span[contains(@class, 'price__item-price')]/span[1]");
    private BaseFunc baseFunc;

    public CatalogPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void setPriceFilter(Double priceFrom, Double priceTo) {
        String priceFromAsText = String.valueOf(priceFrom.intValue());
        String priceToAsText = String.valueOf(priceTo.intValue());
        baseFunc.typeTextInCustomField(PRICE_FROM, priceFromAsText);
        baseFunc.pressEnter(PRICE_FROM);
        baseFunc.waitForContainingText(FILTER_VALUE, "€ no " + priceFromAsText);
        baseFunc.typeTextInCustomField(PRICE_TO, priceToAsText);
        baseFunc.pressEnter(PRICE_TO);
        baseFunc.waitForContainingText(FILTER_VALUE, "€ " + priceFromAsText + " - " + priceToAsText);
    }

    public List<Double> getAllActualPrices() {
        List<WebElement> products = baseFunc.findElements(CATALOG_ITEM);

        List<Double> actualPrices = new ArrayList<>();
        for (WebElement product : products) {
            if (baseFunc.findElements(product, DISCOUNT_PRICE).isEmpty()) {
                String price = baseFunc.getText(product, REGULAR_PRICE).replaceAll(",", ".");
                actualPrices.add(Double.valueOf(price));
            } else {
                String price = baseFunc.getText(product, DISCOUNT_PRICE).replaceAll(",", ".").replaceAll(" €", "");
                actualPrices.add(Double.valueOf(price));
            }
            return actualPrices;
        }
    }

}
