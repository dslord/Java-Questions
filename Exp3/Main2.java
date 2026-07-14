package Exp3;

class BankAccount {
    void rate () {
        System.out.println("The roi is 4%");
    }
}

class SavingsAccount extends BankAccount {
    void rate () {
        System.out.println("The roi is 6%");
    }
}

class CurrentAccount extends BankAccount {
    void rate () {
        System.out.println("The roi is 8%");
    }
}

public class Main2 {
    public static void main (String[] args) {
        CurrentAccount ca = new CurrentAccount();
        ca.rate();
    }
}
