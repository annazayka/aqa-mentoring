package hwMovie;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;


public class hwMovie {
    public static void main(String[] args) {

        List<Movie> movies = new LinkedList<Movie>();
        System.setProperty("webdriver.chrome.driver", "/Users/hanna/Documents/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.imdb.com/chart/top/");

        List<WebElement> rows = driver.findElements(By.cssSelector(".lister-list tr"));
        for (WebElement row : rows) {
            WebElement title = row.findElement(By.cssSelector(".lister-list tr .titleColumn a"));
            WebElement rating = row.findElement(By.cssSelector(".lister-list tr .imdbRating"));
            WebElement year = row.findElement(By.cssSelector(".lister-list tr .secondaryInfo"));
            WebElement position = row.findElement(By.cssSelector(".lister-list tr .posterColumn [name=\"rk\"]"));
            movies.add(new Movie(title.getText(), Double.parseDouble(rating.getText()), Integer.parseInt(position.getAttribute("data-value")), Integer.parseInt(year.getText().substring(1, 5))));
        }

        sortNature(movies);
        sortPosition(movies);
        sortTitle(movies);
        hardSort(movies);


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
}





