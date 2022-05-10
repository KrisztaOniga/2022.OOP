package oop.labor10.lab10_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Storage {
    private ArrayList<Product> products = new ArrayList<>();

    public Storage(String filename) {
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String items[] = line.split(" ");
                products.add(new Product(Integer.parseInt(items[0]), items[1], Integer.parseInt(items[2]), Integer.parseInt(items[3])));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Collections.sort(products);
    }

    public void update(String filename) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int counter = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                continue;
            }
            String items[] = line.split(" ");
            int id = Integer.parseInt(items[0]);
            int amount = Integer.parseInt(items[1]);
            Product product = new Product(id, "", 0, 0);
            int result = Collections.binarySearch(products, product);
            if (result < 0) {
                continue;
            }
            products.get(result).updateAmount(amount);
            ++counter;
        }
        scanner.close();
        System.out.println(filename + ": " + counter + " updates");
    }
}
