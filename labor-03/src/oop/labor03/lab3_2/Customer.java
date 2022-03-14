package oop.labor03.lab3_2;

import oop.labor03.lab3_1.BankAccount;

public class Customer {

    private String firstName;
    private String lastName;
    private BankAccount account;
    public static final int MAX_ACCOUNTS = 10;

    // number of accounts
    private int numAccounts;
    // an array for the accounts
    private BankAccount accounts[] = new BankAccount[ MAX_ACCOUNTS ];

    //konstruktor
    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void addAccount( BankAccount account) {
        if (numAccounts < MAX_ACCOUNTS) {
            this.accounts[this.numAccounts] = account;
            this.numAccounts++;
        }
    }

    /*public String getAccount(String accountNumber){
        for (int i = 0; i < numAccounts; ++i){
            if(accounts[i].getAccountNumber().equals(accountNumber))
                return accountNumber;
        }
        return null;
    }
    */

    public BankAccount getAccount(String accountNumber) {
        for (int i = 0; i < numAccounts; ++i) {
            if(accounts[i].getAccountNumber().equals(accountNumber))
                return this.accounts[i];
        }
        return null;
    }

    public int getNumAccounts( ){
        return numAccounts;
    }

    public void closeAccount(String accountNumber){
        for (int i = 0; i < numAccounts; ++i){
            if (accounts[i].getAccountNumber().equals(accountNumber)){
                accounts[i] = null;
                accounts[i] = accounts[numAccounts - 1];
                this.numAccounts--;
                return;
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
        StringBuffer result = new StringBuffer();
        result.append(firstName + ' ' + lastName + " accounts:\n");
        for(int i = 0; i < numAccounts; ++i){
            result.append( "\t" + accounts[i].toString() +"\n");
        }
        return result.toString();
    }
}
