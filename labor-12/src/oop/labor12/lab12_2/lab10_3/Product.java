package oop.labor12.lab12_2.lab10_3;

public class Product implements Comparable < Product>{
    private final int id;
    private String name;
    private int amount;
    private int price;

    public Product(int id, String name, int amount, int price) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public int getPrice() {
        return price;
    }

    public void updateAmount(int newAmount) {
        amount += newAmount;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name='" + name + '\'' + ", amount=" + amount + ", price=" + price + '}';
    }

    @Override
    public int compareTo(Product product) {
        return this.id - product.id;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id;
    }
}