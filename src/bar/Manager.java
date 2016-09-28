package bar;

import bar.User;

public class Manager extends User {

    private String internalPhoneNumber;
    private int PIN;

    public Manager( int id, String name, String lastname, String username, String password, String phonenumber,String internalPhoneNumber, int PIN) {
        super(id, name, lastname, username, password, phonenumber);
        this.internalPhoneNumber = internalPhoneNumber;
        this.PIN = PIN;
        super.manager = true;
    }

    public String getInternalPhoneNumber() {
        return internalPhoneNumber;
    }

    public int getPIN() {
        return PIN;
    }

    public void setInternalPhoneNumber(String internalPhoneNumber) {
        this.internalPhoneNumber = internalPhoneNumber;
    }

    public void setPIN(int PIN) {
        this.PIN = PIN;
    }
    
}
