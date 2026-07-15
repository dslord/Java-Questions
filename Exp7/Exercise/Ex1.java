// Create a Shape application where Circle and Rectangle inherit from Shape and calculate area.
package Exp7.Exercise;

class Shape {
    void display() {
        System.out.println("Created a new shape!");
    }
}

class Circle extends Shape {
    double area (double r) {
        return 3.14 * r * r;
    }
}

class Rectangle extends Shape {
    double area (double l, double b) {
        return l * b;
    }
}

public class Ex1 {
    public static void main (String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.display();
        System.out.println("Area of Circle : " + c.area(10));
        r.display();
        System.out.println("Area of Rectangle : " + r.area(10, 10));
    }
}
