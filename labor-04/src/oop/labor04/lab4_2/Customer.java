package oop.labor04.lab4_2;

import java.util.ArrayList;

public class Customer {

    private String firstName;
    private String lastName;
    private ArrayList<BankAccount> accounts =  new ArrayList<>();

    private int numAccounts;

    //konstruktor
    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void addAccount( BankAccount account) {
        if(account != null)
            accounts.add(account);
    }

    public BankAccount getAccount(String accountNumber) {
        for(BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    public int getNumAccounts(){
        return accounts.size();
    }

    public void closeAccount(String accountNumber){
        for (int i = 0; i < accounts.size(); i++) {
            if(this.accounts.get(i).getAccountNumber().equals(accountNumber)){
                accounts.remove(i);
                break;
            }
        }
        System.out.println("This AccountNumber does not exist!!!");
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


    @Override
    public String toString() {
        return firstName + " " + lastName + " accounts: \n"
                + "   BankAccount{ " + "accountNumber = " + accounts + " } \n";
    }

}
