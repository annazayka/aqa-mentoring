package Framework;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.logging.Level;

public class Elem {

    private static final long DEFAULT_TIMEOUT = 30;
    private static WebDriver driver;
    private static WebDriverWait wait;
    private By by;
    private String cssSelector;

    public Elem(String cssSelector) {
        this.cssSelector = cssSelector;
        this.by = By.cssSelector(cssSelector);
    }

    public static void initWebDriver(WebDriver webDriver) {
        driver = webDriver;
    }

    public static void setUrl(String url){ driver.get(url);
    }

    public void click(long timeoutSeconds) {
        WebElement wer = new WebDriverWait(driver, Duration.ofSeconds(timeoutSeconds))
                .until(ExpectedConditions.elementToBeClickable(by));
        driver.findElement(by).click();
    }

    public void click() {
        click(DEFAULT_TIMEOUT);
    }

    public String getCssSelector() {
        return cssSelector;
    }
    public List<WebElement> findElements(){
        return driver.findElements(by);
    }
    public WebElement findElement(){
        return driver.findElement(by);
    }


    public WebElement isPresent() {

return test;

    }
}