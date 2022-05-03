package oop.labor10.lab10_3;

public class Main {
    public static void main(String[] args) {

        long startTime = System.nanoTime();
        Storage storage1 = new Storage("data10.txt","Raktar1");

        storage1.update("update10.txt");
        long endTime = System.nanoTime();

        long elapsed = endTime - startTime;
        //System.out.println("\nExecution time in seconds: " + elapsed/1000000);
    }
}
