package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements Reviewable {
    private String name;
    private int numOfStars;
    private String priceCategory;
    List<Review> reviews = new ArrayList<>();


    public Restaurant(String name, int numOfStars, String priceCategory) {
        this.name = name;
        this.numOfStars = numOfStars;
        this.priceCategory = priceCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfStars() {
        return numOfStars;
    }

    public void setNumOfStars(int numOfStars) {
        if(numOfStars >= 0 && numOfStars <=5){
            this.numOfStars = numOfStars;
        }
    }

    public String getPriceCategory() {
        return priceCategory;
    }

    public void setPriceCategory(String priceCategory) {
        this.priceCategory = priceCategory;
    }


    public void addReview(Review review) {
            if(! this.reviews.contains(review)) {
                this.setNumOfStars(review.getNumOfStars());
                this.reviews.add(review);
            }
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", numOfStars=" + numOfStars +
                ", priceCategory='" + priceCategory + '\'' +
                ", reviews=" + reviews+
                '}';
    }

    @Override
    public void addReview(String body, String author, int numOfStars) {
        Review newRev = new Review(body,author,numOfStars);
        if(! this.reviews.contains(newRev)) {
            this.setNumOfStars(newRev.getNumOfStars());
            this.reviews.add(newRev);
        }
    }
}
