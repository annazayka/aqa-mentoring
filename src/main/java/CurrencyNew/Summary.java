package CurrencyNew;

public class Summary {
    public String bank;

    public String getBank() {
        return bank;
    }

    public Double getUsd_buy() {
        return usd_buy;
    }

    public Double getUsd_sell() {
        return usd_sell;
    }

    Double usd_buy;
    Double usd_sell;

    public Summary(String bank, Double usd_buy, Double usd_sell) {
        this.bank = bank;
        this.usd_buy = usd_buy;
        this.usd_sell = usd_sell;
    }

    @Override
    public String toString() {
        return "[bank=" + this.bank + ", usd_buy=" + this.usd_buy + ", usd_sell=" + this.usd_sell+"+]";
    }

}
