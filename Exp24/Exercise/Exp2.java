package Exp24.Exercise;

import javax.swing.*;
import java.sql.*;

public class Exp2 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Library");
        JTextField book = new JTextField();
        JButton add = new JButton("Add");

        book.setBounds(50, 40, 200, 30);
        add.setBounds(100, 90, 80, 30);

        f.add(book);
        f.add(add);

        add.addActionListener(e -> {
            try {
                Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/hospital_db",
                    "root", "devansh@2007");

                PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO books(name) VALUES(?)");
                ps.setString(1, book.getText());
                ps.executeUpdate();

                JOptionPane.showMessageDialog(f, "Book Added");
                con.close();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(f, "Error");
            }
        });

        f.setSize(300, 180);
        f.setLayout(null);
        f.setVisible(true);
    }
}