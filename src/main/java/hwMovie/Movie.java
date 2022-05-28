package hwMovie;

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



}
