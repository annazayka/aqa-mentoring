package hwMovie;

import Framework.Elem;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.Objects;

public class Movie {
    public String getTitle() {
        return title;
    }

    private String title;
    private double rating;

    public double getRating() {
        return rating;
    }

    public int getPosition() {
        return position;
    }

    private int position;
    public int year;

    public Movie(String title, double rating, int position, int year) {
        this.title = title;
        this.rating = rating;
        this.position = position;
        this.year = year;
    }


    @Override
    public String toString() {
        return "[position=" + this.position + ", title=" + this.title + ", rationg=" + this.rating + ", year=" + this.year + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
 return Double.compare(movie.rating, rating) == 0 && position == movie.position && year == movie.year && Objects.equals(title, movie.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, rating, position, year);
    }


}
