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


public class hwMovie  {
    static final String path = "src/main/log.properties"; //где правильно это определять?
    public static void main(String[] args) throws Exception{
        PropertyConfigurator.configure(path); //где правильно это определять?
        WebDriver driver = Driver.getChromeDriver();
     //   EventFiringWebDriver eventDriver = new EventFiringWebDriver(driver);
     //   eventDriver.register(new Listener());

        Elem.initWebDriver(driver);

        MoviePage mp = new MoviePage(driver);
        mp.openPage();
        List<Movie> movies = mp.getMovieInfo();
        sortNature(movies);
        sortPosition(movies);
        sortTitle(movies);
        hardSort(movies);
        listToSet(movies);


        Map<Integer, Movie> map = new HashMap<>();
        for (Movie mv : movies) {
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


    public static void listToSet(List<Movie> movies) { //ukr

        Set<Movie> set = new TreeSet<>(Comparator.comparing(movie -> movie.getRating()));
        set.addAll(movies);
        System.out.println("\n сделать сет");
        for (Movie movie : set) {
            System.out.println(movie);
        }
    }
}





