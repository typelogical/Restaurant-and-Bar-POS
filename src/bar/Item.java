
package bar;

import bar.Summary;
import java.io.Serializable;


public class Item implements Serializable {
    private String name;
    private static int idCounter;
    private float price;
    int id;
    public Item(String name, float price) {
        this.name = name;
        this.price = price;
        this.id = idCounter;
        idCounter+=1;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public float getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String printInfo () {
        StringBuffer buff = new StringBuffer ();
        buff.append( "\tID: " + this.getId () + "\n\tName: " + this.getName () + "\n\tPrice: " 
                           +   this.getPrice () + "\n\tDiscount: ");
        return buff.toString ();
    }
    
    public void updateSummary (Summary s) {
        s.regularItem++;
    }
}
