package oop.labor10.lab10_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Scanner;

public class Storage {

    private ArrayList<Product>products;
    private String name;

    public Storage(String fileName, String name){
        this.name = name;
        products = new ArrayList<>();
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found: " + fileName);
            System.exit(1);
        }
        while (scanner.hasNextLine()) {
            String temp[] = scanner.nextLine().split(" ");
            Product newProduct = new Product(Integer.parseInt(temp[0].trim()), temp[1], Integer.parseInt(temp[2].trim()), Integer.parseInt(temp[3].trim()));
            products.add(newProduct);
        }
        //rendezzuk a beolvasott termekeket
        products.sort(Product::compareTo);
    }


    public ArrayList<Product> getProducts() {
        return products;
    }

    public String getName() {
        return name;
    }


    private int searchProduct(int id) {
        if (products == null) {
            System.out.println("Product list is empty!!");
            return -1;
        }
        for (Product item : products) {
            if (item.getID() == id) {
                return products.indexOf(item);
            }
        }
        return -1;
    }


    public void update(String fileName){
        Scanner scanner = null;
        int updatedProducts = 0;
        try {
            scanner = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found: " + fileName);
            System.exit(1);
        }
        while (scanner.hasNextLine()) {
            String line[] = scanner.nextLine().split(" ");
            int idToSearch = Integer.parseInt(line[0].trim());
            int indexFound = searchProduct(idToSearch);
            if (indexFound >= 0) {
                products.get(indexFound).increaseAmount(Integer.parseInt(line[1].trim()));
                updatedProducts++;
                //itt ki lehet iratni a frissitett adatokat, de az ido hatekonysag miatt kivettem
//                System.out.println(line[0] + " product is succesfully updated! New amount: " + products.get(indexFound).getAmount());
            } else {
                //hasonloan az elozo if-hez, itt is kiirathato ha nem talahato a termek
//                System.out.println("This product can not be found: " + line[0]);
            }
        }
        System.out.printf("%d products were updated!", updatedProducts);
    }
}
