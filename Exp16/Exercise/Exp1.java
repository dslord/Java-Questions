package Exp16.Exercise;

class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

public class Exp1 {
    public static void main(String[] args) {
        int age = 16;

        try {
            if (age < 18) {
                throw new InvalidAgeException("Age is below 18. Not eligible to vote.");
            }

            System.out.println("Eligible to vote.");
        }
        catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
