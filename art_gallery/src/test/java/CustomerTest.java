import art_gallery.Artwork;
import art_gallery.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class CustomerTest {

    private Customer customer;
    
    @BeforeEach
    public void setUp(){
        this.customer = new Customer("John", 130);
    }

    @Test
    public void canGetWallet(){
        double actual = customer.getWallet();
        double expected = 130;
        assertThat(actual).isEqualTo(expected);
    }
    
}
