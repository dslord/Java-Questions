package Exp2;
class Student {
    String name;
    int age;

    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("name : " + name + ", age : " + age);
    }
}

class Counter {
    static int count = 0;

    Counter () {
        count++;
        System.out.println("Object : " + count);
    }
}

class Calculator {
    static int add(int a, int b) {
        return a + b;
    }
}

class Outer {
    class Inner {
        void display () {
            System.out.println("Inner Class Method");
        }
    }
}

public class Main {
    int id;
    String name;

    public static void main (String[] args) {
        // Defining class in java
        System.out.println("Defining class in java : ");
        Student st = new Student("Devansh", 18);
        st.display();

        // Learning static and final variable difference
        System.out.println("\nLearning static and final variable difference : ");
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
    
        System.out.println("Counter : " + Counter.count);

        // Learning Instance Variable
        System.out.println("\nLearning Instance Variable : ");
        Main e = new Main();
        e.id = 10;
        e.name = "Devansh";
        System.out.println("Name : " + e.name + " -- ID : " + e.id);

        // Calling static function in java
        System.out.println("\nCalling static function in java : ");
        System.out.println("Sum : " + Calculator.add(10, 10));

        // Inner and Outer Classes
        System.out.println("\nInner and Outer classes : ");
        Outer.Inner obj = new Outer().new Inner();
        obj.display();
    }
}