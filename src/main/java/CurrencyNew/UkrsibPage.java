package CurrencyNew;

import Framework.Elem;

public class UkrsibPage extends BankPage {
    public Elem USD_buy = new Elem(".currency__table tbody > tr:nth-child(1) > td:nth-child(2)");
    public Elem USD_sell = new Elem(".currency__table tbody > tr:nth-child(1) > td:nth-child(3)");
    public String PAGE_URL = "https://my.ukrsibbank.com/ru/personal/operations/currency_exchange/";
    public String bank ="UkrsibPage";

    public UkrsibPage() {
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
