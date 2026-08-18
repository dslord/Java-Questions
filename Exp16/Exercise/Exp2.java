package Exp16.Exercise;

class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

public class Exp2 {
    public static void main(String[] args) {
        int age = 20;

        try {
            if (age < 18) {
                throw new InvalidAgeException("Age is below 18. Not eligible for driving license.");
            }

            System.out.println("Eligible for driving license.");
        }
        catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}