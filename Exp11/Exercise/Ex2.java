// Create an interface Switchable with a method turnOn(). Implement the interface in Light and Fan classes to display the device status
package Exp11.Exercise;

interface Switchable {
    void turnOn();
}

class Light implements Switchable {
    public void turnOn() {
        System.out.println("Light is ON");
    }
}

class Fan implements Switchable {
    public void turnOn() {
        System.out.println("Fan is ON");
    }
}

public class Ex2 {
    public static void main(String[] args) {
        Switchable light = new Light();
        Switchable fan = new Fan();

        light.turnOn();
        fan.turnOn();
    }
}