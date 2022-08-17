import art_gallery.Artist;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtistTest {

    private Artist artist;

    @Test
    public void canGetName(){
        artist = new Artist("John");
        String actual = artist.getName();
        String expected = "John";
        assertThat(actual).isEqualTo(expected);
    }
}
