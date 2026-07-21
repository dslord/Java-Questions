// 2. Scenario:
// You are tasked with developing a simple Student Grade Management System in Java. The system should allow users to add students, add grades for each student
// calculate the average grade for a student and display all students along with their grades and average.

// Requirements:
// 1. Create a Student class with the following attributes:
//      name (String)
//      grades (List of Double)
// 2. The Student class should have the following methods:
//      addGrade(double grade): Adds a grade to the student's list of grades.
//      calculateAverage(): Calculates and returns the average grade of the student.
//      displayStudentDetails(): Displays the student's name, grades, and average.
// 3. Create a GradeManager class that manages a collection of students. The GradeManager class should have the following methods:
//      addStudent(Student student): Adds a student to the system.
//      findStudentByName(String name): Finds and returns a student by their name.
//      displayAllStudents(): Displays all students along with their grades and average.
// 4. Create a Main class to test the functionality of the GradeManager class.

// Question:
// Write the Java code to implement the above scenario. Your code should include the Student class, the GradeManager class, and the Main class.
// Ensure that the Main class demonstrates adding students, adding grades, calculating averages, and displaying all students.

package CaseBased.Scenario2;

import java.util.Scanner;
import java.util.ArrayList;

class Student {
    String name;
    double avg;
    ArrayList<Double> grades = new ArrayList<>();

    Student (String n, ArrayList<Double> g) {
        name = n;
        grades = g;
    }

    void addGrade (double grade) {
        grades.add(grade);
    }

    void calculateAverage () {
        for (double n : grades) {
            avg += n;
        }
        avg /= grades.size();

        System.out.println("Average Marks : " + avg);
    }

    void displayStudentDetails () {
        System.out.println("Student Name   : " + name);
        System.out.println("Student Grades : " + grades);
        System.out.println("Average Marks  : " + avg);
    }
}

class GradeManager {
    ArrayList<Student> students = new ArrayList<>();

    void addStudent (Student student) {
        students.add(student);
    }

    void searchByName (String name) {
        int found = 0;
        for (Student stu : students){
            if (stu.name.contains(name)) {
                System.out.println("\nFound the Book : ");
                System.out.println("Name   : " + stu.name);
                System.out.println("Grades : " + stu.grades);
                System.out.println("Avg.   : " + stu.avg + "\n");
                found = 1;
                break;
            }
        }

        if (found == 0) {
            System.out.println("Student not found!\n");
        }
    }

    void displayAllStudents () {
        System.out.println("All Student details : ");
        for (Student stu : students) {
            System.out.println("\nName   : " + stu.name);
            System.out.println("Grades : " + stu.grades);
            System.out.println("Avg.   : " + stu.avg + "\n");
        }
    }
}

public class Scenario2 {
    public static void main (String[] args) {
        GradeManager m = new GradeManager();

        try (Scanner in = new Scanner(System.in)) {
            while (true) {
                System.out.println("Following options : ");
                System.out.println("(1) Add Students and grades");
                System.out.println("(2) Search Student by name");
                System.out.println("(3) Display Student details");
                System.out.println("(4) Exit");
                System.out.print("Enter choice : ");
                int choice = in.nextInt();
                in.nextLine();

                if (choice == 4) {
                    System.out.println("\nExiting...\n");
                    break;
                }

                if (choice == 1) {
                    System.out.print("\nEnter Student name : ");
                    String name = in.nextLine();

                    System.out.print("Enter number of Student grades : ");
                    int n = in.nextInt();

                    System.out.print("Enter Student grades : ");
                    ArrayList<Double> g = new ArrayList<>();
                    for (int i = 0; i < n; i++) {
                        g.add(in.nextDouble());
                    }
                    
                    Student s = new Student(name, g);
                    s.calculateAverage();
                    m.addStudent(s);

                    System.out.println("Added student and grades in Grade Manager!\n");
                } else if (choice == 2) {
                    System.out.print("\nEnter student name to search : ");
                    String title = in.nextLine();

                    m.searchByName(title);
                } else if (choice == 3) {
                    m.displayAllStudents();
                } else {
                    System.out.println("\nWrong choice!!!\n");
                }
            }
        }
    }
}
