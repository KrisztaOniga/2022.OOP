package oop.labor10.lab10_3;

public class Main {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        Storage storage = new Storage("data1000000.txt");
        storage.update("update1000000.txt");
        long endTime = System.nanoTime();

        // get the difference between the two nano time valuess
        long timeElapsed = endTime - startTime;

//        System.out.println("Execution time in nanoseconds: " + timeElapsed);
        System.out.println("Execution time in milliseconds: " + timeElapsed / 1000000);
    }
}
