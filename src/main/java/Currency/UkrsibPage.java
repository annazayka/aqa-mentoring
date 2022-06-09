package Currency;

import Framework.Elem;
import org.openqa.selenium.WebDriver;


public class UkrsibPage  {

    public String USD_buy = ".currency__table tbody > tr:nth-child(1) > td:nth-child(2)";
    public String USD_sell = ".currency__table tbody > tr:nth-child(1) > td:nth-child(3)";
    public static final String PAGE_URL = "https://my.ukrsibbank.com/ru/personal/operations/currency_exchange/";

    private WebDriver driver;

    public UkrsibPage(WebDriver driver) {
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