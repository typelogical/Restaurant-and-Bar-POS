
package bar;

import java.io.Serializable;
import java.util.ArrayList;


public class bar implements Serializable {
    public ArrayList<Table> currentTables;
    public ArrayList<Table> servedTables;
    public ArrayList<User> employees;
    public ArrayList<Customer> customers;
    public bar() {
        //servedTables=new ArrayList<>();
        employees = new ArrayList<>();
        employees.add (new Manager(0,"m","m","m","m","987654321","987654321",1234));
        employees.add (new Waiter(1,"w1","w1","w1","w1","123456","123456"));
        employees.add (new Waiter(2,"w2","w2","w2","w2","123456","123456"));
        employees.add (new Waiter(3,"w3","w3","w3","w3","123456","123456"));
        employees.add (new Waiter(4,"w4","w4","w4","w4","123456","123456"));
        employees.add (new Waiter(5,"w5","w5","w5","w5","123456","123456"));
        
        customers = new ArrayList<>();
        currentTables = new ArrayList<>();
        servedTables = new ArrayList<>();
    }
}
