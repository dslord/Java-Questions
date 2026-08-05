package Exp2.Exercise;

class Student {
    String name;
    int age;
    int id;
    
    Student () {
        name = "Name";
        age = 0;
        id = 0;
    }

    Student (String n, int a, int i) {
        name = n;
        age = a;
        id = i;
    }

    void display () {
        System.out.println("Student Details : ");
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
        System.out.println("ID   : " + id);
    }
}

public class Ex1 {
    public static void main (String[] args) {
        Student st = new Student("Devansh", 18, 101);
        st.display();
    }
}
