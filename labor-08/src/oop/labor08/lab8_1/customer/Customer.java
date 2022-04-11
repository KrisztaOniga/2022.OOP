package oop.labor08.lab8_1.customer;

import oop.labor08.lab8_1.models.BankAccount;

import java.util.ArrayList;

public class Customer {

    private String firstName;
    private String lastName;

    private final int id;
    private static int numCustomers = 0;
    private ArrayList<BankAccount> accounts =  new ArrayList<>();

    private int numAccounts;

    //konstruktor
    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = ++numCustomers;//1,2,3-idikat adunk
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

    public ArrayList<String> getAccountNumbers(){
        ArrayList<String> accountNumbers= new ArrayList<>();
        for(BankAccount account:accounts){
            accountNumbers.add(account.getAccountNumber());
        }
        return accountNumbers;
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

    public int getId(){
        return id;
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
        return "ID:" + id + " "+ firstName + " " + lastName + " accounts: \n" + accounts + "  \n";
    }

}
