package Currency;

import Framework.Elem;
import Framework.Listener;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PrivatPage {

    //public String USD_buy = "[data-cource_type=posts_course] table tr [id=USD_buy]";
    public String USD_buy = "[id=USD_buy]";
    //public String USD_sell = "[data-cource_type=posts_course] table tr [id=USD_sell]";
    public String USD_sell = "[id=USD_sell]";


    public static final String PAGE_URL = "https://privatbank.ua/";

    private WebDriver driver;

    public PrivatPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        driver.get(PAGE_URL);
    }
    public Double getUsdBuyRate(){

        Elem test = new Elem(USD_buy);

        test.getText1();

        return Double.valueOf(test.getText1());
    }    public Double getUsdSellRate(){
        Elem test = new Elem(USD_sell);
        test.getText1();

        return Double.valueOf(test.getText1());
    }

}