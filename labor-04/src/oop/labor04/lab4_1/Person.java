package oop.labor04.lab4_1;

public class Person {
    private String firstName;
    private String lastName;
    private int birtYear;

    public Person(String firstName, String lastName, int birtYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birtYear = birtYear;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getBirtYear() {
        return birtYear;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birtYear=" + birtYear +
                '}';
    }
}


