package quotes;

import java.util.ArrayList;

public class Quote {
    protected ArrayList<String> tags;
    protected String author;
    protected String likes;
    protected String text;
//    protected String starWarsQuote;


    public Quote(ArrayList<String> tags, String author, String likes, String text) {
        this.tags = tags;
        this.author = author;
        this.likes = likes;
        this.text = text;
    }

//    public Quote(String starWarsQuote) {
//        this.starWarsQuote = starWarsQuote;
//    }
}
