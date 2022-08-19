package art_gallery;

import java.util.ArrayList;

public class Customer {

    private String name;
    private double wallet;
    private ArrayList<Artwork> purchasedArtworks;

    public Customer(String name, double wallet){
        this.name = name;
        this.wallet = wallet;
        this.purchasedArtworks = new ArrayList<>();
    }

    public double getWallet(){
        return wallet;
    }

    public void buyArtwork(Artwork artwork){
        wallet -= artwork.getPrice();
        addPurchasedArtwork(artwork);
    }

    public boolean canBuyArtwork(Artwork artwork){
        if(wallet >= artwork.getPrice()){
            return true;
        }else{
            return false;
        }
    }

    // ext_1
    public void addPurchasedArtwork(Artwork artwork){
        purchasedArtworks.add(artwork);
    }

    public int artworkListCount(){
        return purchasedArtworks.size();
    }

    public ArrayList<Artwork> getPurchasedArtworks(){
        return this.purchasedArtworks;
    }

    public void setPurchasedArtworks(ArrayList<Artwork> purchasedArtworks){
        this.purchasedArtworks = purchasedArtworks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}