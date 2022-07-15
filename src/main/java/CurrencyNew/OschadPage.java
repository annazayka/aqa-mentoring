package CurrencyNew;

import Framework.Elem;
import org.openqa.selenium.WebDriver;

public class OschadPage extends BankPage {

    public Elem USD_buy = new Elem(".header-menu .header__content .currency__item:nth-child(1) span[class='currency__item_value']:nth-child(2)");
    public Elem USD_sell = new Elem(".header-menu .header__content .currency__item:nth-child(1) span[class='currency__item_value']:nth-child(2)");
    public String PAGE_URL = "https://www.oschadbank.ua/currency-rate";
    public String bank ="Ocshadbank";
    public OschadPage() {
        super();
    }
    @Override
    public Elem getUSD_buy() {
        return USD_buy;
    }
    @Override
    public Elem getUSD_sell() {
        return USD_sell;
    }

    public String getPAGE_URL() {
        return PAGE_URL;
    }

    @Override
    public void openPage() {
        this.getDriver().get(PAGE_URL);
    }
    @Override
    public Double getBuyRate()  {
        return Double.parseDouble(this.USD_buy.getText());
    }
    @Override
    public Double getSellRate()  {
        return Double.parseDouble(this.USD_sell.getText());
    }
    @Override
    public String getBank() {
        return bank;
    }





}

