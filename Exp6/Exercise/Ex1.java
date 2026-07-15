// Create a Vehicle program where an inner class displays vehicle details and anonymous class performs an action.
package Exp6.Exercise;

interface Action {
    void start();
}

class Vehicle {
    String name;
    String model;

    Vehicle (String n, String m) {
        this.name = n;
        this.model = m;
    }

    class Display {
        void display() {
            System.out.println("Car Name : " + name);
            System.out.println("Car Model : " + model);
        }
    }
}

public class Ex1 {
    public static void main (String[] args) {
        Vehicle.Display v = new Vehicle("Toyota", "Etios").new Display();

        Action a = new Action () {
            @Override
            public void start () {
                System.out.println("Car started!");
            }
        };

        v.display();
        a.start();
    }
}
