package inheritance;

import java.util.ArrayList;

public class Theater {
    String name;
    ArrayList<String> movies;
    ArrayList<Review> reviews;

    public Theater (String name, ArrayList<String> movies) {
        this.name = name;
        this.movies = movies;
        this.reviews = new ArrayList<>();
    }

    public void addMovie(String movie) {
        this.movies.add(movie);
    }

    public void removeMovie(String movie) {
        this.movies.remove(movie);
    }

    public String toString() {
        StringBuilder outputString = new StringBuilder();
        outputString.append(String.format("The theater's name is %s", this.name));

        for (String movie : this.movies) {
            outputString.append(String.format("\n%s", movie));
        }

        return outputString.toString();
    }

    public void addMovieReview(String body, String author, String movie, int stars) {
        TheaterReview review = new TheaterReview(body, author, movie, stars);
        this.reviews.add(review);
    }

    public void addReview(String body, String author, int stars) {
        TheaterReview review = new TheaterReview(body, author, stars);
        this.reviews.add(review);
    }
}
