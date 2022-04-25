package oop.labor10.lab10_2;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("Nev");
        company.hireAll("employees.csv");
        company.printAll(System.out);
    }
}
