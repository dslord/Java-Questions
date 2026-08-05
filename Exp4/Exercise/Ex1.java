package Exp4.Exercise;

public class Ex1 {
    public static void main (String[] args) {
        String marks1 = "99";
        String marks2 = "95";
        String marks3 = "97";

        Float marks_wrapped1 = Float.valueOf(marks1);
        Float marks_wrapped2 = Float.valueOf(marks2);
        Float marks_wrapped3 = Float.valueOf(marks3);
        
        float total_marks = marks_wrapped1 + marks_wrapped2 + marks_wrapped3;
        float percentage = total_marks / 3;

        System.out.println("Percentage  : " + percentage + " %");
        System.out.println("Total Marks : " + total_marks + " / 300");
    }
}
