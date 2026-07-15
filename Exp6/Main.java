package Exp6;

class Outer {
    class Inner {
        void display () {
            System.out.println("Inner Class Method");
        }
    }
}

public class Main {
    public static void main (String[] args) {
        System.out.println("Inner and Outer classes : ");
        Outer.Inner obj = new Outer().new Inner();
        obj.display();
    }
}
