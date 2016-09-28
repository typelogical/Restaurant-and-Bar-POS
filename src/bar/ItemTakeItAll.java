/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bar;

public class ItemTakeItAll extends ItemWithDiscount {
    private int n;

    public ItemTakeItAll( String name, float price, float discount,int n) {
        super(name, price, discount);
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
}