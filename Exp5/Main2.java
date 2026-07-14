package Exp5;

import java.util.Vector;

public class Main2 {
    public static void main (String[] args) {
        Vector<Integer> arr = new Vector<>();
        
        arr.add(10);
        arr.add(20);
        arr.add(30);

        System.out.println("Vector : " + arr);
        arr.remove(0);
        System.out.println("New Vector : " + arr);
        System.out.println("Size : " + arr.size());
        System.out.println("Element : " + arr.get(0));
    }
}
