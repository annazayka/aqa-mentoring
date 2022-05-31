package Currency;

public class PrivatElem implements Elem {

    public  static String getUsdSelectorB() {
        return "[data-cource_type=posts_course] table tr [id=USD_buy]";
    }


    public static String getUsdSelectorS() {
        return "[data-cource_type=posts_course] table tr [id=USD_sell]";
    }


    public static String getBankSelector() {
        return null;
    }
}