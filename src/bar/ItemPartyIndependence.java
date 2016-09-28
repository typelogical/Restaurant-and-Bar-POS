/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bar;

public class ItemPartyIndependence extends ItemWithDiscount{
    private float discountIndependence;

    public ItemPartyIndependence( String name, float price, float discount,float discountIndependence) {
        super(name, price, discount);
        this.discountIndependence = discountIndependence;
    }

    public float getDiscountIndependence() {
        return discountIndependence;
    }

    public void setDiscountIndependence(float discountIndependence) {
        this.discountIndependence = discountIndependence;
    }
    
    
}
