package Exp24;

import javax.swing.*;
import java.sql.*;

public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame("Library Management");

        JTextField name = new JTextField();
        JButton add = new JButton("Add Book");

        name.setBounds(50, 50, 200, 30);
        add.setBounds(100, 100, 120, 30);

        f.add(name);
        f.add(add);

        add.addActionListener(e -> {
            try {
                Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/hospital_db",
                    "root", "devansh@2007");

                PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO books(name) VALUES(?)");

                ps.setString(1, name.getText());
                ps.executeUpdate();

                JOptionPane.showMessageDialog(f, "Book Added");
                con.close();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(f, ex.getMessage());
            }
        });

        f.setSize(320, 200);
        f.setLayout(null);
        f.setVisible(true);
    }
}