package oop.labor11.lab11_5;

public class Main {
    public static void main(String[] args) throws MatrixException {
        Matrix m1 = new Matrix(2, 3);
        m1.fillRandom(1, 2);
        System.out.println("m1: ");
        m1.printMatrix();
        System.out.println();
        Matrix m2 = new Matrix(2, 4);
        m2.fillRandom(1, 2);
        System.out.println("m2: ");
        m2.printMatrix();
        System.out.println("\nSum: m1 + m2");
        try {
            Matrix.add(m1, m2).printMatrix();
        }
        catch (MatrixException ex){
            System.out.println(ex.getMessage());
        }
        Matrix m3 = new Matrix(3, 4);
        m3.fillRandom(0, 1);
        System.out.println("m3: ");
        m3.printMatrix();
        System.out.println("\nProduct: m1 * m3");
        Matrix.multiply(m1, m3).printMatrix();
    }
}
