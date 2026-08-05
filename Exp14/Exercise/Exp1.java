import java.util.Scanner;

public class Exp1 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            double balance = 10000;

            try {
                System.out.print("Enter withdrawal amount: ");
                double amount = in.nextDouble();

                if (amount <= 0) {
                    throw new Exception("Invalid withdrawal amount!");
                }

                if (amount > balance) {
                    throw new Exception("Insufficient balance!");
                }

                balance -= amount;

                System.out.println("Withdrawal Successful.");
                System.out.println("Remaining Balance: Rs." + balance);

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}