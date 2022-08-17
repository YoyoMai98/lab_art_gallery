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

    public void subtractWallet(double payment){
        if(payment <= wallet){
            wallet -= payment;
        }else{
            System.out.println("Not enough money!");
        }
    }

    public void addPurchasedArtwork(Artwork artwork){
        purchasedArtworks.add(artwork);
    }
}