// Develop an Employee Payroll System that accepts employee IDs, basic salary, and bonus amounts from the user.
// Convert the entered values into wrapper objects and perform validation operations to ensure valid salary values before calculating the net salary.
package Exp4.Exercise;

import java.util.Scanner;

class Employee {
    int id;
    int salary;
    int bonus;

    Employee (int i, int s, int b) {
        id = i;
        salary = s;
        bonus = b;
    }

    int net_salary () {
        return salary + bonus;
    }

    void display () {
        System.out.println("\nEmployee Details : ");
        System.out.println("ID         : " + id);
        System.out.println("Salary     : Rs." + salary);
        System.out.println("Bonus      : Rs." + bonus);
        System.out.println("Net Salary : Rs." + net_salary());
    }
}

public class Ex2 {
    public static void main (String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter Employee ID : ");
            String id = in.next();
            Integer id_wrapped = Integer.valueOf(id);

            if (id_wrapped < 0) {
                System.out.println("Employee ID cannot be negative.");
                System.exit(0);
            }
            
            System.out.print("Enter Employee Salary : ");
            String sal = in.next();
            Integer sal_wrapped = Integer.valueOf(sal);
            
            if (sal_wrapped < 0) {
                System.out.println("Employee Salary cannot be negative.");
                System.exit(0);
            }

            System.out.print("Enter Employee Bonus : ");
            String b = in.next();
            Integer b_wrapped = Integer.valueOf(b);
            
            if (b_wrapped < 0) {
                System.out.println("Employee Bonus cannot be negative.");
                System.exit(0);
            }

            Employee e = new Employee(id_wrapped, sal_wrapped, b_wrapped);
            e.display();
        }
    }
}
