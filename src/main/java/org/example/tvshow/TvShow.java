package org.example.tvshow;

public class TvShow {
    private String showName;
    private int episodeCount;
    private String genre;

    //constructor with all parameters
    public TvShow(String showName, int episodeCount, String genre) {
        this.showName = showName;
        this.episodeCount = episodeCount;
        this.genre = genre;

    }
    //constructor with 2 parameters
    public TvShow(String showName, int episodeCount) {
        this.showName = showName;
        this.episodeCount = episodeCount;
        this.genre = "Unknown";
    }



    //default constructor
    public TvShow() {
            this.showName = "Unknown";
            this.episodeCount = 0;
            this.genre = "Unknown";
    }

    //getter for name
    public String getShowName() {
    return showName;
    }

    //getter for count
    public int getEpisodeCount() {
        return episodeCount;
    }

    //getter for genre
    public String getGenre() {
        return genre;
    }

    //string method
    @Override
    public String toString() {
        return "TV Show: " + getShowName() + ", Episodes: " + getEpisodeCount() + ", Genre: " + getGenre();

    }
}
