package oop.labor11.lab11_2;

public class Student {

    private final String neptunKod;
    private final String keresztNev;
    private final String csaladNev;
    private int kreditek;
    private final MyDate birthDate;

    public Student(String neptunKod, String keresztNev, String csaladNev, int kreditek, int year, int month, int day) throws InvalidDateException {
        this.kreditek = kreditek;
        this.neptunKod = neptunKod;
        this.keresztNev = keresztNev;
        this.csaladNev = csaladNev;
        this.birthDate = new MyDate(year, month, day);
    }


    @Override
    public String toString() {
        return "Student{" +
                "neptunKod='" + neptunKod + '\'' +
                ", keresztNev='" + keresztNev + '\'' +
                ", csaladNev='" + csaladNev + '\'' +
                ", kreditek=" + kreditek +
                ", birthDate=" + birthDate +
                '}';
    }
}
