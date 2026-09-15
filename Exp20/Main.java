package Exp20;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/college2",
                "root",
                "devansh@2007"
            );

            Statement stmt = con.createStatement();

            // INSERT
            stmt.executeUpdate(
                "INSERT INTO student VALUES (101, 'Rahul', 'Java', 85)"
            );
            System.out.println("Record inserted successfully.");

            // UPDATE
            stmt.executeUpdate(
                "UPDATE student SET marks = 90 WHERE roll_no = 101"
            );
            System.out.println("Record updated successfully.");

            // DELETE
            stmt.executeUpdate(
                "DELETE FROM student WHERE roll_no = 101"
            );
            System.out.println("Record deleted successfully.");

            con.close();
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
