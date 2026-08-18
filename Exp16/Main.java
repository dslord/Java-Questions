package Exp16;

class MyException extends Exception {
    MyException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            throw new MyException("Something went wrong");
        }
        catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}