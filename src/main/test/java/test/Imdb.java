package test;

import Framework.Driver;
import Framework.Elem;
import hwMovie.Movie;
import hwMovie.MovieCardPage;
import hwMovie.MoviePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Imdb {
    private WebDriver driver = Driver.getChromeDriver();
    public MoviePage mp = new MoviePage(driver);
    SoftAssert softAssert = new SoftAssert();
    int randValue = new Random().nextInt(5);


    @BeforeTest
    public void setupTest() {
        System.setProperty("webdriver.chrome.driver", "/Users/hanna/Documents/chromedriver");
        Elem.initWebDriver(driver);
        mp.openPage();
    }

    @Test(priority = 1)
    public void get250Movies() {

        List<Movie> movies = mp.getMovieInfo();
        Map<Integer, Movie> map = new HashMap<>();
        for (Movie mv : movies) {
            map.put(mv.getPosition(), mv);
        }
        System.out.println("\n~~~ Найденные фильмы");
        map.forEach((key, value) -> System.out.println(key + ":" + value));

    }

    @Test(priority = 2)
    public void CheckElement() {

        Elem elements = mp.checkElements();
        softAssert.assertTrue(new Elem(elements.getCssSelector()+mp.titleCSS).isPresent(), "title is absent");
        softAssert.assertTrue(new Elem(elements.getCssSelector()+mp.rateCSS).isPresent(), "rate is absensed");
        softAssert.assertTrue(new Elem(elements.getCssSelector()+mp.yearCSS).isPresent(), "year is missed");
        softAssert.assertAll();
    }

    @Test(priority = 3)
    public void goToCard(){
       Elem button= mp.getButton(randValue);
        button.isClickable();
        button.click();

    }



   @Test(priority = 4)
    public void CompareObject() {
       MovieCardPage card = new MovieCardPage(driver);
       card.getCardInfo(randValue);
        softAssert.assertEquals(card.getCardInfo(randValue).getPosition(),mp.movies.get(randValue).getPosition(), "soo baddd");
        softAssert.assertEquals(card.getCardInfo(randValue).getRating(), mp.movies.get(randValue).getRating() );
        softAssert.assertEquals(card.getCardInfo(randValue).getTitle() , mp.movies.get(randValue).getTitle());
        softAssert.assertAll();
    }

    @AfterTest
    public void ChromeClose() {
        driver.quit();
    }
}
