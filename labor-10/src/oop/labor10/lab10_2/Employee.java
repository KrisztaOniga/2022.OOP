package oop.labor10.lab10_2;

import oop.labor10.lab10_1.MyDate;

public class Employee {
    private final int ID;
    private String firstName;
    private String LastName;
    private double salary;
    private MyDate birthDate;
    private static int counter;

    public Employee(String firstName, String lastName, double salary, MyDate birthDate) {
        this.firstName = firstName;
        LastName = lastName;
        this.salary = salary;
        this.birthDate = birthDate;
        this.ID = ++counter;
    }

    public int getID() {
        return ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public double getSalary() {
        return salary;
    }

    public MyDate getBirthDate() {
        return birthDate;
    }

    public static int getCounter() {
        return counter;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", salary=" + salary +
                ", birthDate=" + birthDate +
                '}';
    }
}
