package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static Framework.Driver.getChromeDriver;

public class Elems {
    private static final long DEFAULT_TIMEOUT = 30;
    private static WebDriver driver;
    private static WebDriverWait wait;

    private By by;
    private static String cssSelector;

    public Elems (String cssSelector) {
        this.cssSelector = cssSelector;
        this.by = By.cssSelector(cssSelector);
        driver = getChromeDriver();
    }

    public static void initWebDriver(WebDriver webDriver) {

        driver = webDriver;
    }

    public static void setUrl(String url){ driver.get(url);
    }

    public static String getCssSelector() {
        return cssSelector;
    }



}
