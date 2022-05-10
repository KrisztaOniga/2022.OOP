package oop.labor11.lab11_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adj meg szamokat szokozzel elvalasztva:");
        String line = scanner.nextLine();
        String[] numbers = line.split(" ");
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            try {
                sum += Double.parseDouble(numbers[i].trim());
            } catch (NumberFormatException ex) {
                System.out.println("Hibas input: " + numbers[i] + " nem szam!");
            }
        }

        System.out.println("Az osszeg: " + sum);
    }
}
