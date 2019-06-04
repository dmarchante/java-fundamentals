package inheritance;

public class Review {
    String body;
    String author;
    int stars;

    public Review(String body, String author, int stars) {
        this.body = body;
        this.author = author;
        this.stars = stars;
    }

    public String toString() {
        return String.format("%d of 5 stars\n%s by %s", stars, body, author);
    }
}