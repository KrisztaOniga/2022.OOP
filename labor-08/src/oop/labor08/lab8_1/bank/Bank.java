package oop.labor08.lab8_1.bank;

import oop.labor08.lab8_1.customer.Customer;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    public Customer getCustomer(int id) {
        for(Customer customer:customers){
            if(customer.getId() == id){
                return customer;
            }
        }
        return null;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public int numCustomers(){
        return customers.size();
    }

    private void printCustomers(PrintStream printStream){
        //itt van a konkret kiiratas
        printStream.println("ID, Firstname, Last name, Number of bank accounts");
        for( Customer customer: customers ){
            printStream.println( customer.getId()+", " + customer.getFirstName() +", "+
                    customer.getLastName()+", "+customer.getNumAccounts());
        }
        printStream.close();
    }

    public void printCustomersToStdout(){
        printCustomers(System.out);
    }

    public void printCustomersToFile(String fileName){
        try(PrintStream printStream = new PrintStream(fileName)){
            printCustomers(printStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
