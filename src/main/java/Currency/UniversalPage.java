package Currency;

import Framework.Driver;
import Framework.Elem;
import org.openqa.selenium.WebDriver;

public class UniversalPage  {

    public String USD_buy= "table[class=\"rate table table-bordered light fl-left m-t-2\"] tr:nth-child(2) td:nth-child(3)";
    public String USD_sell = "table[class=\"rate table table-bordered light fl-left m-t-2\"] tr:nth-child(2) td:nth-child(2)";

    public static final String PAGE_URL = "https://www.universalbank.com.ua/ru";

    private WebDriver driver;

    public UniversalPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        driver.get(PAGE_URL);
    }
    public Double getUsdBuyRate(){
        Elem test = new Elem(USD_buy);
        test.getText1();

        return Double.valueOf(test.getText1());
    }

    public Double getUsdSellRate(){
        Elem test = new Elem(USD_sell);
        test.getText1();

        return Double.valueOf(test.getText1());
    }
}