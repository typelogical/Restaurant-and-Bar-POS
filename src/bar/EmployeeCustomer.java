
package bar;

import bar.Summary;
import bar.Table;
import bar.User;

public class EmployeeCustomer extends User implements Customer {
    private int amtSpent;
    private int amtSpentAllTime;
    public static int MIN_AMT = 500;
    public static int BONUS = 50;
    public EmployeeCustomer(String name, String lastname, String phonenumber) {
        super(name, lastname, phonenumber);
        
    }

    public int getAmtSpent() {
        return amtSpent;
    }
    public float calculateBonus () {
        return amtSpent / MIN_AMT * BONUS;
    }
    
    public void updateBonus (Table t) {
        float amt = t.getNetAmount ();
        amtSpent += amt;
        amtSpentAllTime += amt; 
    }
    
    public boolean reedem () {
        if (this.amtSpent >= MIN_AMT) {
           this.amtSpent-= MIN_AMT;
           return true;
       } else {
           return false;
        }
    }
    public float getBonus () {
        return this.BONUS;
    }
    
    public String getBonusDescription () {
        return "Amount Spent: $" + this.amtSpent + "\nBonus: $" + this.BONUS;
    }
    
    @Override
    public String  printType () {
        return "Employee";
    }
    public void updateSummary (Summary s) {
        s.employeeCustomer += amtSpentAllTime / MIN_AMT * BONUS;
    }
}

