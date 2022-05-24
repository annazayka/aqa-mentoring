package hw10;

import hw3.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static java.lang.Thread.sleep;

public class SeleniumClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/hanna/Documents/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://airslate.com/login");
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("zaika.hanna+aqa@airslate.com");
        driver.findElement(By.cssSelector("input[data-qa-tag='user-password-input']")).sendKeys("12345678");

        WebElement searchButton = driver.findElement(By.xpath("//button[@type='submit']"));
        searchButton.submit();
        List<WebElement> orgButton = driver.findElements(By.className("sl-panel__title"));
        orgButton.get(0).click();
    }
}
