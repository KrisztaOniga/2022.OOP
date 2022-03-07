package oop.labor03.lab3_1;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("John", "BLACK");

        System.out.println(customer1.toString());
        //System.out.println(customer1); // RECOMMENDED APPROACH!!

        customer1.setAccount(new BankAccount("OTP00001"));
        System.out.println(customer1.toString());

        customer1.getAccount().deposit(1000);
        System.out.println(customer1);

        //customer1.closeAccount();
        System.out.println(customer1);

        Customer customer2 = new Customer("Mary", "WHITE");
        customer2.setAccount(new BankAccount("OTP00002"));
        System.out.println(customer2);
        customer2.getAccount().deposit(1500);
        customer2.getAccount().withdraw(1000);
        System.out.println(customer2);
        //customer2.closeAccount();
        System.out.println(customer2);

        customer2.setLastName(customer1.getLastName());
        System.out.println(customer2);
    }
}
