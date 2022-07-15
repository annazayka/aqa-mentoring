package CurrencyNew;

import Framework.Driver;
import Framework.Elem;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public abstract class BankPage implements CurrencyI{

    public Elem USD_buy=new Elem("2");
    public Elem USD_sell;
    public static String PAGE_URL;
    public String bank;
    private WebDriver driver = Driver.getChromeDriver();


    public BankPage() {
        this.USD_buy = USD_buy;
    }

    public Elem getUSD_buy() {
        return USD_buy;
    }

    public Elem getUSD_sell() {
        return USD_sell;
    }

    public void openPage() {
        this.getDriver().get(PAGE_URL);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public Double getBuyRate()  {
        return Double.parseDouble(this.USD_buy.getText());
    }

    public Double getSellRate()  {
        return Double.parseDouble(this.USD_sell.getText());
    }
    public String getBank() {
        return bank;
    }

}
