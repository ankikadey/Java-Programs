public class Song {

    private String title;
    private int length; // Seconds

    /**
     * This constructor creates a new song.
     *
     * @param title  The title of the song.
     * @param length The duration of the song in seconds.
     */
    public Song(String title, int length) {
        if (length >= 0) {
            this.length = length;
        } else {
            System.out.println("Length was less than or equal to 0!");
            this.length = 1;
        }

        this.title = title;
    }

    /**
     * Returns the title of the song.
     *
     * @return Song title.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Returns the length of the song.
     *
     * @return Song duration in seconds.
     */
    public int getLength() {
        return length;
    }
}