package pageobject;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BaseFunc {
    private WebDriver browser;
    private WebDriverWait wait;
    private JavascriptExecutor executor;

    public BaseFunc() {
        ChromeOptions options = new ChromeOptions();

        browser = new ChromeDriver();
        browser.manage().window().maximize();
        wait = new WebDriverWait(browser, Duration.ofSeconds(5));
        executor = (JavascriptExecutor) browser;
    }

    public void openURL(String url) {
        if (!url.startsWith("http://") && !url.startsWith("https://")) {
            url = "http://" + url;

            browser.get(url);

        }
    }
    public void click(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }
    public void hardClick(WebElement we) {
        try {
            we.click();
        }catch (ElementClickInterceptedException e) {
            System.out.println("can't perform click by Selenium");
            executor.executeScript("arguments[0].click();",we);
        }
    }
    public WebElement findElement(By locator) {
      return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }
    public List<WebElement> findElements(By locator) {
       return browser.findElements(locator);
    }
    public void scrollToElement(WebElement we) {
        executor.executeScript("arguments[0].scrollIntoView(true);", we);
        executor.executeScript("window scrollBy(0, 500);");
    }
    public void waitForText (By locator, String text) {
        wait.until(ExpectedConditions.textToBe(locator, text));
    }
    public void typeText(By locator, String text) {
     WebElement input = findElement(locator);
     input.clear();
     input.sendKeys(text);
    }
    public void pressEnter(By locator) {
        findElement(locator).sendKeys(Keys.ENTER);
    }
}
