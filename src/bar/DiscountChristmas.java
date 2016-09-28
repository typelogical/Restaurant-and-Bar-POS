
package bar;

import bar.Item;
import bar.Summary;

public class DiscountChristmas extends Item {
    private float discount;
    
    public DiscountChristmas(ItemWithDiscount item,float discount) {
        super (item.getName (), item.getPrice ());
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
       return super.printInfo() + "\n\tchristmas";
   }
   
   public void updateSummary (Summary s) {
        s.christmasItem++;
    }
}