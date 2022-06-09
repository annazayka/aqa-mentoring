package Framework;

import org.openqa.selenium.*;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Elem {

    private static final long DEFAULT_TIMEOUT = 30;
    private static WebDriver driver;
    private static WebDriverWait wait;
    private static  Listener listener;
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
       // listener.beforeFindBy(by,wer,driver);
        driver.findElement(by).click();
    }

    public void click() {
        click(DEFAULT_TIMEOUT);
    }

    public String getCssSelector() {
        return cssSelector;
    }

    public void getText(long timeoutSeconds) {
        WebElement wer = new WebDriverWait(driver, Duration.ofSeconds(timeoutSeconds))
                .until(ExpectedConditions.presenceOfElementLocated(by));
        driver.findElement(by).getText();
    }
    public String getText1() {
        WebElement wer = new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_TIMEOUT))
                .until(ExpectedConditions.presenceOfElementLocated(by));
        //driver.findElement(by).getText();

        return driver.findElement(by).getText();
    }
}