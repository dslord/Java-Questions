package Exp17.Exercise;

import javax.swing.*;

public class Exp1 {
    public static void main (String[] args) {
        JFrame frame = new JFrame("Student Registration Form");

        JLabel nameLabel = new JLabel("Name:");
        JLabel rollLabel = new JLabel("Roll No:");
        JLabel courseLabel = new JLabel("Course:");

        JTextField nameField = new JTextField();
        JTextField rollField = new JTextField();
        JTextField courseField = new JTextField();

        JButton submitButton = new JButton("Submit");

        nameLabel.setBounds(50, 50, 100, 30);
        nameField.setBounds(150, 50, 200, 30);

        rollLabel.setBounds(50, 100, 100, 30);
        rollField.setBounds(150, 100, 200, 30);

        courseLabel.setBounds(50, 150, 100, 30);
        courseField.setBounds(150, 150, 200, 30);

        submitButton.setBounds(150, 210, 100, 30);

        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(rollLabel);
        frame.add(rollField);
        frame.add(courseLabel);
        frame.add(courseField);
        frame.add(submitButton);

        frame.setSize(420, 320);
        frame.setLayout(null);
        frame.setVisible(true);

        submitButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(
                frame,
                "Registration Successful!\nName: " + nameField.getText()
                + "\nRoll No: " + rollField.getText()
                + "\nCourse: " + courseField.getText()
            );
        });
    }
}
