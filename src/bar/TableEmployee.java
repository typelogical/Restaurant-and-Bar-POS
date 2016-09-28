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

/**
 *
 * @author user
 */
public class TableEmployee extends Table {
   private int amount;

    public TableEmployee(ArrayList<Item> item, String barAdress, String waiterName, Date date, float netAmount, 
            float VAT, float totalAmount, User cust) {
        super(item, barAdress, waiterName, date, netAmount, VAT, totalAmount, cust);
    }
    
    @Override
    protected String printTableHeader () {
        return ("Table id: " + getId () + "\nType: Employee\nCustomer id: " + getCustId () + "\n");
    }
    
    public void updateSummary (Summary s) {
        s.employeeTable += getTotalAmount ();
        for (Item i : items) {
            i.updateSummary (s);
        }
    }
}
