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

}
