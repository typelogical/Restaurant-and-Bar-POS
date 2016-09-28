package bar;

import bar.Summary;
import bar.Table;
import bar.TableLoyal;
import static bar.EmployeeCustomer.MIN_AMT;
import bar.User;


public class LoyalCustomer extends User implements Customer {
    private int points;
    private int pointsAllTime;
    public static int MIN_REEDEMABLE = 100;
    public static int BONUS = 50;
    public LoyalCustomer(String name, String lastname, String phonenumber) {
        super(name, lastname, phonenumber);
    }

    public int getPoints() {
        return points;
    }
    
    public float calculateBonus () {
        return points / MIN_REEDEMABLE * BONUS;
    }
    
    public void updateBonus (Table t) {
        float pts = ((TableLoyal) t).calculateBonus ();
        points += pts;
        pointsAllTime += pts;
    }
    
    public boolean reedem () {
        if (points >= MIN_REEDEMABLE) {
            points -= MIN_REEDEMABLE;
            return true;
        } else {
            return false;
        }
    }
    public String getBonusDescription () {
        return "Points: " + this.points + "\nBonus: $" + this.BONUS; 
    }
    
    public float getBonus () {
        return this.BONUS;
    }
    @Override
    public String  printType () {
        return "Loyal";
    }
    
    public void updateSummary (Summary s) {
        s.loyalCustomer +=  pointsAllTime / MIN_REEDEMABLE * BONUS;
    }
    
}
