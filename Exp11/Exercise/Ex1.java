package Exp11.Exercise;

interface Printable {
    void print();
}

class Student implements Printable {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public void print() {
        System.out.println("Student Name : " + name);
        System.out.println("Roll No      : " + rollNo);
    }
}

class Employee implements Printable {
    String name;
    int empId;

    Employee(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }

    public void print() {
        System.out.println("Employee Name : " + name);
        System.out.println("Employee ID   : " + empId);
    }
}

public class Ex1 {
    public static void main(String[] args) {
        Printable s = new Student("Devansh", 101);
        Printable e = new Employee("Rahul", 501);

        s.print();
        System.out.println();
        e.print();
    }
}