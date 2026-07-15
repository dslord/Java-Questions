// Create an abstract FoodOrder class with an abstract method calculate Bill().
// Implement two subclasses, DineInOrder and TakeAwayOrder, to calulate and display the total bill based on the order type.
package Exp10.Exercise;

abstract class FoodOrder {
    double amount;
    FoodOrder(double amount) {
        this.amount = amount;
    }

    abstract void calculateBill();
}

class DineInOrder extends FoodOrder {
    DineInOrder(double amount) {
        super(amount);
    }

    void calculateBill() {
        double total = amount + 100;
        System.out.println("Dine-In Bill : Rs." + total);
    }
}

class TakeAwayOrder extends FoodOrder {
    TakeAwayOrder(double amount) {
        super(amount);
    }

    void calculateBill() {
        double total = amount + 50;
        System.out.println("Take-Away Bill : Rs." + total);
    }
}

public class Ex2 {
    public static void main(String[] args) {
        FoodOrder order1 = new DineInOrder(1000);
        FoodOrder order2 = new TakeAwayOrder(1000);

        order1.calculateBill();
        order2.calculateBill();
    }
}