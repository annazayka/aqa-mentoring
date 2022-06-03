package Currency;

import Framework.Elem;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Ukrsib implements CurrencyI{
  //  public WebDriver driver;
    //private String url="https://my.ukrsibbank.com/ru/personal/operations/currency_exchange/";
    // driver.get("https://my.ukrsibbank.com/ru/personal/operations/currency_exchange/");


    @Override
    public Double getRateBuy() {
        List<WebElement> ukrsibListB = new Elem(UkrsibElem.getUsdSelectorB()).findElements();
        return Double.valueOf(ukrsibListB.get(0).getText());
    }

    @Override
    public Double getSoldBuy() {
        List<WebElement> ukrsibListS = new Elem(UkrsibElem.getUsdSelectorS()).findElements();
        return Double.valueOf(ukrsibListS.get(0).getText());
    }
}
