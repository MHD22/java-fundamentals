package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Shop implements Reviewable {
    String name;
    String description;
    int numOfDollarSigns;
    List<Review> reviews = new ArrayList<>();


    public Shop(String name, String description, int numOfDollarSigns) {
        this.name = name;
        this.description = description;
        this.numOfDollarSigns = numOfDollarSigns;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", numOfDollarSigns=" + numOfDollarSigns +
                ", reviews=" + reviews +
                '}';
    }

    @Override
    public void addReview(String body, String author, int numOfStars) {
        Review newRev = new Review(body,author,numOfStars);
        if(! reviews.contains(newRev))
            reviews.add(newRev);
    }
}
