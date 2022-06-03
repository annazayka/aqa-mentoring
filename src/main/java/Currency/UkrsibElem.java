package Currency;

public class UkrsibElem implements WrongElem {

    public  static String getUsdSelectorB() {
        return "tr:nth-child(2) td:nth-child(2)";
    }


    public static String getUsdSelectorS() {
        return "tr:nth-child(2) td:nth-child(3)";
    }


    public static String getBankSelector() {
        return null;
    }
}