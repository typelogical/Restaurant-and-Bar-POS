/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bar;

import bar.Summary;
import bar.Table;
import static bar.LoyalCustomer.BONUS;
import static bar.LoyalCustomer.MIN_REEDEMABLE;

/**
 *
 * @author William
 * 
 * A Customer can accumlate credits that can be reedeemd for points
 * 
 * Credits are accumalated through purchases of tables. The type
 * of credits in addition to the amount of credits that is given is 
 * defined by the type of table. Tables act as an instance of an
 * order. So each customer can order any number of tables in order
 * to accumlate credits.
 */

public interface Customer {
    public float calculateBonus ();
    
    public void updateBonus (Table t);
    
    public boolean reedem ();
    
    public String getBonusDescription ();
    
    public float getBonus ();
    public void updateSummary (Summary s);
}
