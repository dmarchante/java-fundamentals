package inheritance;

public class TheaterReview extends Review {
    String movie;

    public TheaterReview (String body, String author, int stars) {
        super(body, author, stars);
        this.movie = "";
    }

    public TheaterReview (String body, String author, String movie, int stars) {
        super(body, author, stars);
        this.movie = movie;
    }

    public String toString() {
        return String.format("%d of 5 stars\n%s by %s", stars, body, author);
    }

    public String toMovieString() {
        return String.format("%s\n%d of 5 stars\n%s by %s", movie, stars, body, author);

    }
}
