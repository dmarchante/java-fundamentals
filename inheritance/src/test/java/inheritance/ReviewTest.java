package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {
    @Test
    public void testReviewString() {
        Review reviewObject = new Review("Jimbos is good", "John", 3);
        String expectedDescription = "3 of 5 stars\nJimbos is good by John";
        String actualDescription = reviewObject.toString();
        assertEquals(expectedDescription, actualDescription);
    }

    @Test
    public void testReview_constructor() {
        Review reviewObject = new Review("Test body", "Test author", 3);
        assertEquals("Test body", reviewObject.body);
        assertEquals("Test author", reviewObject.author);
        assertEquals(3, reviewObject.stars);
    }
}