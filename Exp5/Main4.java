package Exp5;

import java.util.StringTokenizer;

public class Main4 {
    public static void main(String[] args) {
        String data = "Java,C++,Python,JavaScript";

        StringTokenizer st = new StringTokenizer(data, ",");

        System.out.println("Tokens are : ");

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}