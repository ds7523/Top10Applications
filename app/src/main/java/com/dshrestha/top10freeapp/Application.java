package com.dshrestha.top10freeapp;

/**
 * Created by dshrestha on 6/30/16.
 */
public class Application {

    private String name;
    private String artist;
    private String releaseDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String toString(){
        return "Application name: " + getName() +
                "\nArtist: " + getArtist() +
                "\nRelease date: " + getReleaseDate()+"\n";
    }
}
