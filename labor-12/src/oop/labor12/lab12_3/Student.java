package oop.labor12.lab12_3;


public class Student {
    private int ID;
    private final String firstName;
    private final String lastName;
    private double matek;
    private double roman;
    private double magyar;
    private double average;

    public Student(int ID, String firstName, String lastName) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getID() {
        return ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getMatek() {
        return matek;
    }

    public double getRoman() {
        return roman;
    }

    public double getMagyar() {
        return magyar;
    }

    public double getAverage() {
        return average;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setMatek(double matek) {
        this.matek = matek;
    }

    public void setRoman(double roman) {
        this.roman = roman;
    }

    public void setMagyar(double magyar) {
        this.magyar = magyar;
    }

    public void computeAverage(){
        double average = 0;
        if(this.magyar >= 5 && this.roman >=5 && this.matek >= 5){
            average = (this.magyar + this.matek + this.roman) / 3;
        }
        if(average >= 6){
            this.average = average;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", matek=" + matek +
                ", roman=" + roman +
                ", magyar=" + magyar +
                ", average=" + average +
                '}';
    }
}
