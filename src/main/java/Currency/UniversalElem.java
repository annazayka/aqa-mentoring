package Currency;

public class UniversalElem implements Elem {

    public  static String getUsdSelectorB() {
        return "\"table[class^='rate table'] td:nth-child(2)\"";
    }


    public static String getUsdSelectorS() {
        return "\"table[class^='rate table'] td:nth-child(3)\"";
    }


    public static String getBankSelector() {
        return null;
    }
}