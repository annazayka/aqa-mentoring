package hwMovie;

import java.util.Comparator;

public class SortedByTitle implements Comparator<Movie> {
    @Override
    public int compare(Movie o1, Movie o2) {


            String str1 = o1.getTitle();
            String str2 = o2.getTitle();

            return str1.compareTo(str2);
    }
}
