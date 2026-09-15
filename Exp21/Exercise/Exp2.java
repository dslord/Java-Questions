package Exp21.Exercise;

import java.sql.*;

public class Exp2 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/college",
                "root",
                "devansh@2007"
            );

            if (con != null) {
                System.out.println(
                    "Student database connected successfully."
                );
            }

            con.close();
        }
        catch (Exception e) {
            System.out.println("Student database connection failed.");
        }
    }
}