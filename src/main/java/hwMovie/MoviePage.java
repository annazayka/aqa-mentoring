package hwMovie;

import Framework.Elem;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.LinkedList;
import java.util.List;

public class MoviePage {

    public String rowMovie = ".lister-list tr";
    public String titleCSS = ".titleColumn a";
    public String rateCSS = ".imdbRating";
    public String yearCSS = ".secondaryInfo";
    public String positionCSS = ".posterColumn [name=\"rk\"]";


    public static final String PAGE_URL = "https://www.imdb.com/chart/top/?ref_=nv_mv_250";

    private WebDriver driver;

    public MoviePage(WebDriver driver) {
        this.driver = driver;
    }

    public  List<WebElement> getMovieRow() {

        return driver.findElements(By.cssSelector(".lister-list tr"));
    }

    public void openPage() {
        driver.get(PAGE_URL);
    }

    public  List<Movie> getMovieInfo(){

        List<Movie> movies=new LinkedList<Movie>();

        for (int i = 1; i <5 ; i++) {
        Elem title = new Elem(rowMovie+":nth-child("+i+") "+titleCSS);
        Elem rating = new Elem(rowMovie+":nth-child("+i+") "+rateCSS);
        Elem year = new Elem(rowMovie+":nth-child("+i+") "+yearCSS);
        Elem position = new Elem(rowMovie+":nth-child("+i+") "+positionCSS);

        movies.add(new Movie(title.getText1(), Double.parseDouble(rating.getText1()), Integer.parseInt(position.getAttribute("data-value")), Integer.parseInt(year.getText1().substring(1, 5))));
            }

        return movies;
        }




}