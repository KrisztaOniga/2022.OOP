package oop.labor10.lab10_1;

public class MyDate implements Comparable<MyDate> {

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
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    @Override
    public int compareTo(MyDate o) {
        if(this.year != o.year){
            return this.year - o.year;
        }
        if(this.month != o.month){
            return this.month - o.month;
        }
        if(this.day != o.day){
            return this.day - o.day;
        }
        return 0;
    }
}
