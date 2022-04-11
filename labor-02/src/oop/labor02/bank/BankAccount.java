package oop.labor02.bank;

public class BankAccount {

    private double balance;
    private String accountNumber;

    //Constructor
    public BankAccount(String accountNumber){
        //Robi resze
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    //getters
    public double getBalance(){
        return this.balance;
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }

    public void deposit(double amount) {
        if(amount>0)
        {
            balance += amount;
        }

    }

    public boolean withdraw(double amount){
        if(amount <= balance){
            balance-=amount;
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        String Account = this.accountNumber;
        Account += "account number, yout balance is: ";
        Account += this.balance;
        Account += " EUR ";
        return Account;
    }
}
