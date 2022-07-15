package hwMovie;

import Framework.Elem;
import Framework.ElemException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.util.LinkedList;
import java.util.List;

public class MoviePage  {

    public Elem rowMovie = new Elem(" .lister-list tr");
    public Elem titleCSS = new Elem(" .titleColumn a");
    public Elem rateCSS = new Elem(" .imdbRating");
    public Elem yearCSS = new Elem(" .secondaryInfo");
    public Elem positionCSS = new Elem(" .posterColumn [name=\"rk\"]");

    public List<Elem> elements;


    public static final String PAGE_URL = "https://www.imdb.com/chart/top/?ref_=nv_mv_250";

    private WebDriver driver;

    public MoviePage(WebDriver driver) {
        this.driver = driver;
    }
    public List<Movie> movies;

    public List<WebElement> getMovieRow() {

        return driver.findElements(By.cssSelector(".lister-list tr"));
    }

    public void openPage() {
        driver.get(PAGE_URL);
    }


    public List<Movie> getMovieInfo() {
        List<Elem> elements = rowMovie.findElements();
        List<Movie> movies = new LinkedList<>();
        int i =1;
        for (Elem element : elements) {

            movies.add(new Movie(
                    new Elem(String.format("%s:nth-child(%d) %s",rowMovie.getCssSelector(),i,titleCSS.getCssSelector())).getText(),
                    Double.parseDouble(new Elem(String.format("%s:nth-child(%d) %s",rowMovie.getCssSelector(),i,rateCSS.getCssSelector())).getText()),
                    Integer.parseInt( new Elem(String.format("%s:nth-child(%d) %s",rowMovie.getCssSelector(),i,positionCSS.getCssSelector())).getAttribute(30,"data-value")),
                    Integer.parseInt(new Elem(String.format("%s:nth-child(%d) %s",rowMovie.getCssSelector(),i,yearCSS.getCssSelector())).getText().substring(1, 5))));
            i++;

        }
        this.movies=movies;
        return movies;
    }


    public void checkElements(int randMoviePosition) throws ElemException {
        List<Elem> elements = rowMovie.findElements();
        SoftAssert softAssert =new SoftAssert();
        //softAssert.assertTrue(new Elem(elements.get(randMoviePosition).getCssSelector()+titleCSS.getCssSelector()).isPresent());
        //softAssert.assertTrue(new Elem(elements.get(randMoviePosition).getCssSelector()+yearCSS.getCssSelector()).isPresent());
        //softAssert.assertTrue(new Elem(elements.get(randMoviePosition).getCssSelector()+rateCSS.getCssSelector()).isPresent());
        softAssert.assertTrue(new Elem(String.format("%s %s",elements.get(randMoviePosition).getCssSelector(),rateCSS.getCssSelector())).isPresent());
        softAssert.assertTrue(new Elem(String.format("%s %s",elements.get(randMoviePosition).getCssSelector(),titleCSS.getCssSelector())).isPresent());
        softAssert.assertTrue(new Elem(String.format("%s %s",elements.get(randMoviePosition).getCssSelector(),yearCSS.getCssSelector())).isPresent());
        softAssert.assertAll();
}

   public Elem getButton(int randMoviePosition)  throws Exception {
       List<Elem> elements = rowMovie.findElements();
      return new Elem(String.format("%s:nth-child(%d) %s",rowMovie.getCssSelector(),randMoviePosition,titleCSS.getCssSelector()));
    }



}




