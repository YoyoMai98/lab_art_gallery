import art_gallery.Artist;
import art_gallery.Artwork;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtworkTest {

    private Artwork artwork;
    private Artist artist;

    @BeforeEach
    public void setUp(){
        this.artist = new Artist("Vincent van Gogh");
        this.artwork = new Artwork("The Starry Night", artist, 2000, 150);
    }

    @Test
    public void canGetPrice(){
        double actual = artwork.getPrice();
        double expected = 2000;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canGetTitle(){
        String actual = artwork.getTitle();
        String expected = "The Starry Night";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canGetNft(){
        assertThat(artwork.getNft()).isEqualTo(150);
    }

    @Test
    public void canGetArtist(){
        assertThat(artwork.getArtist().getName()).isEqualTo("Vincent van Gogh");
    }
}
