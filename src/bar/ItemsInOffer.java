package bar;

import bar.Item;
import bar.Summary;


public class ItemsInOffer extends Item{
private int buyN;
private int payN;
private int n;
private float totalPrice;

    public ItemsInOffer( String name, float price,int buyN, int payN, int n) {
        super(name, price);
        this.buyN = buyN;
        this.payN = payN;
        this.n = n;
        this.totalPrice =   (this.n*this.payN / this.buyN * super.getPrice ()) +
                    (super.getPrice () * this.n % this.buyN);
    }

    public int getBuyN() {
        return buyN;
    }

    public int getPayN() {
        return payN;
    }

    public void setBuyN(int buyN) {
        this.buyN = buyN;
    }

    public void setPayN(int payN) {
        this.payN = payN;
    }
                    
    private float buyMorePayLess () {
        return totalPrice;
    }
    @Override 
    public float getPrice () {
        return this.totalPrice;
    }
    @Override   public String printInfo () {

       return "Buy " + this.getBuyN() + " pay for " + this.getPayN() + "\nCount: " 
               + this.n + "\n" + super.printInfo();
   }
    
    public void updateSummary (Summary s) {
        s.itemsInOffer++;
    }
}
