package Currency;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Private implements CurrencyI {
public WebDriver driver;
private String url="https://privatbank.ua/";

    public Private(WebDriver driver) {
        this.driver = driver;
    }


    @Override
    public Double getRateBuy() {
      driver.get(url);
      WebElement usdRateB = driver.findElement(By.cssSelector(PrivatElem.getUsdSelectorB()));
       return Double.valueOf(usdRateB.getText());
    }

    @Override
    public Double getSoldBuy() {
        driver.get(url);
        WebElement usdRateS = driver.findElement(By.cssSelector(PrivatElem.getUsdSelectorS()));
        return Double.valueOf(usdRateS.getText());
    }


}
