package test;

import Currency.Summary;

import CurrencyNew.*;
import Framework.Driver;
import Framework.Listener;
import Framework.Elem;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.*;

public class CurrencyTest {
    private WebDriver driver = Driver.getChromeDriver();

    List<Summary> summary = new LinkedList();



    @DataProvider(name = "data-provider")
    public Object[][] dpMethod(){
        return new Object[][] {{new UkrsibPage()},{new OschadPage()}};
    }
    @Test(priority = 1, dataProvider = "data-provider")
    public void getCurrency(BankPage page) {
        page.openPage();
        Elem.initWebDriver(page.getDriver());
        summary.add(new Summary(page.getBank(), page.getBuyRate(), page.getSellRate()));

    }

    @Test(priority = 2)
    public void getSummary(){
        Collections.sort(summary, new SortedByUSDbuy());
        System.out.println("Minimum rate is in " +  summary.get(0).bank +"and rate is=" +summary.get(0).getUsd_buy());

        Collections.sort(summary, new SortedByUSDsell());
        System.out.println("Maximum rate is in " +  summary.get(0).bank +"and rate is=" +summary.get(0).getUsd_sell());

    }

    @AfterTest
    public void ChromeClose() {
driver.quit();
    }
}


