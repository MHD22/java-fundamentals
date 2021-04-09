package inheritance;

public class Review extends Restaurant {
    private String body;
    private String author;
    private int numOfStars;
    private Restaurant restaurant;

    public Review(Restaurant restaurant, String body, String author, int numOfStars) {
        super(restaurant.getName(), restaurant.getNumOfStars(),restaurant.getPriceCategory());
        this.restaurant = restaurant;
        this.body = body;
        this.author = author;
        this.numOfStars = numOfStars;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public int getNumOfStars() {
        return numOfStars;
    }

    @Override
    public void setNumOfStars(int numOfStars) {
        if(numOfStars >= 0 && numOfStars <=5){
            this.numOfStars = numOfStars;
        }
        else
            this.numOfStars =0;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public String toString() {
        return "Review{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", numOfStars=" + numOfStars +
                ", restaurant=" + restaurant.getName() +
                '}';
    }
}
