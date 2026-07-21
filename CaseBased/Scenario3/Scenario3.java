// 3. Scenario:
// You are tasked with developing a simple Online Shopping Cart System in Java. The system should allow users to add products to a shopping cart,
// remove products, calculate the total cost of the cart, and display all products in the cart.

// Requirements:
// 1. Create a Product class with the following attributes:
//      name (String)
//      price (double)
// 2. Create a ShoppingCart class that manages a collection of products. The ShoppingCart class should have the following methods:
//      addProduct(Product product): Adds a product to the cart.
//      removeProduct(String productName): Removes a product from the cart by its name.
//      calculateTotalCost(): Calculates and returns the total cost of all products in the cart.
//      displayCart(): Displays all products in the cart along with their prices and the total cost.
// 3. Create a Main class to test the functionality of the ShoppingCart class.

// Question:
// Write the Java code to implement the above scenario. Your code should include the Product class, the ShoppingCart class, and the Main class.
// Ensure that the Main class demonstrates adding products, removing products, calculating the total cost, and displaying the cart.

package CaseBased.Scenario3;

import java.util.Scanner;
import java.util.ArrayList;

class Product {
    String name;
    double price;

    Product (String n, double p) {
        name = n;
        price = p;
    }
}

class ShoppingCart {
    ArrayList<Product> collection = new ArrayList<>();

    void addProduct (Product pro) {
        collection.add(pro);
    }

    void removeProduct (String name) {
        int found = 0;
        int index = 0;

        for (Product pro : collection) {
            if (pro.name.contains(name)) {
                System.out.println("\nFound the Product : ");
                System.out.println("Name   : " + pro.name);
                System.out.println("Price  : Rs." + pro.price);
                System.out.println("Removing this Product...\n");

                collection.remove(index);

                found = 1;
                break;
            }

            index++;
        }

        if (found == 0) {
            System.out.println("Product not found!\n");
        }
    }

    double calculateTotalCost () {
        double cost = 0;

        for (Product pro : collection) {
            cost += pro.price;    
        }

        return cost;
    }

    void displayCart () {
        if (collection.isEmpty()) {
            System.out.println("\nThe cart is empty! Add Products!");
        } else {
            System.out.println("\nAll Products added in the cart are : ");
            for (Product pro : collection) {
                System.out.println("Name   : " + pro.name);
                System.out.println("Price  : Rs." + pro.price + "\n");
            }
        }
    }

    void checkout () {
        collection.removeAll(collection);
    }
}

public class Scenario3 {
    public static void main (String[] args) {
        ShoppingCart sc = new ShoppingCart();

        try (Scanner in = new Scanner(System.in)) {
            while (true) {
                System.out.println("Following options : ");
                System.out.println("(1) Add Product");
                System.out.println("(2) Remove Product");
                System.out.println("(3) Display Cart");
                System.out.println("(4) Checkout");
                System.out.println("(5) Exit");
                System.out.print("Enter choice : ");
                int choice = in.nextInt();
                in.nextLine();

                if (choice == 5) {
                    System.out.println("\nExiting...\n");
                    break;
                }

                if (choice == 1) {
                    System.out.print("\nEnter Product name : ");
                    String name = in.nextLine();

                    System.out.print("Enter Product price : Rs.");
                    double price = in.nextDouble();
                    
                    Product p = new Product(name, price);
                    sc.addProduct(p);

                    System.out.println("Added Product in the cart!\n");
                } else if (choice == 2) {
                    System.out.print("\nEnter product name to remove : ");
                    String name = in.nextLine();

                    sc.removeProduct(name);
                } else if (choice == 3) {
                    sc.displayCart();

                    double cost = sc.calculateTotalCost();
                    System.out.println("Total cost : Rs." + cost + "\n");
                } else if (choice == 4) {
                    double cost = sc.calculateTotalCost();

                    if (cost == 0) {
                        System.out.println("Nothing to checkout!");
                    } else {
                        System.out.println("\nChecking out...");
                        System.out.println("Total Cart Cost : Rs." + cost);
                        
                        System.out.print("\nEnter amount to be paid : Rs.");
                        double amount = in.nextDouble();

                        if (amount != cost) {
                            System.out.println("Invalid Amount! Transaction Cancelled!\n");
                        } else {
                            System.out.println("Payment Done!! Ordered Successful!\n");
                            sc.checkout();
                        }
                    }
                } else {
                    System.out.println("\nWrong choice!!!\n");
                }
            }
        }
    }
}