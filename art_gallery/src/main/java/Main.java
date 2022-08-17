import art_gallery.Artist;
import art_gallery.Artwork;
import art_gallery.Customer;
import art_gallery.Gallery;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Artist artist = new Artist("Vincent van Gogh");

        Artwork artwork = new Artwork("The Starry Night", artist, 2000, 150);
        System.out.println(artwork.getPrice());

        Customer customer = new Customer("John", 3000);
        System.out.println("Wallet: " + customer.getWallet());

        Gallery gallery = new Gallery("YK Gallery", 1300);
        gallery.addArtwork(artwork);

        for(Artwork artwork1 : gallery.getArtworks()){
            System.out.println("gallery collection: " + artwork1.getTitle());
        }

        customer.subtractWallet(gallery, artwork);
        System.out.println("Wallet after purchasing: " + customer.getWallet());

        for(Artwork artwork1 : customer.getPurchasedArtwork()){
            System.out.println("customer collection: " + artwork1.getTitle());
        }
    }
}
