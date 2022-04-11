package oop.labor08.lab8_1.utils;

import oop.labor08.lab8_1.bank.Bank;
import oop.labor08.lab8_1.models.BankAccount;
import oop.labor08.lab8_1.models.CheckingAccount;
import oop.labor08.lab8_1.customer.Customer;
import oop.labor08.lab8_1.models.SavingsAccount;

import java.nio.channels.IllegalChannelGroupException;

public class Main {
    public static void main(String[] args) {

        /*CheckingAccount account01 = new CheckingAccount(1800);
        BankAccount account02 = new CheckingAccount(1800);
        //peldanya-e?
        if(account02 instanceof CheckingAccount){
            ((CheckingAccount)account02).setOverdraftLimit(0.03);
        }
         */
        Bank bank = new Bank("OTP");
        bank.addCustomer(new Customer("Kriszta", "ONIGA"));
        bank.addCustomer(new Customer("John", "BLACK"));

        bank.getCustomer(1).addAccount(new SavingsAccount(0.20));
        bank.getCustomer(1).addAccount(new CheckingAccount(1005));
        bank.getCustomer(2).addAccount(new SavingsAccount(0.10));
        bank.getCustomer(2).addAccount(new CheckingAccount(1000));

        bank.getCustomer(1).getAccount(bank.getCustomer(1).getAccountNumbers().get(0)).deposit(2000);
        bank.getCustomer(1).getAccount(bank.getCustomer(1).getAccountNumbers().get(1)).deposit(5000);
        bank.getCustomer(2).getAccount(bank.getCustomer(2).getAccountNumbers().get(0)).deposit(1000);
        bank.getCustomer(2).getAccount(bank.getCustomer(2).getAccountNumbers().get(1)).deposit(2000);


        System.out.println("\nElso kiiratas utan ");
        System.out.println(bank.getCustomer(1));
        System.out.println(bank.getCustomer(2));

        ((SavingsAccount)bank.getCustomer(1).getAccount(bank.getCustomer(1).getAccountNumbers().get(0))).addInterest();
        ((SavingsAccount)bank.getCustomer(2).getAccount(bank.getCustomer(2).getAccountNumbers().get(0))).addInterest();

        System.out.println("\nMasodik kiiratas utan");
        System.out.println(bank.getCustomer(1));
        System.out.println(bank.getCustomer(2));

        System.out.println("\nHarmadik kiiratas utan");
        bank.getCustomer(1).getAccount(bank.getCustomer(1).getAccountNumbers().get(0)).withdraw(300);
        bank.getCustomer(1).getAccount(bank.getCustomer(1).getAccountNumbers().get(1)).withdraw(3000);
        bank.getCustomer(2).getAccount(bank.getCustomer(2).getAccountNumbers().get(0)).withdraw(600);
        bank.getCustomer(2).getAccount(bank.getCustomer(2).getAccountNumbers().get(1)).withdraw(2005);

        System.out.println(bank.getCustomer(1));
        System.out.println(bank.getCustomer(2));

    }
}
