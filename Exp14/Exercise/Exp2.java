// Create an Online Shopping program that handles an invalid product quantity entered by the user using a try-catch block.
// Display an appropriate error message if the quantity is less than or equal to zero.

import java.util.Scanner;

public class Exp2 {
    public static void main (String[] args) {
        int products = 10;

        try (Scanner in = new Scanner(System.in)) {
            try {
                System.out.print("Enter number of products to but : ");
                int am = in.nextInt();

                if (am < 0) {
                    throw new Exception("Invalid Product Amount.");
                }

                if (am == 0) {
                    throw new Exception("Please enter amount more than 0.");
                }

                if (am > products) {
                    throw new Exception("Not enough products in stock to buy.");
                }

                System.out.println("Purchased!");
                products -= am;
                System.out.println("Remaining Products : " + products);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
