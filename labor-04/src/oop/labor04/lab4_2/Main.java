package oop.labor04.lab4_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File("lab4_2_input.txt"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(",");
                if(items[0].equals("Customer")){
                    customers.add(new Customer(items[1].trim(), items[2].trim()));
                }
                else{
                    String accountNumber = items[1].trim();
                    double amount = Double.parseDouble(items[2].trim());
                    BankAccount account = new BankAccount(accountNumber);
                    account.deposit(amount);
                    //Customer customer = customers.get(customers.size()-1);
                    customers.get(customers.size() - 1).addAccount(account);
                }
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < customers.size(); i++) {
            System.out.println(customers.get(i));
        }
    }
}
