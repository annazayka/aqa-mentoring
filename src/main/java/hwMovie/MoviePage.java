package hwMovie;

import Framework.Elem;
import Framework.ElemException;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.util.LinkedList;
import java.util.List;

public class MoviePage {

    public Elem rowMovie = new Elem(" .lister-list tr");
    public String titleCSS = " .titleColumn a";
    public String rateCSS = " .imdbRating";
    public String yearCSS = " .secondaryInfo";
    public String positionCSS = " .posterColumn [name=\"rk\"]";

    public List<Elem> elements;


    public static final String PAGE_URL = "https://www.imdb.com/chart/top/?ref_=nv_mv_250";

    private WebDriver driver;
   // public List<Elem> elements = rowMovie.findElements();

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
        for (Elem element : elements) {
            movies.add(new Movie(
                    new Elem(element.getCssSelector() + titleCSS).getText(),
                    Double.parseDouble(new Elem(element.getCssSelector() + rateCSS).getText()),
                    Integer.parseInt(new Elem(element.getCssSelector() + positionCSS).getAttribute(30,"data-value")),
                    Integer.parseInt((new Elem(element.getCssSelector() + yearCSS).getText()).substring(1, 5))));
        }
        this.movies=movies;
        return movies;
    }

    public String getTitleCSS() {
        return titleCSS;
    }

    public String getRateCSS() {
        return rateCSS;
    }

    public String getYearCSS() {
        return yearCSS;
    }

    public String getPositionCSS() {
        return positionCSS;
    }

    public Elem getRowMovie() {
        return rowMovie;
    }

    public Elem checkElements() throws ElemException {
        List<Elem> elements = rowMovie.findElements();
        return elements.get(3);

}

   public Elem getButton(int position)  {
       List<Elem> elements = rowMovie.findElements();
           return new Elem(elements.get(position).getCssSelector() + titleCSS);
    }



}
