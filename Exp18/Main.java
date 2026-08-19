package Exp18;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Main {
    public static void main (String[] args) {
        JFrame frame = new JFrame("Button CLick Event");
        frame.setSize(350, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Click Me");
        button.setBounds(100, 50, 120, 40);

        JLabel label = new JLabel();
        label.setBounds(60, 110, 250, 30);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Button Clicked Successfully!");
            }
        });

        frame.add(button);
        frame.add(label);
        frame.setVisible(true);
    }
}