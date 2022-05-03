package oop.labor10.lab10_2;

import com.sun.source.tree.BreakTree;
import oop.labor10.lab10_1.MyDate;

import java.util.Comparator;
import java.util.Objects;

public class Employee{
    private final int ID;
    private final String firstName;
    private String LastName;
    private double salary;
    private final MyDate birthDate;
    private static int counter;

    public Employee(String firstName, String lastName, double salary, MyDate birthDate) {
        this.firstName = firstName;
        LastName = lastName;
        this.salary = salary;
        this.birthDate = birthDate;
        this.ID = ++counter;
    }

    public static Comparator<Employee> CompareByFullName = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            if (o1.getFirstName().equals(o2.getFirstName())) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
            return o1.getFirstName().compareTo(o2.getFirstName());
        }
    };

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return ID == employee.ID;
    }
    @Override
    public int hashCode() {
        return Objects.hash(ID);
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
