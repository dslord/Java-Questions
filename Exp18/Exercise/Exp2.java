package Exp18.Exercise;

import javax.swing.*;

public class Exp2 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Bank Balance Calculator");

        JLabel balanceLabel = new JLabel("Initial Balance:");
        JLabel amountLabel = new JLabel("Transaction Amount:");

        JTextField balanceField = new JTextField();
        JTextField amountField = new JTextField();

        JButton deposit = new JButton("Deposit");
        JButton withdraw = new JButton("Withdraw");

        balanceLabel.setBounds(30, 40, 130, 30);
        balanceField.setBounds(160, 40, 180, 30);

        amountLabel.setBounds(30, 90, 130, 30);
        amountField.setBounds(160, 90, 180, 30);

        deposit.setBounds(70, 150, 100, 30);
        withdraw.setBounds(200, 150, 100, 30);

        frame.add(balanceLabel);
        frame.add(balanceField);
        frame.add(amountLabel);
        frame.add(amountField);
        frame.add(deposit);
        frame.add(withdraw);

        frame.setSize(400, 250);
        frame.setLayout(null);
        frame.setVisible(true);

        deposit.addActionListener(e -> {
            double balance = Double.parseDouble(balanceField.getText());
            double amount = Double.parseDouble(amountField.getText());

            balance = balance + amount;

            JOptionPane.showMessageDialog(
                frame,
                "Updated Balance: " + balance
            );
        });

        withdraw.addActionListener(e -> {
            double balance = Double.parseDouble(balanceField.getText());
            double amount = Double.parseDouble(amountField.getText());

            balance = balance - amount;

            JOptionPane.showMessageDialog(
                frame,
                "Updated Balance: " + balance
            );
        });
    }
}
