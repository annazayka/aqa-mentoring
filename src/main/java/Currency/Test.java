package Currency;

import hwMovie.Movie;
import hwMovie.SortedByPosition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/hanna/Documents/chromedriver");

// Подумайте какие опции вам могут понадобится для запуска, запускайте браузер во весь экран

        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        Ukrsib ukrsib = new Ukrsib(driver);
        Private privat = new Private(driver);
        // Universal universal = new Universal(driver);// не работает
//
        List<Summary> summary = new LinkedList();
        summary.add(new Summary("privat", privat.getRateBuy(), privat.getSoldBuy()));
        //  summary.add(new Summary("universal",universal.getRateBuy(), universal.getSoldBuy()));
        summary.add(new Summary("ukrsib", ukrsib.getRateBuy(), ukrsib.getSoldBuy()));
        //sort by usd
        Collections.sort(summary, new SortedByUSDbuy());
        System.out.println(summary.get(0) + "I am min");

        System.out.println("\n сортировка по usd buy");
        for (Summary sum : summary)
            System.out.println(sum.toString());
    }


}


