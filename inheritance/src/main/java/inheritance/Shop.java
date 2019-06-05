package inheritance;

import java.util.ArrayList;

public class Shop {
    String name;
    String description;
    String priceCategory;
    ArrayList<Review> reviews;


    public Shop(String name, String description, String priceCategory) {
        this.name = name;
        this.description = description;
        this.priceCategory = priceCategory;
        this.reviews = new ArrayList<>();
    }

    public String toString() {
        return String.format("%s\n%s\n%s", this.name, this.description, this.priceCategory);
    }

    public void addReview(String body, String author, int stars) {
        Review review = new Review(body, author, stars);
        this.reviews.add(review);
    }
}
