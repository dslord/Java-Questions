package Exp5.Exercise;

import java.util.ArrayList;

public class Ex2 {
    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList<>();

        courses.add("Java");
        courses.add("Python");
        courses.add("Data Structures");
        courses.add("Operating Systems");

        courses.remove("Python");

        StringBuffer sb = new StringBuffer();

        sb.append("Registered Courses\n");
        sb.append("------------------\n");

        for (int i = 0; i < courses.size(); i++) {
            sb.append((i + 1) + ". " + courses.get(i) + "\n");
        }

        System.out.println(sb);
    }
}
