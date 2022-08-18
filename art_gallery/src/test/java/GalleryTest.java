import art_gallery.Artist;
import art_gallery.Artwork;
import art_gallery.Customer;
import art_gallery.Gallery;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {

    private Gallery gallery;
    private Artwork artwork;
    private Artwork irises;
    private Artist artist;
    private Customer customer;

    @BeforeEach
    public void setUp(){
        this.artist = new Artist("Vincent van Gogh");
        this.gallery = new Gallery("YK Gallery", 1300);
        this.artwork = new Artwork("The Starry Night", artist, 2000, 150);
        this.customer = new Customer("Harry", 3000);
        this.irises = new Artwork("Irises", artist, 1200, 230);
    }

    @Test
    public void canGetArtworkListsCount(){
        assertThat(gallery.artworksListCount()).isEqualTo(0);
    }

    @Test
    public void canGetTill(){
        double actual = gallery.getTill();
        double expected = 1300;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canAddArtwork(){
        gallery.addArtwork(irises);
        assertThat(gallery.artworksListCount()).isEqualTo(1);
    }

    @Test
    public void canRemoveArtwork(){
        gallery.removeArtwork(irises);
        assertThat(gallery.artworksListCount()).isEqualTo(0);
    }

    @Test
    public void canSellArtwork(){
        gallery.addArtwork(artwork);
        gallery.sellArtwork(customer,artwork);
        assertThat(gallery.getTill()).isEqualTo(3300);
        assertThat(customer.getWallet()).isEqualTo(1000);
        assertThat(gallery.artworksListCount()).isEqualTo(0);
        assertThat(customer.artworkListCount()).isEqualTo(1);
    }

    // ext_2
    @Test
    public void stockTake(){
        gallery.addArtwork(artwork);
        double actual = gallery.stockTake();
        double expected = 2000;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canSetTill(){
        gallery.setTill(2000);
        assertThat(gallery.getTill()).isEqualTo(2000);
    }
}
