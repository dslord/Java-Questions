package Exp15.Exercise;

import java.util.Scanner;

public class Exp1 {
    public static void main (String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            String correctPassword = "admin123";
            try {
                System.out.print("Enter Password : ");
                String password = in.nextLine();

                if (!password.equals(correctPassword)) {
                    throw new Exception("Invalid Password!");
                }

                System.out.println("Login Successful.");
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                System.out.println("Login process completed.");
            }
        }
    }
}
