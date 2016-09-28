/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bar;

import java.io.Serializable;

public class User implements Serializable {
    static private int idCounter;
    private int id;
    private String name;
    private String lastname;
    private String username;
    private String password;
    private String phonenumber;
    protected boolean manager;
    /*
        This constructor is used to assign an exisiting id
    */
    public User(int id, String name, String lastname, String username, String password, String phonenumber) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.username = username;
        this.password = password;
        this.phonenumber = phonenumber;
        this.manager = false;
        this.idCounter++;
    }
    /*
        This constructor is used to create new customers
    */
    public User(String name, String lastname, String phonenumber) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.phonenumber = phonenumber;
        this.manager = false;
        this.idCounter++;
    }
    
    public boolean isManager () {
        return manager;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
    public String  printType () {
        return "null";
    }
    public String printInfo() {
       // return super.toString(); //To change body of generated methods, choose Tools | Templates.
        String info="ID:"+id+"\n";
        info+="Type: " + printType () + "\n";
        info+="Name:"+name+"\n";
        info+="sirName:"+lastname+"\n";
        info+="phone:"+phonenumber+"\n";
        return info;
    }
 
    
}

