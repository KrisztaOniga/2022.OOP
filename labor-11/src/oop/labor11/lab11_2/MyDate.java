package oop.labor11.lab11_2;

import static oop.labor02.date.DateUtil.isValidDate;

public class MyDate {

    //adattagok
    private int year;
    private int month;
    private int day;

    //Constructor
    public MyDate(int year, int month, int day) throws InvalidDateException {
        if(isValidDate(year, month, day)) {
            this.year = year;
            this.month = month;
            this.day = day;
        }
        else{
            throw new InvalidDateException("INVALID DATE");
        }
    }
    //getterek
    public int getYear() {
        return this.year;
    }

    public int getMonth() {
        return this.month;
    }

    public int getDay() {
        return this.day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

}
