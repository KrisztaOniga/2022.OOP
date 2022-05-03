package oop.labor10.lab10_2;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("Microsoft");
        company.hireAll("employees.csv");
        company.printAll(System.out);

        System.out.println();
        company.sortByComparator(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.getFirstName().equals(o2.getFirstName())) {
                    return o1.getLastName().compareTo(o2.getLastName());
                }
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        });
        System.out.println("\n\nSorting alphabetically");
        company.printAll(System.out);

        company.sortByComparator(Comparator.comparing(Employee::getBirthDate));

        System.out.println("\n\nSorting by birth date");
        company.printAll(System.out);

        //company.sortByComparator(Comparator.comparing(Employee.CompareByFullName));

        company.sortByComparator(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return -Double.compare(o1.getSalary(), o2.getSalary());
            }
        });
        System.out.println("\n\nSorted by decreasing salary");
        company.printAll(System.out);

    }
}
