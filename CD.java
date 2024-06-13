import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class CD {

    private String title;
    private String artist;
    private ArrayList<Song> songs;
    private Random random;
    private HashSet<Song> playedSongs;

    /**
     * This constructor creates a new CD.
     *
     * @param title  The title of the CD.
     * @param artist The name of the artist.
     */
    public CD(String title, String artist) {
        this.title = title;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
        this.playedSongs = new HashSet<>(); // initialize HashSet
        this.random = new Random();
    }

    /**
     * Adds a song to the CD.
     *
     * @param song The song to add.
     */
    public void addSong(Song song) {
        this.songs.add(song);
    }

    /**
     * Returns the number of songs.
     *
     * @return Number of songs.
     */
    public int getSongCount() {
        return songs.size();
    }

    /**
     * Prints the details of the CD to the screen.
     */
    public void printDetails() {
        System.out.println(title + " (" + artist + "), " + getSongCount() + " songs:");

        int totalLength = 0;
        for (Song s : songs) {
            System.out.println(s.getTitle() + " (" + secondsToMinutes(s.getLength()) + ")");
            totalLength += s.getLength();
        }

        System.out.println("Total playtime: " + secondsToMinutes(totalLength));
    }

    /**
     * Converts the length of the song to a readable form.
     *
     * @param seconds The length of the song in seconds.
     * @return Song duration in the format m:ss.
     */
    private String secondsToMinutes(int seconds) {
        return "" + (seconds / 60) + ":" + addLeadingZero(seconds % 60);
    }

    /**
     * Returns a two-digit number with a leading zero.
     * For example, 9 becomes "09", and 10 becomes "10".
     *
     * @param number A one- or two-digit number.
     * @return The number with two digits and, if necessary, a leading zero.
     */
    private String addLeadingZero(int number) {
        if (number < 10) {
            return "0" + number;
        } else {
            return "" + number;
        }
        // Shorter: return (number < 10 ? "0" : "") + number;
    }

    /**
     * Returns a random song from the CD.
     *
     * @return A random song from the CD.
     */
    public Song shuffle () {
        // Implementation for returning a random song.
        if (playedSongs.size() == songs.size()) {
            playedSongs.clear(); // empty the set
        }

        Song song;
        do {
            int index = random.nextInt(songs.size());
            song = songs.get(index);
        } while (playedSongs.contains(song));

        playedSongs.add(song);
        return song;
    }

    
}
