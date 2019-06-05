package inheritance;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TheaterTest {
    @Test
    public void testTheater_string() {
        ArrayList<String> movies = new ArrayList<>();
        movies.add("Ten");
        movies.add("Six");
        movies.add("Eleven");
        Theater theaterObject = new Theater("Hollywood", movies);
        String expectedDescription = "The theater's name is Hollywood\nTen\nSix\nEleven";
        String actualDescription = theaterObject.toString();
        assertEquals(expectedDescription, actualDescription);
    }

    @Test
    public void testTheater_addMovie() {
        ArrayList<String> movies = new ArrayList<>();
        Theater theaterObject = new Theater("Shop of Horrors", movies);
        theaterObject.addMovie("Shop of Horrors");
        String movie = theaterObject.movies.get(0);
        assertEquals("Shop of Horrors", movie);
    }

    @Test
    public void testTheater_removeMovie() {
        ArrayList<String> movies = new ArrayList<>();
        movies.add("Ten");
        movies.add("Six");
        movies.add("Eleven");

        Theater theaterObject = new Theater("Shop of Horrors", movies);
        theaterObject.removeMovie("Ten");

        ArrayList moviesExpected = new ArrayList();
        moviesExpected.add("Six");
        moviesExpected.add("Eleven");

        assertEquals(moviesExpected, movies);
    }

    @Test public void testTheater_addReview() {
        ArrayList<String> movies = new ArrayList<>();
        movies.add("Ten");
        movies.add("Six");
        movies.add("Eleven");

        Theater theaterObject = new Theater("Shop of Horrors", movies);

        theaterObject.addReview("Shop of Horrors is good", "John", 3);
        int numOfReviews = theaterObject.reviews.size();
        assertEquals(1, numOfReviews);
    }

    @Test public void testTheater_addMovieReview() {
        ArrayList<String> movies = new ArrayList<>();
        movies.add("Ten");
        movies.add("Six");
        movies.add("Eleven");

        Theater theaterObject = new Theater("Shop of Horrors", movies);

        theaterObject.addMovieReview("Shop of Horrors is good", "John", "MovieTitle", 3);
        int numOfReviews = theaterObject.reviews.size();
        assertEquals(1, numOfReviews);
    }

    @Test public void testTheater_construcotr() {
        ArrayList<String> movies = new ArrayList<>();
        movies.add("Ten");
        movies.add("Six");
        movies.add("Eleven");

        Theater theaterObject = new Theater("Test", movies);
        assertEquals("Test", theaterObject.name);
    }
}