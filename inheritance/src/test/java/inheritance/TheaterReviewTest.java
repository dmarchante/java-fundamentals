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
}