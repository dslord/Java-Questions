// Method Overloading
// Payment Processing System
// A company is building a payment gateway that allows users to pay using different methods:
// Credit Card (card number & CVV)
// Bank Transfer (account number & IFSC code)
// UPI (UPI ID)
package Exp3.Exercise;

import java.util.Scanner;

class Payment {
    void pay(String card, String cvv) {
        System.out.println("Paid using credit card.");
    }

    void pay(long number, String ifsc) {
        System.out.println("Paid using Bank Transfer.");
    }

    void pay(String upi) {
        System.out.println("Paid using UPI ID.");
    }
}

public class Ex4 {
    public static void main (String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            Payment paym = new Payment();

            while (true) {
                System.out.println("------ Payment ------");

                System.out.println("Select Mode : ");
                System.out.println("(1) Credit Card");
                System.out.println("(2) Bank Transfer");
                System.out.println("(3) UPI ID");
                System.out.println("(4) Exit");
                System.out.print("Enter choice : ");
                int choice = in.nextInt();

                if (choice == 4) {
                    System.out.println("\nExiting...");
                    break;
                }

                if (choice == 1)
                    paym.pay("card number", "cvv");
                else if (choice == 2)
                    paym.pay(1234565432, "cvv");
                else if (choice == 3)
                    paym.pay("upi id");
                else
                    System.out.println("Wrong Choice!!!");

                System.out.println();
            }
        }
    }
}
