
package com.darylhowedevs.datastructuresalgoritimscadarylhowe;

public interface MusicPlayerInterface {

    /**
     * A method to add a song to the list.
     *
     * @param song The song to be added to the list.
     */
    public void add(Song song);

    /**
     * A method which returns the size of the list.
     *
     * @return int stating the current size of the list.
     */
    public int size();

    /**
     * A method to update the title of a song by its index position in the list.
     *
     * @param index int index position in the list.
     * @param newTitle string the new title of the song.
     * @return
     */
    public Song updateSongTitleByIndex(int index, String newTitle);

    /**
     * A method to update the release year of a song by its index position in
     * the list.
     *
     * @param index int index position in the list.
     * @param newReleaseYear int the new release year of the song.
     * @return Song returns the newly updated song's info.
     */
    public Song updateSongReleaseYearByIndex(int index, int newReleaseYear);

    /**
     * A method to update the title and release year of a song by its index
     * position in the list.
     *
     * @param index int index position in the list.
     * @param newTitle string the new title of the song.
     * @param newReleaseYear int the new release year of the song.
     * @return Song returns the newly updated song's info.
     */
    public Song updateSongByIndex(int index, String newTitle, int newReleaseYear);

    /**
     * A method to update a song by title. If the list contains duplicate songs
     * with the same name the song with lower index will be updated.
     *
     * @param oldTitle
     * @param newTitle
     * @return
     */
    public Song updateSongByTitle(String oldTitle, String newTitle);

    /**
     * A method which removes the last song added to the list. Will print a
     * message to the console if the list is already empty when called.
     *
     */
    public void removeTopSong();

    /**
     * A method to search for a song by title.
     *
     * @param title string the title of the song to search for.
     * @return Song returns the searched for song's information if found and
     * returns null if not found.
     */
    public Song searchByTitle(String title);

    /**
     * A method to close the program.
     */
    public void terminate();

    /**
     * A method to get a songs info by its index position on the list.
     *
     * @param index int a songs index position.
     * @return Song returns the searched for song's if found and returns null
     * index position is not within bounds.
     */
    public Song getSongInfoByIndex(int index);

    /**
     * A method to display all the songs in the list.
     */
    public void displayAllSongs();

    /**
     * A method to display all the songs in the list is descending order.
     */
    public void displayAllSongsDescendingOrder();

}
