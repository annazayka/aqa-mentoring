package Currency;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Universal implements CurrencyI{
    public WebDriver driver;
    private String url="https://www.universalbank.com.ua/";
    public Universal(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public Double getRateBuy() {
       // List<WebElement> un = driver.findElements(By.cssSelector(UniversalElem.getUsdSelectorB()));
       // un.get(0).getText();
        return 8.0;
    }

    @Override
    public Double getSoldBuy() {
      //  List<WebElement> un = driver.findElements(By.cssSelector(UniversalElem.getUsdSelectorS()));
      //  un.get(0).getText();
        return 88.0;
    }
}
