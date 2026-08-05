package Exp8.Exercise;

class Employee {
    void display() {
        System.out.println("This is employee class");
    }
}

class Manager extends Employee {
    void display() {
        super.display();
        System.out.println("This is manager class");
    }
}

public class Ex1 {
    public static void main (String[] args) {
        Manager m = new Manager();
        m.display();
    }
}
