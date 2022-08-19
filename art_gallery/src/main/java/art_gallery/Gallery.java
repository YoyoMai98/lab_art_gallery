package art_gallery;

import java.util.ArrayList;

public class Gallery {

    private String name;
    private double till;
    private ArrayList<Artwork> artworks;

    public Gallery(String name){
        this.name = name;
        this.till = 0;
        this.artworks = new ArrayList<>();
    }

    public void addArtwork(Artwork artwork){
        this.artworks.add(artwork);
    }

    // ext_1
    public void removeArtwork(Artwork artwork){
        this.artworks.remove(artwork);
    }

    public void sellArtwork(Customer customer,Artwork artwork){
        if(customer.canBuyArtwork(artwork)){
            customer.buyArtwork(artwork);
            setTill(till += artwork.getPrice());
            removeArtwork(artwork);
        }
    }

    public int artworksListCount(){
        return this.artworks.size();
    }

    public ArrayList<Artwork> getArtworks(){
        return this.artworks;
    }

    public void setArtworks(ArrayList<Artwork> artworks){
        this.artworks = artworks;
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
