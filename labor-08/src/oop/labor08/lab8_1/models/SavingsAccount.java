package oop.labor08.lab8_1.models;

import oop.labor08.lab8_1.models.BankAccount;

public class SavingsAccount extends BankAccount {
    private double interestRate;//kamat

    public SavingsAccount(double interestRate){
        //super hivas!!!!!
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void addInterest(){
        this.balance += balance * interestRate;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "balance=" + balance +
                ", accountNumber='" + accountNumber + '\'' +
                ", interestRate=" + interestRate +
                '}';
    }
}
