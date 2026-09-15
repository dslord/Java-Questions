package Exp21.Exercise;

import java.sql.*;

public class Exp1 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/college",
                "root",
                "devansh@2007"
            );

            if (con != null) {
                System.out.println("Database connection successful.");
            }

            con.close();
        }
        catch (Exception e) {
            System.out.println("Database connection failed.");
        }
    }
}
