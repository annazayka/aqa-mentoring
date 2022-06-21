package Framework;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {

    private static WebDriver driver;

    public Driver() {};

    public static WebDriver getChromeDriver() {
        System.setProperty("webdriver.chrome.driver", "/Users/hanna/Documents/chromedriver");

        if (driver == null) {
            ChromeOptions options = new Options()
                  //  .openBrowserFullScreen()
                    //  .addCustomUserAgent()
                    .setPageLoadStrategy(PageLoadStrategy.EAGER)
                    .getOptions();
            driver = new ChromeDriver(options);
            //driver = new ChromeDriver();

        }
        return driver;
    }

    public static WebDriver getChromeDriver(ChromeOptions options) {
        if (driver == null) {



        }
        return driver;
    }



}