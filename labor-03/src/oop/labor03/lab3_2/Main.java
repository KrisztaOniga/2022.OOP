package oop.labor03.lab3_2;

import oop.labor03.lab3_1.BankAccount;

import java.sql.SQLOutput;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        
        Random rand = new Random();
        Customer customer1 = new Customer("John", "BLACK");


        for (int i = 1; i <= 5; i++){
            customer1.addAccount(new BankAccount("OTP000" + i));
            customer1.getAccount("OTP000" + i).deposit(1 + rand.nextInt(1000));
        }

        System.out.println(customer1.toString());
        
        Customer customer2 = new Customer("Mary", "WHITE");
        for (int j = 1; j <= 9; j++){
            customer2.addAccount(new BankAccount("OTP0001" + j));
            customer2.getAccount("OTP0001" + j).deposit(1 + rand.nextInt(1000));
        }
        System.out.println(customer2.toString());

        //customer1.closeAccount("OTP0001");
        //customer2.closeAccount("OTP00019");
        System.out.println(customer1.getNumAccounts());
        System.out.println(customer2.getNumAccounts());



    }
}