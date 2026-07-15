package Exp7;

class Animal {
    void eat () {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks!");
    }
}

public class Main1 {
    public static void main (String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}
