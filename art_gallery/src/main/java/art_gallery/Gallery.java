package art_gallery;

import java.util.ArrayList;

public class Gallery {

    private String name;
    private double till;
    private ArrayList<Artwork> artworks;
    private Customer customer;

    public Gallery(String name, double till, Customer customer){
        this.name = name;
        this.till = till;
        this.artworks = new ArrayList<>();
        this.customer = customer;
    }

    public void addArtwork(Artwork artwork){
        this.artworks.add(artwork);
    }

    public void sellArtwork(){
        for(Artwork artwork : artworks){
            if(customer.getWallet() > artwork.getPrice()){
                till += customer.getWallet();
                customer.subtractWallet(artwork.getPrice());
                customer.addPurchasedArtwork(artwork);
//                this.artworks.remove(artwork);
            }
        }
    }

    public ArrayList getArtworks(){
        return artworks;
    }

    public double getTill(){
        return till;
    }

}
