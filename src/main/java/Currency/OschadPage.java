package Currency;

import Framework.Elem;
import org.openqa.selenium.WebDriver;

public class OschadPage {

    public String USD_buy= ".header-menu .header__content .currency__item:nth-child(1) span[class='currency__item_value']:nth-child(2)";
    public String USD_sell = ".header-menu .header__content .currency__item:nth-child(1) span[class='currency__item_value']:nth-child(2)";

    public static final String PAGE_URL = "https://www.oschadbank.ua/currency-rate";

    private WebDriver driver;

    public OschadPage(WebDriver driver) {
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