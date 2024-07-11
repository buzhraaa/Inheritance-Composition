import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create instances of Director
        Director movieDirector = new Director("James Cameron");
        Director tvShowDirector = new Director("Vince Gilligan");

        // Create instances of Actor
        Actor actor1 = new Actor("Leonardo DiCaprio");
        Actor actor2 = new Actor("Kate Winslet");
        Actor actor3 = new Actor("Bryan Cranston");
        Actor actor4 = new Actor("Aaron Paul");

        // Create ArrayList for Movie and TV Show cast
        ArrayList<Actor> movieCast = new ArrayList<>();
        movieCast.add(actor1);
        movieCast.add(actor2);

        ArrayList<Actor> tvShowCast = new ArrayList<>();
        tvShowCast.add(actor3);
        tvShowCast.add(actor4);

        // Create instances of Media, Movie, and TV Show
        Media media = new Media("Generic Title", "PG", movieDirector, movieCast);
        Movie movie = new Movie("Titanic", "PG-13", movieDirector, movieCast, 195, "A fictionalized account of the sinking of the RMS Titanic", 2200000000.0);
        TvShow tvShow = new TvShow("Breaking Bad", "MA", tvShowDirector, tvShowCast, 5, 62);

        // Print data
        System.out.println("Media Title: " + media.getTitle());
        System.out.println("Media Rating: " + media.getRating());

        System.out.println("Movie Title: " + movie.getTitle());
        System.out.println("Movie Director: " + movie.getDirector().getName());

        System.out.println("TV Show Title: " + tvShow.getTitle());
        System.out.println("TV Show Rating: " + tvShow.getRating());
    }
}