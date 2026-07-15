// Create a Bank Account program where account number is final and cannot be changed.
package Exp9.Exercise;

class BankAccount {
    final int accountNumber = 123456;
    String accountHolder;
    double balance;

    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void display() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance        : " + balance);
    }
}

public class Ex1 {
    public static void main(String[] args) {
        BankAccount b = new BankAccount("Devansh", 50000);
        b.display();
    }
}