package com.darylhowedevs.datastructuresalgoritimscadarylhowe;

/**
 * A class to create a song. Every song must be created with a title and release year. 
 * @author darylhowe
 */
public class Song {

    private String title;
    private int releaseYear;

    public Song(String title, int releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    }
    
    @Override
    public String toString(){
        return "Title: " + title + "\nRelease year: " + releaseYear;
    }
    
    // Setters Getters
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

}
