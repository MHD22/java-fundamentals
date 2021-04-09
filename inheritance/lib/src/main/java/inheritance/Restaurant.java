package inheritance;

public class Restaurant {
    private String name;
    private int numOfStars;
    private String priceCategory;
    private Review review;

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
        else
            this.numOfStars =0;
    }

    public String getPriceCategory() {
        return priceCategory;
    }

    public void setPriceCategory(String priceCategory) {
        this.priceCategory = priceCategory;
    }

    public Review getReview() {
        return review;
    }

    public void addReview(Review review) {
            if(this.review == null || this.review != review) {
                this.setNumOfStars(review.getNumOfStars());
                this.review = review;
            }


    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", numOfStars=" + numOfStars +
                ", priceCategory='" + priceCategory + '\'' +
                ", review=" + review+
                '}';
    }
}
