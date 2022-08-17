import art_gallery.Artist;
import art_gallery.Artwork;

public class Main {

    public static void main(String[] args) {
        Artist artist = new Artist("Vincent van Gogh");

        Artwork artwork = new Artwork("The Starry Night", artist, 2000, 150);
        System.out.println(artwork.getPrice());
    }
}
