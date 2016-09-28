/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bar;

import bar.Payable;
import bar.User;

public class Waiter extends User implements Payable {
    public static float OT_BONUS = 5;
    private String internalPhoneNumber;
    private float wagePerHour;
    private int hoursOfWork;
    private int hoursOfWorkUntilOT;
    public Waiter( int id, String name, String lastname, String username, String password, String phonenumber,String internalPhoneNumber) {
        super(id, name, lastname, username, password, phonenumber);
        this.internalPhoneNumber = internalPhoneNumber;
        super.manager = false;
        this.hoursOfWorkUntilOT = 10; 
    }

    public String getInternalPhoneNumber() {
        return internalPhoneNumber;
    }

    public void setInternalPhoneNumber(String internalPhoneNumber) {
        this.internalPhoneNumber = internalPhoneNumber;
    }
    
    public float getWage () {
        return wagePerHour;
    }
    
    public int getHoursWorked () {
        return hoursOfWork;
    }
    
    public void setWage (float wagePerHour) {
        this.wagePerHour = wagePerHour;
    }
    
    public void setHoursWorked (int hoursOfWork) {
        this.hoursOfWork = hoursOfWork;
    }
    
    public float calculateSalary () {
        return wagePerHour * hoursOfWork;
    }
    
    public float calculateBonus () {
            int overTime  = hoursOfWork - hoursOfWorkUntilOT;
            return  overTime > 0 ? overTime * this.OT_BONUS : 0;
    }
    @Override
    public String calculatePayment () {
       StringBuffer str = new StringBuffer ();
       float salary = this.calculateSalary ();
       float bonus = this.calculateBonus ();

       str.append ("Salary: $" + salary + "\nOvertime Bonus: $" + bonus + "\nTotal: " + salary + bonus);
       return str.toString ();
    }
}