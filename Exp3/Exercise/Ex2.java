package Exp3.Exercise;

import java.util.Scanner;

class RestaurantBilling {
    static int count = 0;

    // Takeaway
    int bill (double amount) {
        count++;
        return (int)(amount + 10);
    }

    // Dine-in
    int bill (double amount, double service) {
        count++;
        return (int)(amount + service / 100 * amount);
    }

    // Delivery
    int bill (double amount, double tax, double platform) {
        count++;
        return (int)(amount + platform / 100 * amount + tax / 100 * amount);
    }
}

public class Ex2 {
    public static void main (String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            RestaurantBilling bill = new RestaurantBilling();

            while (true) {
                System.out.println("------ Billing ------");

                System.out.println("Select Mode : ");
                System.out.println("(1) Takeaway");
                System.out.println("(2) Dine-in");
                System.out.println("(3) Delivery");
                System.out.println("(4) Exit");
                System.out.print("Enter choice : ");
                int choice = in.nextInt();

                if (choice == 4) {
                    System.out.println("\nExiting...");
                    break;
                }

                System.out.print("Enter the amount : Rs.");
                double am = in.nextDouble();

                if (choice == 1)
                    System.out.println("The total amount is = Rs." + bill.bill(am));
                else if (choice == 2)
                    System.out.println("The total amount is = Rs." + bill.bill(am, 10));
                else if (choice == 3)
                    System.out.println("The total amount is = Rs." + bill.bill(am, 2.5, 5));
                else
                    System.out.println("Wrong Choice!!!");

                System.out.println();
            }

            System.out.println();
            System.out.println("------ Total Orders ------");
            System.out.println("Total orders : " + RestaurantBilling.count);
            System.out.println();
        }
    } 
}
