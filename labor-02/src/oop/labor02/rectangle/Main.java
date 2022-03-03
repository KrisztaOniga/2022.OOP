package oop.labor02.rectangle;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
    /*public static void main(String[] args) {

        Rectangle r1 = new Rectangle(1, 3);
        System.out.println(r1);

        // Test setters and getters
        System.out.println("length is: " + r1.getLength());
        System.out.println("width is: " + r1.getWidth());

        // Test getArea() and getPerimeter()
        System.out.printf("area is: %.2f\n", r1.area());
        System.out.printf("perimeter is: %.2f\n", r1.perimeter());
    }
    */

        //10 elemu ractangle tipusu tomb inicialiazalasa
        Rectangle[] rectangles = new Rectangle[10];

        // use a random generator
        Random rand = new Random();

        for (int i = 0; i < rectangles.length; ++i) {
            //generate positive random numbers less than a bound
            double length = 1 + rand.nextInt(10);
            double width = 1 + rand.nextInt(10);
            rectangles[i] = new Rectangle(length, width);
        }

        for (int i = 0; i < rectangles.length; ++i) {
            System.out.println(rectangles[i]);  // toString()
            System.out.println("length is: " + rectangles[i].getLength());
            System.out.println("width is: " + rectangles[i].getWidth());

            // Test getArea() and getPerimeter()
            System.out.printf("area is: %.2f\n", rectangles[i].area());
            System.out.printf("perimeter is: %.2f\n", rectangles[i].perimeter());
        }
        double totalArea = 0;
        for (int i = 0; i < rectangles.length; ++i) {
            totalArea += rectangles[i].area();
        }
        System.out.printf("\nTotal area of the generated rectangles: %.2f\n", totalArea);
    }
}
