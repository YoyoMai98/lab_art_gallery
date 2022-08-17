import art_gallery.Artwork;
import art_gallery.Gallery;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {

    private Gallery gallery;
    private Artwork artwork;

    @BeforeEach
    public void setUp(){
        this.gallery = new Gallery("YK Gallery", 1300);
    }

    @Test
    public void canGetTill(){
        double actual = gallery.getTill();
        double expected = 1300;
        assertThat(actual).isEqualTo(expected);
    }
}
