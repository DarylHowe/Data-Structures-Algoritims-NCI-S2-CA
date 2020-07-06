
package com.darylhowedevs.datastructuresalgoritimscadarylhowe;

import java.util.ArrayList;

public class MusicPlayer implements MusicPlayerInterface {

    private ArrayList<Song> songList = new ArrayList<Song>();

    @Override
    public void add(Song newSong) {
        if (songList.size() < 10) {
            songList.add(newSong);
            System.out.println("Song added successfully.");
            System.out.println("Song list size: " + songList.size());
        } else {
            System.out.println("You have reached a maximum capacity of " + songList.size() + " songs.");
            System.out.println("Please remove a song before adding another.");
        }
    }

    @Override
    public int size() {
        return songList.size();
    }

    @Override
    public Song updateSongTitleByIndex(int index, String newTitle) {

        if (index >= 0 && index < songList.size()) {
            songList.get(index).setTitle(newTitle);
            return songList.get(index);
        } else {
            System.out.println("A song of index " + index + " does not exists.");
            return null;
        }
    }

    @Override
    public Song updateSongReleaseYearByIndex(int index, int newReleaseYear) {

        if (index >= 0 && index < songList.size()) {
            songList.get(index).setReleaseYear(newReleaseYear);
            return songList.get(index);
        } else {
            System.out.println("A song of index " + index + " does not exists.");
            return null;
        }
    }

    @Override
    public Song updateSongByIndex(int index, String newTitle, int newReleaseYear) {

        if (index >= 0 && index < songList.size()) {
            songList.get(index).setTitle(newTitle);
            songList.get(index).setReleaseYear(newReleaseYear);
            return songList.get(index);
        } else {
            System.out.println("A song of index " + index + " does not exists.");
            return null;
        }
    }

    @Override
    public Song updateSongByTitle(String oldTitle, String newTitle) {
        int i;
        boolean songFound = false;

        for (i = 0; i < songList.size(); i++) {

            if (songList.get(i).getTitle().equalsIgnoreCase(oldTitle)) {
                System.out.println("Song found.");
                songFound = true;
                break;
            }
        }

        if (songFound == true) {
            songList.get(i).setTitle(newTitle);
            System.out.println("Song title update successful.");
            return songList.get(i);
        } else {
            System.out.println("A song titled " + oldTitle + " does not exist on the list.");
            return null;
        }
    }

    @Override
    public Song searchByTitle(String title) {
        int i;
        boolean songFound = false;

        for (i = 0; i < songList.size(); i++) {

            if (songList.get(i).getTitle().equalsIgnoreCase(title)) {
                System.out.println("Song found.");
                songFound = true;
                break;
            }
        }

        if (songFound == true) {
            return songList.get(i);
        } else {
            System.out.println("A song titled " + title + " does not exist on the list.");
            return null;
        }
    }

    @Override
    public void removeTopSong() {
        if (!songList.isEmpty()) {
            songList.remove(songList.get(songList.size() - 1));
        } else {
            System.out.println("Song list is emputy and no song could therefore be removed.");
        }
    }

    @Override
    public void displayAllSongs() {

        if (songList.isEmpty()) {
            System.out.println("There are no songs in the list to display.");
        } else {
            System.out.println("** Song List ** ");
            for (int i = 0; i < songList.size(); i++) {
                System.out.println(songList.get(i));
            }
        }
    }

    @Override
    public void terminate() {
        System.exit(0);
    }

    @Override
    public Song getSongInfoByIndex(int index) {
        
        if (index >= 0 && index < songList.size()) {
            return songList.get(index);

        } else {
            return null;
        }
    }

    @Override
    public void displayAllSongsDescendingOrder() {

        if (songList.isEmpty()) {
            System.out.println("There are no songs in the list to display.");
        } else {
            System.out.println("** Song List ** ");
            for (int i = songList.size() - 1; i >= 0; i--) {
                System.out.println(songList.get(i));
            }
        }
    }

}
