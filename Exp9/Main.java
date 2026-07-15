package Exp9;

final class College {
    void collegeName() {
        System.out.println("College : Symbiosis Institute of Technology");
    }
}

class Person {
    final int id = 101;

    final void displayId() {
        System.out.println("ID : " + id);
    }
}

class Student extends Person {
    String name;

    Student(String name) {
        this.name = name;
    }

    void displayStudent() {
        System.out.println("Name : " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Devansh");

        s.displayStudent();
        s.displayId();

        College c = new College();
        c.collegeName();
    }
}
