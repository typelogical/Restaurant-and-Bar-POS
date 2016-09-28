/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bar;

/**
 *
 * @author
 */
/**
 * 
 * This class holds summary information that can be used by different classes
 * to polymorphically construct a summary report.
 */
public class Summary {
    public Summary () {
        regularTable = loyalTable = companyTable = employeeTable =
        regularCustomer = loyalCustomer = companyCustomer = employeeCustomer = 0;
        regularItem = discountItem = christmasItem = itemsInOffer = 0;
    }
    @Override
    public String toString () {
        StringBuffer str = new StringBuffer ();
        str.append ("Amounts for Tables:\n");
        str.append ("\tRegular: $" + regularTable);
        str.append ("\n\tLoyal: $" + loyalTable);
        str.append ("\n\tComapny: $" + companyTable);
        str.append ("\n\tEmployee: $" + employeeTable);
        str.append ("\nBonuses for Customers");
        str.append ("\n\tSimple: " + regularCustomer);
        str.append ("\n\tLoyal: " + loyalCustomer);
        str.append ("\n\tCompany: " + companyCustomer);
        str.append ("\n\tEmployee: " + employeeCustomer);
        str.append ("\nNumber of each Item:");
        str.append ("\n\tRegular: " + regularItem);
        str.append ("\n\tDiscount: " + discountItem);
        str.append ("\n\tChristmas Discount: " + christmasItem);
        str.append ("\n\tBuy N get N Special: " + itemsInOffer);
        return str.toString();
    }
    /**
       This updates the summary 
       each class will have update different parts.
    */
    public void update () {
        return;
    }
    /**
     * Total amounts for each of the kinds of tables;
     */
    public float regularTable, loyalTable, companyTable, employeeTable;
    
    /**
     * Total bonus for each of the kinds of customers;
     */
    public float regularCustomer, loyalCustomer, companyCustomer, employeeCustomer;
    
    
    /**
     * Total quantity for each of the kinds of tables;
     */
    public int regularItem, discountItem, christmasItem, itemsInOffer;
}
