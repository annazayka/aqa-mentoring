package Framework;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


public class Elem {

    private static final long DEFAULT_TIMEOUT = 30;
    private static WebDriver driver;
    private static WebDriverWait wait;
    private static Listener listener;
    private By by;
    private String cssSelector;

    public Elem(String cssSelector) {
        this.cssSelector = cssSelector;
        this.by = By.cssSelector(cssSelector);


    }

    public static void initWebDriver(WebDriver webDriver) {

        driver = webDriver;
    }

    public static void setUrl(String url) {
        driver.get(url);
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


    public  String getAttribute(long timeoutSeconds,String att) {
        WebElement wer = new WebDriverWait(driver, Duration.ofSeconds(timeoutSeconds))
                .until(ExpectedConditions.presenceOfElementLocated(by));
        return driver.findElement(by).getAttribute(att);
    }

    public String getText() {
        WebElement wer = new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_TIMEOUT))
                .until(ExpectedConditions.presenceOfElementLocated(by));
        return driver.findElement(by).getText();
    }

/*    public Boolean isPresent() {

            WebElement wer = new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_TIMEOUT))
                    .until(ExpectedConditions.presenceOfElementLocated(by));
          return  driver.findElement(by).isDisplayed();

    }*/

    public List<Elem> findElements() {
        List<WebElement> list = driver.findElements(by);
        List<Elem> result = new ArrayList<>(list.size());
        for (int i = 1; i <= list.size(); i++) {
            String selector = getCssSelector() + ":nth-child(" + i + ")";
            Elem elem = new Elem(selector);
            result.add(elem);
        }
        return result;
    }


    public boolean isPresent() throws ElemException {
        try
        {
            return driver.findElement(by).isDisplayed();
        }
        catch (NoSuchElementException e)
        { throw new ElemException("My exception say that element is not present");

        }
    }

    public void isClickable() throws  WebElementNotClickableException  {
        try
        {
            WebElement wer = new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_TIMEOUT))
                    .until(ExpectedConditions.elementToBeClickable(by));
            driver.findElement(by).isEnabled();

        }//не знаю как отловіть клібакбле
        catch (TimeoutException e)
        { throw new WebElementNotClickableException("My exception say that element is not clickable");

        }
    }
}