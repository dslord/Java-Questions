package Exp23.Exercise;

import java.sql.*;

public class Exp1 {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/hospital_db",
                "root",
                "devansh@2007"
            );

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM hospital_staff");

            while (rs.next()) {
                System.out.println(
                    "Staff ID: " + rs.getString("staff_id") +
                    ", Role: " + rs.getString("role")
                );
            }

            con.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
