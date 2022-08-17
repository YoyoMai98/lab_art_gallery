package art_gallery;

public class Customer {

    private String name;
    private double wallet;

    public Customer(String name, double wallet){
        this.name = name;
        this.wallet = wallet;
    }

    public double getWallet(){
        return wallet;
    }

    public void subtractWallet(double payment){
        wallet -= payment;
    }
}