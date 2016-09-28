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
/*
    Each company customer is assigned to the same table, and the
    table must be an instance of TableCompany.
*/
public class TableCompany extends Table{
    // The min amount of times served before being redeemable for a table
    static int MIN_AMOUNT = 300;
    public TableCompany(ArrayList<Item> item, String barAdress, String waiterName, Date date, float netAmount, float VAT, 
            float totalAmount, User cust) {
        super(item, barAdress, waiterName, date, netAmount, VAT, totalAmount, cust);
    }
    @Override
     protected String printTableHeader () {
        return ("Table id: " + getId () + "\nType: Company\nCustomer id: " + getCustId ()) + "\n";
    }
    public float calculateBonus () {
        return 0;
    }
    
    public void updateSummary (Summary s) {
        s.companyTable += getTotalAmount ();
        for (Item i : items) {
            i.updateSummary (s);
        }
    }
}