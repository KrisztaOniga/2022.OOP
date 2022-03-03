package oop.labor02.date;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //MyDate date = new MyDate(2002,2,31);
        System.out.println(DateUtil.isValidDate(2000,2, 29) == true);
        System.out.println(DateUtil.isValidDate(2000,2, 30) == false);
        System.out.println(DateUtil.isValidDate(1900,2, 29) == false);
        System.out.println(DateUtil.isValidDate(1900,2, 28) == true);
        System.out.println(DateUtil.isValidDate(-1900,2, 28) == false);
        System.out.println(DateUtil.isValidDate(0,2, 28) == false);
        System.out.println(DateUtil.isValidDate(2021,2, 29) == false);
        System.out.println(DateUtil.isValidDate(2020,2, 29) == true);
        System.out.println(DateUtil.isValidDate(2020,1, 32) == false);
        System.out.println(DateUtil.isValidDate(2020,1, 0) == false);
        System.out.println(DateUtil.isValidDate(2020,0, 0) == false);
        System.out.println(DateUtil.isValidDate(2020,4, 31) == false);
        //System.out.println(date.toString());

        // use a random generator
        Random rand = new Random();

        MyDate[] dates = new MyDate[1000];

        for (int i = 0; i < dates.length; ++i) {
            int year = 0 + rand.nextInt(2022);
            int month = 0 + rand.nextInt(50);
            int day = 0 + rand.nextInt(40);
            dates[i] = new MyDate(year, month, day);
        }

        int counter = 0, counter2 = 0;
        for (int i = 0; i < dates.length; ++i) {
            if(DateUtil.isValidDate(dates[i].getYear(), dates[i].getMonth(), dates[i].getDay()) == true) {
                System.out.println(dates[i]);
                ++counter;
            }
            else{
                ++counter2;
            }
        }
        System.out.println("ValidDates: " + counter);
        System.out.println("InvalidDates: " + counter2);
    }
}
