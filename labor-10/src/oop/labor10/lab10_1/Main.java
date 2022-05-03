package oop.labor10.lab10_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(2002,2,18);
        MyDate date2 = new MyDate(2002,2,15);
        System.out.println(date1.compareTo(date2));

        ArrayList<MyDate> dateList = new ArrayList<>();
        Random random = new Random();
        while(dateList.size()<10) {
            int year = 2022;
            int month = random.nextInt(12) + 1;
            int day = random.nextInt(31) + 1;
            if(DateUtil.isValidDate(year, month, day)){
                dateList.add(new MyDate(year, month, day));
            }
        }
        System.out.println("Dates: ");
        for(MyDate date :dateList){
            System.out.println(date);
        }

        System.out.println("Rendezve:");
        Collections.sort(dateList);
        for(MyDate date :dateList){
            System.out.println(date );
        }

        System.out.println("Csokkeno sorrendbe rendezve:");
        Collections.sort(dateList, new Comparator<MyDate>() {
            @Override
            public int compare(MyDate o1, MyDate o2) {
                if(o1.getYear() != o2.getYear()){
                    return o2.getYear() - o1.getYear();
                }
                if(o1.getMonth() != o2.getMonth()){
                    return o2.getMonth() - o1.getMonth();
                }
                if(o1.getDay() != o2.getDay()){
                    return o2.getDay() - o1.getDay();
                }
                return 0;
            }
        });

        for(MyDate date:dateList){
            System.out.println(date);
        }
    }
}
