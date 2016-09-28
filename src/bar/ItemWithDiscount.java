
package bar;

import bar.Item;
import bar.Summary;

public class ItemWithDiscount extends Item{
    private float discount;

    public ItemWithDiscount( String name, float price,float discount) {
        super(name, price);
        this.discount = discount;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }
    
    private float calculateDiscount () {
        return (float) super.getPrice () * 1- (float)this.discount;
   }
    
   @Override
   public float getPrice () {
       setPrice (calculateDiscount ());
       return super.getPrice ();
   }
   
   @Override
   public String printInfo () {
       return super.printInfo() + "\n\tRegular";
   }
   
   public void updateSummary (Summary s) {
        s.discountItem++;
    }
}