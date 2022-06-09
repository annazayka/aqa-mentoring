package Currency;

import Framework.Driver;
import Framework.Elem;
import Framework.Options;
import hwMovie.Movie;
import hwMovie.SortedByPosition;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public class Test {
    static final String path = "src/main/log.properties";

    public static void main(String[] args) {

        PropertyConfigurator.configure(path);
        System.setProperty("webdriver.chrome.driver", "/Users/hanna/Documents/chromedriver");
        ChromeOptions options = new Options()
                .openBrowserFullScreen()
                .setPageLoadStrategy(PageLoadStrategy.EAGER)
                .getOptions();
        WebDriver driver = Driver.getChromeDriver(options);

       Elem.initWebDriver(driver);
    Elem.setUrl("https://my.ukrsibbank.com/ru/personal/operations/currency_exchange/");

        //WebDriver driver = new ChromeDriver(options);
        //Ukrsib ukrsib = new Ukrsib();
        Elem.setUrl("https://privatbank.ua/");

      //   Private privat = new Private();
        // Universal universal = new Universal(driver);// не работает
//
        List<Summary> summary = new LinkedList();
      // summary.add(new Summary("privat", privat.getRateBuy(), privat.getSoldBuy()));
  //     ukrsib.getRateBuy();
    //   ukrsib.getSoldBuy();
        //  summary.add(new Summary("universal",universal.getRateBuy(), universal.getSoldBuy()));
        //summary.add(new Summary("ukrsib", ukrsib.getRateBuy(), 0.0));
        //sort by usd
      //  Collections.sort(summary, new SortedByUSDbuy());
        System.out.println(summary.get(0) + "I am min");

        System.out.println("\n сортировка по usd buy");
        for (Summary sum : summary)
            System.out.println(sum.toString());
    }


}


