package art_gallery;

public class Artwork {

    private String title;
    private Artist artist;
    private double price;
    private double nft;

    public Artwork(String title, Artist artist, double price, double nft){
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.nft = nft;
    }

}
