// Develop a Calculator program using overloaded methods for addition of integers and decimals. Use a static variable to count calculations.
package Exp3.Exercise;

import java.util.Scanner;

class Calculator {
    static int count = 0;

    int add (int a , int b) {
        count++;
        return a + b;
    }

    double add (double a, double b) {
        count++;
        return a + b;
    }
}

public class Ex1 {
    public static void main (String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter first integer : ");
            int a = in.nextInt();

            System.out.print("Enter second integer : ");
            int b = in.nextInt();

            System.out.print("Enter first decimal number : ");
            double _a = in.nextDouble();
        
            System.out.print("Enter second decimal number : ");
            double _b = in.nextDouble();

            Calculator addition = new Calculator();
            System.out.println("\nMethod One : Sum = " + addition.add(a, b));
            System.out.println("Method two : Sum = " + addition.add(_a, _b));
            System.out.println("Number of operations : " + Calculator.count);
        }
    }
}
