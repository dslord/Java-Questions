package Exp20.Exercise;

import java.sql.*;

public class Exp2 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/college2",
                "root",
                "devansh@2007"
            );

            Statement stmt = con.createStatement();

            // CREATE - Insert student
            stmt.executeUpdate(
                "INSERT INTO student VALUES (101, 'Amit', 'Java', 85)"
            );
            System.out.println("Student inserted successfully.");

            // UPDATE - Update marks
            stmt.executeUpdate(
                "UPDATE student SET marks = 90 WHERE roll_no = 101"
            );
            System.out.println("Student updated successfully.");

            // READ - Display students
            ResultSet rs = stmt.executeQuery(
                "SELECT * FROM student"
            );

            System.out.println("\nStudent Records:");

            while (rs.next()) {
                System.out.println(
                    "Roll No: " + rs.getInt("roll_no") +
                    ", Name: " + rs.getString("name") +
                    ", Course: " + rs.getString("course") +
                    ", Marks: " + rs.getInt("marks")
                );
            }

            // DELETE - Delete student
            stmt.executeUpdate(
                "DELETE FROM student WHERE roll_no = 101"
            );
            System.out.println("Student deleted successfully.");

            con.close();
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
