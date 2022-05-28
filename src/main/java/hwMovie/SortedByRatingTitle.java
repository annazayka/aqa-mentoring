package hwMovie;

import java.util.Comparator;

public class SortedByRatingTitle implements Comparator<Movie> {
    @Override
    public int compare(Movie o1, Movie o2) {

        double change1 = o1.getRating();
        double change2 = o2.getRating();
        if (change1 < change2) return -1;
        if (change1 > change2) return 1;
        return 0;
    }
}
