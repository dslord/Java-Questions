// Develop a Mobile Phone Inventory System using different constructors to initialize mobile details and create duplicate object records.
package Exp2.Exercise;

class Mobile {
    String brand;
    String model;
    String CPU;
    int RAM;
    int storage;
    int price;

    Mobile () {
        brand = "Brand name";
        model = "Model";
        CPU = "CPU name";
        RAM = 0;
        storage = 0;
        price = 0;
    }

    Mobile (String b, String m, String c, int r, int s, int p) {
        brand = b;
        model = m;
        CPU = c;
        RAM = r;
        storage = s;
        price = p;
    }

    Mobile (Mobile m) {
        this.brand = m.brand;
        this.model = m.model;
        this.CPU = m.CPU;
        this.RAM = m.RAM;
        this.storage = m.storage;
        this.price = m.price;
    }

    void display () {
        System.out.println("Mobile Details : ");
        System.out.println("Brand   : " + brand);
        System.out.println("CPU     : " + CPU);
        System.out.println("RAM     : " + RAM + " GB");
        System.out.println("Storage : " + storage + " GB");
        System.out.println("Price   : Rs." + price);
        System.out.println();
    }
}

public class Ex2 {
    public static void main (String[] args) {
        Mobile m1 = new Mobile("Samsung", "Samsung S26 Ultra", "Qualcomm Snapdragon 8 Elite 2", 12, 256, 145000);
        Mobile m2 = new Mobile(m1);

        m1.display();
        m2.display();
    }
}
