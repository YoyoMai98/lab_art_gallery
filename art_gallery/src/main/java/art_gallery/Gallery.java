package art_gallery;

import java.util.ArrayList;

public class Gallery {

    private String name;
    private double till;
    private ArrayList<Artwork> artworks;

    public Gallery(String name, double till){
        this.name = name;
        this.till = till;
        this.artworks = new ArrayList<>();
    }

    public void addArtwork(Artwork artwork){
        this.artworks.add(artwork);
    }

    public void removeArtwork(Artwork artwork){
        this.artworks.remove(artwork);
    }

    public void sellArtwork(Customer customer,Artwork artwork){
        if(customer.canBuyArtwork(artwork)){
            customer.subtractWallet(artwork);
            setTill(till += artwork.getPrice());
            removeArtwork(artwork);
        }
    }

    //ext_1
    public ArrayList<Artwork> getArtworks(){
        return artworks;
    }

    public double getTill(){
        return till;
    }

    public void setTill(double till){
        this.till = till;
    }

    // ext_2
    public double stockTake (){
        double totalArtwork = 0;
        for (Artwork artwork : this.artworks){
            totalArtwork += artwork.getPrice();
        }
        return totalArtwork;
    }
}
