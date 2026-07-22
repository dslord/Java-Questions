// Create an ATM PIN Verification program that throws an exception for an
// invalid PIN entered by the user and uses a finally block to display a message indicating that the verification process has completed.
package Exp15.Exercise;

import java.util.Scanner;

public class Exp2 {
    public static void main (String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            try {
                String pass = "12345";
                
                System.out.print("Enter ATM PIN : ");
                String pin = in.next();
            
                if (!pin.equals(pass)) {
                    throw new Exception("Incorrect ATM PIN!");
                }

                System.out.println("Logging in...");
                System.out.println("ATM Check in Verified!!!");
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                System.out.println("ATM Verification Completed!");
            }
        }
    }
}
