package Exp4;

public class Main {
    public static void main (String[] args) {
        System.out.println("Wrapped and Unwrapped variables : \n");

        int x = 10;
        Integer WrappedX = Integer.valueOf(x);
        int unwrappedX = WrappedX.intValue();
        System.out.println("Wrapped Int : " + WrappedX);
        System.out.println("Unwrapped Int : " + unwrappedX + "\n");

        char ch = 'A';
        Character ch_wrapped = Character.valueOf(ch);
        char ch_unwrapped = ch_wrapped.charValue();

        System.out.println("Wrapped Char : " + ch_wrapped);
        System.out.println("Unwrapped Char : " + ch_unwrapped);
    }
}
