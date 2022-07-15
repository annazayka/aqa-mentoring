package test;

import Framework.Driver;
import Framework.Elem;
import hwMovie.Movie;
import hwMovie.MovieCardPage;
import hwMovie.MoviePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
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
   // int randValue = 3; //new Random().nextInt(5);


    @DataProvider(name = "data-provider")
    public Object[][] dpMethod(){
       // int rv=new Random().nextInt(250);
        return new Object[][] {{5}};
    }
   @BeforeTest
    public void setupTest() {
       // System.setProperty("webdriver.chrome.driver", "/Users/hanna/Documents/chromedriver");
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

    @Test(priority = 2,dataProvider = "data-provider")
    public void CheckElement(int randMoviePosition) {
        mp.checkElements(randMoviePosition);
    }

    @Test(priority = 3,dataProvider = "data-provider")

    public void goToCard(int randMoviePosition)  throws Exception{
        Elem button= mp.getButton(randMoviePosition);
        button.isClickable();
        button.click();

    }



   @Test(priority = 4, dataProvider = "data-provider")
    public void CompareObject(int randMoviePosition) {
       MovieCardPage card = new MovieCardPage(driver);
       card.getCardInfo(randMoviePosition);
        softAssert.assertEquals(card.getCardInfo(randMoviePosition).getRating(), mp.movies.get(randMoviePosition-1).getRating() );
        softAssert.assertEquals(card.getCardInfo(randMoviePosition).getTitle() , mp.movies.get(randMoviePosition-1).getTitle());
        softAssert.assertAll();
    }

    @AfterTest
    public void ChromeClose() {
        driver.quit();
    }
}
