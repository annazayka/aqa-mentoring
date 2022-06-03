package Currency;

import Framework.Elem;
import Framework.Listener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Private implements CurrencyI {
public WebDriver driver;
private String url="https://privatbank.ua/";
public Listener listener;
    public Private() {
        this.driver = driver;
    }


    @Override
    public Double getRateBuy() {
        WebElement privateCur = new Elem(PrivatElem.getUsdSelectorB()).findElement();
       listener.assertElementsPresent(new Elem("test"));

        return Double.valueOf(privateCur.getText());
    }

    @Override
    public Double getSoldBuy() {
        WebElement privateCur = new Elem(PrivatElem.getUsdSelectorS()).findElement();
        return Double.valueOf(privateCur.getText());
    }


}
