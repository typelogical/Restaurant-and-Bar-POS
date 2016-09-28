/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bar;

import bar.Item;
import bar.Summary;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author user
 */
public class Table implements Serializable {
  private static int  idCounter;
    protected  ArrayList<Item> items;
    private String barAdress;
    private String waiterName;
    private Date date;
    private float netAmount;
    private float VAT;
    private float totalAmount;
    private int id;
    private User cust;
    
    public Table(ArrayList<Item> items, String barAdress, String 
waiterName, Date date, float netAmount, float VAT, float totalAmount, User cust) {
        this.items = items;
        this.barAdress = barAdress;
        this.waiterName = waiterName;
        this.date = date;
        this.netAmount = netAmount;
        this.VAT = VAT;
        this.totalAmount = totalAmount;
        this.cust = cust;
        this.id = idCounter;
        ++idCounter;
       
    }
    
    public int getId() {
        return id;
    }
    public int getCustId () {
        return cust.getId ();
    }
    public void addItem (Item item) {
        items.add (item);
    }
    public boolean modifyItem (Item item) {
        for (Item i : items) {
            if (i.getId () == item.getId ()) {
                i.setName (item.getName ());
                i.setPrice (item.getPrice ());
                return true;
            }
        } 
        return false;
    }
    
    public boolean removeItem (int id) {
        for (Item i : items) {
            if (i.getId () == id) {
                items.remove (i);
                return true;
            }
        }
        return false;
    }

    public int getItemsServed () {
        return this.items.size ();
    }
    public boolean applyDiscount (int id, float discount) {
        for (Item i : items) {
            if (i.getId () == id) {
                i.setPrice (i.getPrice () - i.getPrice () * discount);
                return true;
            }
        }
        return false;
    }
    public ArrayList<Item> getItems() {
        return items;
    }
    public Item gettem(int id) {
        for (Item i : items) {
            if (i.getId () == id)
                return i;
        }
        return null;
    }
    
    public String getBarAdress() {
        return barAdress;
    }

    public String getWaiterName() {
        return waiterName;
    }

    public Date getDate() {
        return date;
    }

    public float getNetAmount() {
     return this.totalAmount * (1 - this.VAT);  
    }

    public float getVAT() {
        return VAT;
    }

    public float getTotalAmount() {
        float val = 0;
        for (Item i : items) {
            val += i.getPrice ();
        }
        totalAmount = val;
        return totalAmount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setItem(ArrayList<Item> item) {
        this.items = item;
    }

    public void setBarAdress(String barAdress) {
        this.barAdress = barAdress;
    }

    public void setWaiterName(String waiterName) {
        this.waiterName = waiterName;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setNetAmount(float netAmount) {
        this.netAmount = netAmount;
    }

    public void setVAT(float VAT) {
        this.VAT = VAT;
    }

    public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
    } 
    protected String printTableHeader () {
        return ("Table id: " + id + "\nType: Simple\n\n");
    }
    public String printInfo () {
        StringBuffer str = new StringBuffer ();
        str.append(printTableHeader ());
        str.append("Waiter: " + this.getWaiterName());
        if ( items.size () > 0) {
         
            str.append ("\nList of Items:\n");
            for (Item i : items) {
                str.append (i.printInfo() + "\n\n");
            }
        } else {
            str.append ("\nNo items in table\n");
        }
        return str.toString();
    }
    
    public void updateSummary (Summary s) {
        s.regularTable += getTotalAmount ();
        for (Item i : items) {
            i.updateSummary (s);
        }
    }
    
    public String calculatePayment () {
        StringBuffer str = new StringBuffer ();
        float cost = this.getTotalAmount ();
        float tax = (float)cost * this.getVAT ();
        Customer c = (Customer) this.cust;
        // Calculate bonus
        c.updateBonus (this);
        
        // If eligible, redeem automatically
        if (c.reedem ()) {
            // apply reddemible, redeem
            str.append ("You qualify for a bonus.\n");
            float bonus = c.getBonus ();
            str.append (c.getBonusDescription() + "\n");
            str.append ("Total cost: $" + cost + "+ $" + tax + " - $" + bonus + " = $" + (cost + tax + bonus));
        } else {
            str.append ("Total cost: $" + cost + "+ $" + tax + " = $" + (cost + tax));
        }
        return str.toString ();
    }
}
  

