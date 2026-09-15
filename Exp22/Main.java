package Exp22;

import java.sql.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Staff ID: ");
        String staffId = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        String query = "SELECT role FROM hospital_staff WHERE staff_id = ? AND password = ?";

        try (Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/hospital_db",
                "root",
                "devansh@2007");
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setString(1, staffId);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String role = rs.getString("role");
                System.out.println("Login Successful!");
                System.out.println("Access Granted: Welcome, " + role + " " + staffId);
            } else {
                System.out.println("Login Failed: Invalid Staff ID or Password.");
            }

        } catch (Exception e) {
            System.out.println("Database Error: " + e.getMessage());
        }

        sc.close();
    }
}