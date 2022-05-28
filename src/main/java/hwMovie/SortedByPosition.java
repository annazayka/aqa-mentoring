package hwMovie;

import java.util.Comparator;

public class SortedByPosition implements Comparator<Movie> {
    @Override
    public int compare(Movie o1, Movie o2) {
        return o1.getPosition()-o2.getPosition();
    }
}
