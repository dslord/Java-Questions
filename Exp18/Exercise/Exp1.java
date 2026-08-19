package Exp18.Exercise;

import javax.swing.*;

public class Exp1 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Calculator");

        JTextField num1 = new JTextField();
        JTextField num2 = new JTextField();

        JButton add = new JButton("Add");
        JButton subtract = new JButton("Subtract");

        num1.setBounds(50, 40, 200, 30);
        num2.setBounds(50, 80, 200, 30);

        add.setBounds(50, 130, 100, 30);
        subtract.setBounds(160, 130, 100, 30);

        frame.add(num1);
        frame.add(num2);
        frame.add(add);
        frame.add(subtract);

        frame.setSize(320, 220);
        frame.setLayout(null);
        frame.setVisible(true);

        add.addActionListener(e -> {
            int a = Integer.parseInt(num1.getText());
            int b = Integer.parseInt(num2.getText());
            JOptionPane.showMessageDialog(frame, "Result: " + (a + b));
        });

        subtract.addActionListener(e -> {
            int a = Integer.parseInt(num1.getText());
            int b = Integer.parseInt(num2.getText());
            JOptionPane.showMessageDialog(frame, "Result: " + (a - b));
        });
    }
}
