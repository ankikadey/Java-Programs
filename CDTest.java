public class CDTest {
    public static void test() {
        CD cd = new CD("Impurity", "New Model Army");

        cd.addSong(new Song("Get Me Out", 201));
        cd.addSong(new Song("Space", 207));
        cd.addSong(new Song("Innocence", 294));
        cd.addSong(new Song("Purity", 289));
        cd.addSong(new Song("Whirlwind", 256));
        cd.addSong(new Song("Marrakesh", 195));
        cd.addSong(new Song("Lust For Power", 252));
        cd.addSong(new Song("Bury The Hatchet", 200));
        cd.addSong(new Song("Eleven Years", 233));
        cd.addSong(new Song("Lurhstaap", 278));
        cd.addSong(new Song("Before I Get Old", 233));
        cd.addSong(new Song("Vanity", 333));

        cd.printDetails();

        System.out.println();
        for (int i = 0; i <= cd.getSongCount(); i++) {
            System.out.println("Now playing: " + cd.shuffle().getTitle());
        }
    }

    public static void main(String[] args) {
        test();
    }
}
