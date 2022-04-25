package oop.labor10.lab10_2;

import oop.labor10.lab10_1.MyDate;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Company {

    private String name;
    private ArrayList<Employee> employees = new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public void hire(Employee employee) {
//
//    }

    public ArrayList<Employee> hireAll(String fileName) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                continue;
            }
            String items[] = line.split(",");

            String firstName = items[0].trim();
            String lastName = items[1].trim();
            double salary = Double.parseDouble(items[2].trim());
            int year = Integer.parseInt(items[3].trim());
            int month = Integer.parseInt(items[4].trim());
            int day = Integer.parseInt(items[5].trim());

            employees.add(new Employee(firstName, lastName, salary, new MyDate(year, month, day)));
        }
        return employees;
    }

//    public void fire(int) {
//
//    }

    public void printAll(PrintStream ps) {
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

//    public void printManagers(PrintStream) {
//
//    }

//public void sortByComparator(Comparator<Employee> comparator){
//        Collections.sort(employees,comparator);
//        }
//
//
//        }
}
