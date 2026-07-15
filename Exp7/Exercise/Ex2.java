// Develop an E-Commerce Product System where electronic, clothing, and grocery products inherit common properties and implement product interfaces.
package Exp7.Exercise;

interface Product {
    void displayCategory();
}

class ProductDetails {
    int id;
    String name;
    double price;

    ProductDetails(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Product ID    : " + id);
        System.out.println("Product Name  : " + name);
        System.out.println("Price         : " + price);
    }
}

class Electronic extends ProductDetails implements Product {
    Electronic(int id, String name, double price) {
        super(id, name, price);
    }

    public void displayCategory() {
        System.out.println("Category      : Electronic");
    }
}

class Clothing extends ProductDetails implements Product {
    Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    public void displayCategory() {
        System.out.println("Category      : Clothing");
    }
}

class Grocery extends ProductDetails implements Product {
    Grocery(int id, String name, double price) {
        super(id, name, price);
    }

    public void displayCategory() {
        System.out.println("Category      : Grocery");
    }
}

public class Ex2 {
    public static void main(String[] args) {
        Electronic e = new Electronic(101, "Laptop", 65000);
        Clothing c = new Clothing(102, "T-Shirt", 999);
        Grocery g = new Grocery(103, "Rice", 1200);

        e.displayDetails();
        e.displayCategory();

        System.out.println();

        c.displayDetails();
        c.displayCategory();

        System.out.println();

        g.displayDetails();
        g.displayCategory();
    }
}