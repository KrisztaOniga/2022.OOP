package oop.labor02.date;

public class MyDate {

    //adattagok
    private int year;
    private int month;
    private int day;

    //Constructor
    public MyDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //getterek
    public int getYear(){
        return this.year;
    }

    public int getMonth(){
        return this.month;
    }

    public int getDay(){
        return this.day;
    }

    @Override
    public String toString(){
        String date = "Date: ";
        date += " the year is: ";
        date += this.year;
        date += " the month is: ";
        date += this.month;
        date += " the day is: ";
        date += this.day;
        return date;
    }
}
