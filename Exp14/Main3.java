package Exp14;

public class Main3 {
    public static void main (String[] args) {
        try {
            System.out.println("Outer try block started");

            try {
                System.out.println("Inner try block started");
                int result = 10 / 0;
                System.out.println(result);
            } catch (ArithmeticException e) {
                System.out.println("Error + " + e.getMessage());
            }

            int result = 10 / 0;
            System.out.println(result);
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException in outer try block : " + e.getMessage());
        } finally {
            System.out.println("Finally block of outer try executed");
        }

        System.out.println("Program continues after nested try-catch blocks");
    }
}
