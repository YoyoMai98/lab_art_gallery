import art_gallery.Customer;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class CustomerTest {

    private Customer customer;

    @Test
    public void canGetWallet(){
        this.customer = new Customer("John", 130);
        double actual = customer.getWallet();
        double expected = 130;
        assertThat(actual).isEqualTo(expected);
    }
}
