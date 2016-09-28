/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bar;

import bar.Table;
import bar.Item;
import bar.Summary;
import java.util.ArrayList;
import java.util.Date;

public class TableLoyal extends Table{
    final public float POINTS_RATE = (float) 0.1;
   
    public TableLoyal(ArrayList<Item> item, String barAdress, String waiterName, Date date, float netAmount, 
            float VAT, float totalAmount, User cust) {
        super(item, barAdress, waiterName, date, netAmount, VAT, totalAmount, cust);
    }
    
    public float calculateBonus () {
        return (float) this.POINTS_RATE * getTotalAmount ();
    }
    
    @Override
    protected String printTableHeader () {
        return ("Table id: " + getId () + "\nType: Loyal\nCustomer id: " + getCustId () + "\n");
    }
    
    public void updateSummary (Summary s) {
        s.loyalTable += getTotalAmount ();
        for (Item i : items) {
            i.updateSummary (s);
        }
    }
}
