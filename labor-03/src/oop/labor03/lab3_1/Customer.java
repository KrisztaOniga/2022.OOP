package oop.labor03.lab3_1;

import javax.swing.plaf.SpinnerUI;
import java.security.PublicKey;

public class Customer {

    private String firstName;
    private String lastName;
    private BankAccount account;

    //konstruktor
    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setAccount(BankAccount account){
        this.account = account;
    }

    public BankAccount getAccount(){
        return this.account;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void closeAccount(){
        this.account = null;
    }

    @Override
    public String toString(){
        String Customer = "The customer is: ";
        Customer += this.firstName + " " + this.lastName;

        if(this.account != null) {
            Customer += " " + this.account;
        }
        return Customer;
    }
}
