package Exp17.Exercise;

import javax.swing.*;

public class Exp2 {
    public static void main (String[] args) {
        JFrame frame = new JFrame("Employee Registration Form");

        JLabel idLabel = new JLabel("Employee ID:");
        JLabel nameLabel = new JLabel("Name:");
        JLabel deptLabel = new JLabel("Department:");
        JLabel salaryLabel = new JLabel("Salary:");

        JTextField idField = new JTextField();
        JTextField nameField = new JTextField();
        JTextField deptField = new JTextField();
        JTextField salaryField = new JTextField();

        JButton submitButton = new JButton("Submit");

        idLabel.setBounds(40, 40, 100, 30);
        idField.setBounds(150, 40, 200, 30);

        nameLabel.setBounds(40, 90, 100, 30);
        nameField.setBounds(150, 90, 200, 30);

        deptLabel.setBounds(40, 140, 100, 30);
        deptField.setBounds(150, 140, 200, 30);

        salaryLabel.setBounds(40, 190, 100, 30);
        salaryField.setBounds(150, 190, 200, 30);

        submitButton.setBounds(150, 240, 100, 30);

        frame.add(idLabel);
        frame.add(idField);
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(deptLabel);
        frame.add(deptField);
        frame.add(salaryLabel);
        frame.add(salaryField);
        frame.add(submitButton);

        frame.setSize(420, 350);
        frame.setLayout(null);
        frame.setVisible(true);

        submitButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(
                frame,
                "Employee Details\n"
                + "Employee ID: " + idField.getText()
                + "\nName: " + nameField.getText()
                + "\nDepartment: " + deptField.getText()
                + "\nSalary: " + salaryField.getText()
            );
        });
    }   
}
