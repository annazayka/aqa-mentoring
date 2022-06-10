package Currency;

import Framework.Driver;
import Framework.Elem;
import Framework.Listener;
import Framework.Options;
import org.apache.log4j.*;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class TestNew {
    static final String path = "src/main/log.properties"; //где правильно это определять?


    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver", "/Users/hanna/Documents/chromedriver");
//        PropertyConfigurator.configure(path); //где правильно это определять?
        ChromeOptions options = new Options()
                .openBrowserFullScreen()
                //  .addCustomUserAgent()
                .setPageLoadStrategy(PageLoadStrategy.EAGER)
                .getOptions();

        WebDriver driver = Driver.getChromeDriver(options);
        EventFiringWebDriver eventDriver = new EventFiringWebDriver(driver);
        eventDriver.register(new Listener());

//        Elem.initWebDriver(eventDriver);

        List<Summary> summary = new LinkedList();


        //как это правильно организовать? отдельный клас?
        PrivatPage pp = new PrivatPage();
        pp.openPage();
        summary.add(new Summary("privat", pp.getUsdBuyRate(), pp.getUsdSellRate()));

        UkrsibPage ukrsib = new UkrsibPage(eventDriver);
        ukrsib.openPage();
        summary.add(new Summary("ukrsib", ukrsib.getUsdBuyRate(), ukrsib.getUsdSellRate()));

        // UniversalPage universal= new UniversalPage(driver);
        // universal.openPage();
        // summary.add(new Summary("ukrsib", universal.getUsdBuyRate(), universal.getUsdSellRate()));

        OschadPage oschad = new OschadPage(driver);
        oschad.openPage();
        summary.add(new Summary("oschad", oschad.getUsdBuyRate(), oschad.getUsdSellRate()));

        getMinUsdBuy(summary);
        getMaxUsdSell(summary);
        getAverage(summary);


    }


    public static void getMinUsdBuy(List<Summary> summary)

    {
        Collections.sort(summary, new SortedByUSDbuy());
        System.out.println("Minimum rate is in " +  summary.get(0).bank +"and rate is=" +summary.get(0).usd_buy);
    }

    public void configureDriver(){

    }
    public static void getMaxUsdSell(List<Summary> summary) {
        Collections.sort(summary, new SortedByUSDsell());
        System.out.println("Maximum rate is in " +  summary.get(0).bank +"and rate is=" +summary.get(0).usd_sell);
    }

    public static void getAverage(List<Summary> summary) {
        Double averageB = Double.valueOf(0);
        Double averageS = Double.valueOf(0);
        System.out.println("\n сортировка по usd buy");
        for (Summary sum : summary) {
            averageB = sum.usd_buy + averageB;
            averageS = sum.usd_sell + averageS;
            System.out.println(sum.toString());
        }

        System.out.println(averageB / summary.size() + " is average Buy Rate");
        System.out.println(averageS / summary.size() + " is average Sell Rate");
    }


    }







