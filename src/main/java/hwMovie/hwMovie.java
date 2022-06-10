package hwMovie;

import Framework.Driver;
import Framework.Elem;
import Framework.Listener;
import Framework.Options;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.util.*;


public class hwMovie {
    static final String path = "src/main/log.properties"; //где правильно это определять?
    public static void main(String[] args) {

      //  List<Movie> movies = new LinkedList<Movie>();

        System.setProperty("webdriver.chrome.driver", "/Users/hanna/Documents/chromedriver");
        PropertyConfigurator.configure(path); //где правильно это определять?
        ChromeOptions options = new Options()
                .openBrowserFullScreen()
                //  .addCustomUserAgent()
                .setPageLoadStrategy(PageLoadStrategy.EAGER)
                .getOptions();

        WebDriver driver = Driver.getChromeDriver();
        EventFiringWebDriver eventDriver = new EventFiringWebDriver(driver);
        eventDriver.register(new Listener());

        Elem.initWebDriver(eventDriver);



        MoviePage mp = new MoviePage(eventDriver);
        mp.openPage();
        sortNature(mp.getMovieInfo());
        sortPosition(mp.getMovieInfo());
        sortTitle(mp.getMovieInfo());
        hardSort(mp.getMovieInfo());


        Map<Integer, Movie> map = new HashMap<>();
        for (Movie mv : mp.getMovieInfo()) {
            map.put(mv.getPosition(), mv);
        }
        System.out.println("\n~~~ сделать мап");
        map.forEach((key, value) -> System.out.println(key + ":" + value));

    }


    public static void sortNature(List<Movie> movies) {
        System.out.println(" без сортировки");
        for (Movie movie : movies)
            System.out.println(movie.toString());
    }

    public static void sortTitle(List<Movie> movies) {
        // Сортировка по названию
        Collections.sort(movies, new SortedByTitle());
        System.out.println("\n сортировка по названию");
        for (Movie movie : movies)
            System.out.println(movie.toString());
    }

    public static void sortPosition(List<Movie> movies) {
        // Сортировка по position
        Collections.sort(movies, new SortedByPosition());
        System.out.println("\n сортировка по position");
        for (Movie movie : movies)
            System.out.println(movie.toString());
    }

    public static void hardSort(List<Movie> movies) {
        // Сортировка по rating
        Comparator<Movie> titleReversedComp = new SortedByTitle().reversed();
        Collections.sort(movies, new SortedByRatingTitle().thenComparing(titleReversedComp));
        System.out.println("\n сортировка по rating and title");
        for (Movie movie : movies)
            System.out.println(movie.toString());
    }
}





