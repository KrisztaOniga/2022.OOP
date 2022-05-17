package oop.labor12.lab12_3;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Bac bac = new Bac();
        System.out.println("Passed students: " + bac.getNumPassed());
        System.out.println("Failed students: " + bac.getNotPassed());


        Collections.sort(bac.failed());
        System.out.println(bac.failed());

    }
}
