package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class TheaterReviewTest {
    @Test
    public void testReviewString() {
        TheaterReview reviewObject = new TheaterReview("Jimbos is good", "John", 3);
        String expectedDescription = "3 of 5 stars\nJimbos is good by John";
        String actualDescription = reviewObject.toString();
        assertEquals(expectedDescription, actualDescription);
    }

    @Test
    public void testReviewMovieString() {
        TheaterReview reviewObject = new TheaterReview("Jimbos is good", "John", "Movie Title", 3);
        String expectedDescription = "Movie Title\n3 of 5 stars\nJimbos is good by John";
        String actualDescription = reviewObject.toMovieString();
        assertEquals(expectedDescription, actualDescription);
    }

    @Test
    public void testReviewString_constructor() {
        TheaterReview reviewObject = new TheaterReview("Jimbo's is good", "John", 3);
        assertEquals("Jimbo's is good", reviewObject.body);
        assertEquals("John", reviewObject.author);
        assertEquals(3, reviewObject.stars);
        assertEquals("", reviewObject.movie);
    }

    @Test
    public void testReviewMovieString_constructor() {
        TheaterReview reviewObject = new TheaterReview("Jimbo's is good", "John", "Movie Title", 3);
        assertEquals("Jimbo's is good", reviewObject.body);
        assertEquals("John", reviewObject.author);
        assertEquals("Movie Title", reviewObject.movie);
        assertEquals(3, reviewObject.stars);    }
}