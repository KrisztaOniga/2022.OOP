package oop.labor01;
public class Main {

    public static void main(String[] args) {
        System.out.println();
        String name = "ALMAFA";
        for (int i = 0; i < name.length(); i++) {
            int j = i;
            while (j >= 0) {
                System.out.print(name.charAt(i - j));
                j -= 1;
            }
            System.out.println();
        }
        String name2 = "Kerekes Bálint Ádám József";
        String[] splitted = name2.split(" ");
        for (int i = 0; i < splitted.length; i++) {
            System.out.print(splitted[i].charAt(0));
        }
        System.out.println();
        double x[] = {7, 1, -3, 45, 9};
        System.out.printf("MAX:%6.2f\n", maxElement(x));

        int y = 5, k = 1;
        System.out.printf("%d \n", getBit(y, k));

        System.out.printf("%d \n", countBits(y));

        System.out.println("CountBits 0-31");
        int number = 0;
        while (number <= 31) {
            System.out.printf("%d \n", countBits(number));
            ++number;
        }

        double a[] = {6, 2, 3, 1};
        System.out.println("Double array average:");
        System.out.printf("%6.2f\n" , mean(a));

        System.out.printf("Szoras: %6.2f\n" , stddev(a));
        System.out.println("The two largest elements of the given array are: " + max2(a));
    }

    public static double maxElement(double array[]) {
        double max = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < array.length; ++i) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int getBit(int number, int order) {
        int[] array = new int[20]; //lefoglal 20 elemnek egy tombot
        int i = 0;
        while (number > 0) {
            array[i] = number % 2;
            ++i;
            number /= 2;
        }
        return array[order];
    }

    public static int countBits(int number) {
        int count = 0;
        while (number > 0) {
            count += number & 1;
            number >>= 1;
        }
        return count;
    }

    public static double mean(double array[]) {
        double sum = 0;
        for (int i = 0; i < array.length; ++i) {
            sum += array[i];
        }
        if(sum != 0)
            return (double)sum / array.length;
        else
            return Double.NaN;
    }

    public static double stddev(double[] array) {
        double sum = 0, standardDeviation = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        if(sum == 0)
            return Double.NaN;

        double mean = sum/ array.length;

        for (int i = 0; i < array.length; i++) {
            standardDeviation += Math.pow(array[i] - mean, 2);
        }

        return Math.sqrt(standardDeviation/array.length);
    }

    public static double[] max2( double array[] ){
        double max[] ={Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY};
        if( array.length == 0 ){
            return max;
        }
        if(array.length == 1){
            for(int i = 0;i< 2;++i){
                max[i] = array[0];
            }
            return max;
        }

        double max1 = max[0], max2 = max[1];
        for(int i = 0; i < array.length; ++i){
            if(array[i] > max1){
                max1 = array[i];
            }
            if(array[i] > max2 && array[i] < max1){
                max2 = array[i];
            }
        }
        max[0] = max1;
        max[1] = max2;
        return max;
    }

}

