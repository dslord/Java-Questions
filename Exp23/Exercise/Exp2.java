package Exp23.Exercise;

import java.sql.*;

public class Exp2 {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/hospital_db",
                "root",
                "devansh@2007"
            );

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM employee");

            while (rs.next()) {
                System.out.println(
                    "ID: " + rs.getInt("emp_id") +
                    ", Name: " + rs.getString("name") +
                    ", Department: " + rs.getString("department") +
                    ", Salary: " + rs.getDouble("salary")
                );
            }

            con.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}