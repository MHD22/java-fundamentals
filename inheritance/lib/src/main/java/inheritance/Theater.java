package inheritance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Theater implements Reviewable {

    String name;
    List<String> movies = new ArrayList<>();
    Map<String,Review> reviews = new HashMap<>();

    public Theater(String name, List<String> movies) {
        this.name = name;
        this.movies = movies;
    }

    public Theater(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getMovies() {
        return movies;
    }

    public void addMovie(String movie) {
        this.movies.add(movie);
    }

    public void removeMovie(String movie){
        this.movies.remove(movie);
    }

    @Override
    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                ", movies=" + movies +
                ", reviews=" + reviews +
                '}';
    }

    @Override
    public void addReview(String body, String author, int numOfStars) {
        Review newRev = new Review(body,author,numOfStars);
        reviews.put("",newRev);
    }

    public void addReview(String body, String author, int numOfStars,String movie){
        Review newRev = new Review(body,author,numOfStars);
        reviews.put(movie,newRev);
    }
}
