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
}