import java.util.ArrayList;

class TvShow extends Media {
    private int seasons;
    private int episodes;

    public TvShow(String title, String rating, Director director, ArrayList<Actor> cast, int seasons, int episodes) {
        super(title, rating, director, cast);
        this.seasons = seasons;
        this.episodes = episodes;
    }

    // Getters and setters
    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }
}

