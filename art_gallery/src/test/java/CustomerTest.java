import art_gallery.Artist;
import art_gallery.Artwork;
import art_gallery.Customer;
import art_gallery.Gallery;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class CustomerTest {

    private Customer customer;
    private Artist vanGogh;
    private Artwork starryNight;
    private Artwork irises;
    
    @BeforeEach
    public void setUp(){
        this.customer = new Customer("John", 1300);
        this.vanGogh = new Artist("Vincent van Gogh");
        this.starryNight = new Artwork("The Starry Night", vanGogh, 2000, 150);
        this.irises = new Artwork("Irises", vanGogh, 1200, 230);
    }

    @Test
    public void canGetWallet(){
        double actual = customer.getWallet();
        double expected = 1300;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canBuyArtwork__true(){
        boolean actual = customer.canBuyArtwork(irises);
        boolean expected = true;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canBuyArtwork__false(){
        boolean actual = customer.canBuyArtwork(starryNight);
        boolean expected = false;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canAddPurchasedArtwork(){
        customer.addPurchasedArtwork(starryNight);
        assertThat(customer.artworkListCount()).isEqualTo(1);
    }
    
}
