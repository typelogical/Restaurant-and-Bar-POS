
package bar;

import bar.Summary;
import bar.Table;
import static bar.EmployeeCustomer.MIN_AMT;
import static bar.LoyalCustomer.BONUS;
import static bar.LoyalCustomer.MIN_REEDEMABLE;
import bar.User;

public class CompanyCustomer extends User implements Customer{
    private int itemsServed = 0;
    private int itemsServedAllTime = 0;
    public static int MIN_ITEMS = 300;
    public static int BONUS = 100;
    public CompanyCustomer(String name, String lastname, String phonenumber) {
        super(name, lastname, phonenumber);
    }

    public int getItemsServed() {
        return itemsServed;
    }
    // Calculate the current bonus recievalbe by the compnay
    public float calculateBonus () {
        return  this.itemsServed / MIN_ITEMS * BONUS;
    }
    
    public void updateBonus (Table t) {
        itemsServed += t.getItemsServed ();
        itemsServedAllTime = t.getItemsServed();
    }
    
    public boolean reedem () {
        if (this.itemsServed >= this.MIN_ITEMS) {
            this.itemsServed -= this.MIN_ITEMS;
            return true;
        } else {
            return false;
        }
    }
    
    public String getBonusDescription () {
        return "Items Purchased: " + this.itemsServed + "\nBonus: $" + this.BONUS;
    }
    
    public float getBonus () {
        return this.BONUS;
    }
    
    @Override
    public String  printType () {
        return "Company";
    }
    
    public void updateSummary (Summary s) {
        s.employeeCustomer += itemsServedAllTime / MIN_AMT;
    }
}