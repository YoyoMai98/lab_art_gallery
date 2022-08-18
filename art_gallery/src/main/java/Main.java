import art_gallery.Artist;
import art_gallery.Artwork;
import art_gallery.Customer;
import art_gallery.Gallery;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Artist artist = new Artist("Vincent van Gogh");

        Artwork artwork_1 = new Artwork("The Starry Night", artist, 2000, 150);
        System.out.println(artwork_1.getPrice());
        Artwork artwork_2 = new Artwork("Irises", artist, 1300, 230);

        Customer customer = new Customer("John", 3000);
        System.out.println("Wallet: " + customer.getWallet());

        Gallery gallery = new Gallery("YK Gallery", 1300);
        gallery.addArtwork(artwork_1);
        gallery.addArtwork(artwork_2);

        System.out.println("Stock: " + gallery.stockTake());

        gallery.sellArtwork(customer,artwork_1);
        System.out.println("Wallet after purchasing: " + customer.getWallet());

        System.out.println("Stock: " + gallery.stockTake());
    }
}
