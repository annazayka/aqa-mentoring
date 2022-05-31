package Currency;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Ukrsib implements CurrencyI{
    public WebDriver driver;
    private String url="https://my.ukrsibbank.com/ru/personal/operations/currency_exchange/";
    public Ukrsib(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public Double getRateBuy() {
        driver.switchTo();
        driver.get(url);
        List<WebElement> un = driver.findElements(By.cssSelector(UkrsibElem.getUsdSelectorB()));
        un.get(0).getText();
        return Double.valueOf(un.get(0).getText());
    }

    @Override
    public Double getSoldBuy() {
        List<WebElement> un = driver.findElements(By.cssSelector(UkrsibElem.getUsdSelectorS()));
        un.get(0).getText();
        return Double.valueOf(un.get(0).getText());
    }
}
