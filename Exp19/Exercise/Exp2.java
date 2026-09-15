package Exp19.Exercise;

import java.sql.*;

public class Exp2 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/shop",
                "root",
                "devansh@2007"
            );

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery(
                "SELECT * FROM product"
            );

            System.out.println("Product Details:");

            while (rs.next()) {
                System.out.println(
                    "Product ID: " + rs.getInt("product_id") +
                    ", Name: " + rs.getString("product_name") +
                    ", Quantity: " + rs.getInt("quantity") +
                    ", Price: " + rs.getDouble("price")
                );
            }

            con.close();
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
