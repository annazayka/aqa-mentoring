package Framework;


import Currency.*;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/hanna/Documents/chromedriver");
        ChromeOptions options = new Options()
                .openBrowserFullScreen()
                .setPageLoadStrategy(PageLoadStrategy.EAGER)
                .getOptions();
        WebDriver driver = Driver.getChromeDriver(options);
        driver.get("https://www.google.com");
        Elem.initWebDriver(driver);


         //  var privateUSDBuy = new Elem(PrivatElem.getUsdSelectorB());
         //  var privateUSDSell = new Elem(PrivatElem.getUsdSelectorS());


    }
}