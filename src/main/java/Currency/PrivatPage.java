package Currency;

import Framework.Elem;
import Framework.Listener;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static Framework.Driver.getChromeDriver;

public class PrivatPage {

    //public String USD_buy = "[data-cource_type=posts_course] table tr [id=USD_buy]";
    public Elem USD_buy = new Elem("[id=USD_buy]");
    //public String USD_sell = "[data-cource_type=posts_course] table tr [id=USD_sell]";
    public Elem USD_sell = new Elem("[id=USD_sell]");


    public static final String PAGE_URL = "https://privatbank.ua/";

    private WebDriver driver;

    public PrivatPage() {
        this.driver = getChromeDriver();
    }

    public void openPage() {
        driver.get(PAGE_URL);
    }
    public Double getUsdBuyRate(){
        return Double.valueOf(USD_buy.getText1());
    }
    public Double getUsdSellRate(){
        return Double.valueOf(USD_sell.getText1());
    }

}