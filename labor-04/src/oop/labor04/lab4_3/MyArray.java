package oop.labor04.lab4_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MyArray {
    private int length;
    private  double[] elements;

    public MyArray(int length) {
        this.length = length;
        this.elements = new double[length];
    }

    public MyArray(double[] array) {
        this.length = array.length;
        this.elements = new double[length];
        for (int i = 0; i < array.length; i++) {
            this.elements[i] = array[i];
        }
    }

    public MyArray(MyArray array){
        this.length = array.length;
        this.elements= new double[this.length];
        for(int i = 0; i < array.length; i++){
            this.elements[i] = array.elements[i];
        }

    }

    public MyArray(String fileName){
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                this.length = Integer.parseInt(line);
                this.elements = new double[this.length];
                line = scanner.nextLine();
                String[] elements = line.split(" ");
                for(int i = 0; i < this.length; i++){
                    this.elements[i] = Integer.parseInt(elements[i]);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void fillRandom(double a, double b) {
        for(int i = 0; i < this.length; i++){
            Random rand = new Random();
            this.elements[i] = rand.nextDouble() * (b - a) + a;
        }
    }

    public double mean(){
        double s = 0;
        for(int i = 0; i < this.length; i++){
            s += elements[i];
        }
        return s / this.length;
    }

    public double stddev(){
        double mean = mean();
        double[] t = this.elements;
        double s = 0;
        for(int i = 0; i < this.length; i++){
            t[i] -= mean;
            t[i] *= t[i];
            s += t[i];
        }
        double Dev = Math.sqrt(s / this.length);
        return Dev;
    }

    public void sort(){
        Arrays.sort(this.elements);
    }

    public void print(String string){
        System.out.printf(string  + ":");
        for(double element:this.elements){
            System.out.printf("%15.1f ", element);
        }
        System.out.println();
    }
}

