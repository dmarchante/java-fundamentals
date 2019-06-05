package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {
    @Test
    public void testShop_string() {
        Shop shopObject = new Shop("Shop of Horrors", "$$", "It's a little shop of horrors");
        String expectedDescription = "Shop of Horrors\n$$\nIt's a little shop of horrors";
        String actualDescription = shopObject.toString();
        assertEquals(expectedDescription, actualDescription);
    }

    @Test public void testShop_addReview() {
        Shop shopObject = new Shop("Shop of Horrors", "$$", "It's a little shop of horrors");
        shopObject.addReview("Shop of Horrors is good", "John", 3);
        int numOfReviews = shopObject.reviews.size();
        assertEquals(1, numOfReviews);
    }
}