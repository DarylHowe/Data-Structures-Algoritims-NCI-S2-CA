package com.darylhowedevs.datastructuresalgoritimscadarylhowe;

public class MusicPlayerApp {

    public static void main(String args[]) {

        System.out.println("**********");
        System.out.println("Name: Daryl Howe");
        System.out.println("Student Number: x19211848");
        System.out.println("**********");
        System.out.println("");

        MusicPlayer musicPlayer = new MusicPlayer();

        musicPlayer.displayAllSongs();
        System.out.println("");

        Song song01 = new Song("Michael Jackson", 2002);
        Song song02 = new Song("Tame Impala", 2003);
        Song song03 = new Song("Kings of Leon", 2004);

        musicPlayer.add(song01);
        musicPlayer.add(song02);
        musicPlayer.add(song03);

        System.out.println("List size: " + musicPlayer.size());

        System.out.println("");
        System.out.println("Display all songs.");
        musicPlayer.displayAllSongs();

        System.out.println("");
        System.out.println("Update song title by index.");
        musicPlayer.updateSongTitleByIndex(0, "Westlife");

        System.out.println("Update song release year by index.");
        musicPlayer.updateSongReleaseYearByIndex(0, 1980);

        System.out.println("Display song info by index. ");
        System.out.println(musicPlayer.getSongInfoByIndex(0));

        System.out.println("");
        System.out.println("Update song title AND release year by index.");
        musicPlayer.updateSongByIndex(1, "Snoop Dog", 1981);
        System.out.println(musicPlayer.getSongInfoByIndex(1));

        System.out.println("");
        musicPlayer.displayAllSongs();

        System.out.println("");
        musicPlayer.updateSongByTitle("Kings of Leon", "Abba");
        musicPlayer.displayAllSongs();

        System.out.println("");
        System.out.println("Try update a songs (title, releaseYear and both) whos index does not exist. (3 seperate tests))");
        musicPlayer.updateSongTitleByIndex(-1, "TEST01");
        musicPlayer.updateSongReleaseYearByIndex(-1, -1);
        musicPlayer.updateSongByIndex(-1, "TEST03", -1);

        System.out.println("");
        musicPlayer.displayAllSongs();

        System.out.println("");
        System.out.println("Try update a song whos title does not exist");
        musicPlayer.updateSongByTitle("-1", "TEST04");

        System.out.println("");
        musicPlayer.displayAllSongs();

        System.out.println("");
        System.out.println("Search song by title.");
        System.out.println(musicPlayer.searchByTitle("Abba"));

        System.out.println("");
        System.out.println("Search song by title failure - TEST 05.");
        musicPlayer.searchByTitle("Kylie Minouge");

        System.out.println("");
        System.out.println("Display songs descending order.");
        musicPlayer.displayAllSongsDescendingOrder();

        System.out.println("");
        System.out.println("Display songs ascending order.");
        musicPlayer.displayAllSongs();

        System.out.println("");
        System.out.println("Remove top song.");
        musicPlayer.removeTopSong();
        musicPlayer.displayAllSongs();

        System.out.println("");

        System.out.println("Add beyond maximum amount of songs allowed - TEST 06");

        musicPlayer.add(song01);
        musicPlayer.add(song02);
        musicPlayer.add(song03);
        musicPlayer.add(song01);
        musicPlayer.add(song02);
        musicPlayer.add(song03);
        musicPlayer.add(song01);
        musicPlayer.add(song02);
        musicPlayer.add(song03);

        System.out.println("");
        musicPlayer.displayAllSongs();
        System.out.println("List size: " + musicPlayer.size());

        System.out.println("");
        System.out.println("Terminating program..");
        musicPlayer.terminate();
    }
}
