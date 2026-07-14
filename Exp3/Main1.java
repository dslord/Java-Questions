package Exp3;

import java.util.*;

class Calculator {
    static double add (double a, double b) {
        return a + b;
    }

    static double add (double a, double b, double c) {
        return a + b + c;
    }
}

public class Main1 {
    public static void main (String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter first number : ");
            int a = in.nextInt();

            System.out.print("Enter second number : ");
            int b = in.nextInt();

            System.out.print("Enter third number : ");
            int c = in.nextInt();

            System.out.println("\nSum of two : " + Calculator.add(a, b));
            System.out.println("Sum of three : " + Calculator.add(a, b, c));
        }
    }
}