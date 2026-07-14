package Exp5;

public class Main3 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Programming");

        System.out.println("Original String : " + sb);

        sb.append(" in Java");
        System.out.println("After Append    : " + sb);

        sb.insert(12, " Language");
        System.out.println("After Insert    : " + sb);

        sb.replace(0, 11, "Coding");
        System.out.println("After Replace   : " + sb);

        sb.delete(6, 15);
        System.out.println("After Delete    : " + sb);

        sb.reverse();
        System.out.println("After Reverse   : " + sb);
    }
}