package bar;

import bar.Summary;
import bar.Table;
import static bar.EmployeeCustomer.MIN_AMT;
import bar.User;


public class SimpleCustomer extends User implements Customer {

    public SimpleCustomer(String name, String lastname, String phonenumber) {
        super(name, lastname, phonenumber);
    }
    public float calculateBonus () {
        return (float) 0.0;
    }
    
    public void updateBonus (Table t) {
        return;
    }
    
    public boolean reedem () {
        return false;
    }
    
    public String getBonusDescription () {
        return "";
    }
    
    public float getBonus () {
        return 0;
    }
    
    @Override
    public String  printType () {
        return "Simple";
    }
    
    public void updateSummary (Summary s) {
       return;
    }
}
