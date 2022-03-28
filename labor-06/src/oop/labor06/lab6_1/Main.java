package oop.labor06.lab6_1;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        /*ArrayList<BankAccount> accounts =  new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            accounts.add(new BankAccount());
        }
        for(BankAccount account:accounts)
            System.out.println(account);

        ArrayList<Customer> customers =  new ArrayList<>();
        customers.add(new Customer("Kriszta", "ONIGA"));
        customers.add(new Customer("Mary", "WHITE"));
        customers.add(new Customer("John", "BLACK"));

        customers.get(0).addAccount(accounts.get(0));
        customers.get(1).addAccount(accounts.get(2));
        customers.get(2).addAccount(accounts.get(4));
        customers.get(1).addAccount(accounts.get(5));

        for(Customer customer:customers)
            System.out.println(customer);

         */
        Random rand = new Random();

        Bank bank = new Bank("OTP");

        bank.addCustomer(new Customer("Kriszta", "ONIGA"));
        bank.addCustomer(new Customer("John", "BLACK"));

        bank.getCustomer(1).addAccount(new BankAccount());
        bank.getCustomer(1).addAccount(new BankAccount());
        bank.getCustomer(2).addAccount(new BankAccount());

        System.out.println(bank.getCustomer(1));

        bank.getCustomer(1).getAccount("OTP0000001").deposit(4000);
        bank.getCustomer(1).getAccount("OTP0000002").deposit(2000);
        //System.out.println(bank.getCustomer(1));

        System.out.println(bank.getCustomer(2));
        bank.printCustomersToFile("bank_customers.csv");

    }
}
