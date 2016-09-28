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

interface IValidator {
    public boolean isValidId (String id);
    
    public boolean isValidPrice (String price);
    
    public boolean isValidName (String name);
}

public class Validator {
    public Validator () {
        
    }
    
    public boolean isValidId (String id) {
        try {
            int x = Integer.parseInt(id);
            if (x < 0) {
                throw new Exception ();
            } 
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
    public boolean isValidPrice (String price) {
        try {
            float x = Float.parseFloat(price);
            if (x < 0) {
                throw new Exception ();
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
    public boolean isValidName (String name) {
        if (name == "") 
            return false;    
        return true;
    }
    
    public boolean isValidPhoneNum (String phoneNum) {
        if (phoneNum.equals ("")) 
            return false;
        else return true;
    }
    
    public boolean isValidQuantity (String quantity) {
        try {
            int x = Integer.parseInt (quantity);
            return x > 0;
        } catch (Exception e) {
            return false;
        }
    }
}
