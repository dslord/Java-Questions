package Exp8.Exercise;

class Vehicle {
    String brand;
    String model;

    Vehicle(String b, String m) {
        this.brand = b;
        this.model = m;
    }
}

class Insurance extends Vehicle {
    Insurance(String b, String m) {
        super(b, m);
    }

    void display() {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
    }
}

public class Ex2 {
    public static void main (String[] args) {
        Insurance i = new Insurance("Toyota", "Etios");
        i.display();
    }
}
