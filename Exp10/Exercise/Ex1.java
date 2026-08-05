package Exp10.Exercise;

abstract class Payment {
    abstract void pay(double amount);
    void display() {
        System.out.println("Payment Method");
    }
}

class CreditCard extends Payment {
    void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using Credit Card.");
    }
}

class UPI extends Payment {
    void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using UPI.");
    }
}

public class Ex1 {
    public static void main(String[] args) {
        Payment p1 = new CreditCard();
        Payment p2 = new UPI();

        p1.display();
        p1.pay(2500);

        System.out.println();

        p2.display();
        p2.pay(1500);
    }
}
