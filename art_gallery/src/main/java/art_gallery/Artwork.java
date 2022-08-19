package art_gallery;

public class Artwork {

    private String title;
    private Artist artist;
    private double price;
    private int nft;

    public Artwork(String title, Artist artist, double price, int nft){
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.nft = nft;
    }

    public double getPrice(){
        return price;
    }
    
    public String getTitle(){
        return title;
    }

    public Artist getArtist() {
        return artist;
    }

    public int getNft() {
        return nft;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setNft(int nft) {
        this.nft = nft;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }
}
