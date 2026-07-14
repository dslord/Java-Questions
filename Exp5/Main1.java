package Exp5;

import java.util.ArrayList;

public class Main1 {
    public static void main (String[] args) {
        ArrayList<String> arr = new ArrayList<>();

        arr.add("Apple");
        arr.add("Banana");
        arr.add("Cherry");

        System.out.println("Fruits : " + arr);
        arr.remove("Banana");
        System.out.println("New Fruits : " + arr);
        System.out.println("Size : " + arr.size());
        System.out.println("Contains Apple? : " + arr.contains("Apple"));
    }    
}
