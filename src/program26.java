//Write a program to show multi-level inheritance.
class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}
class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving");
    }
}
class SportsCar extends Car {
    void speed() {
        System.out.println("Sports car is fast");
    }
}
public class program26 {
    public static void main(String[] args) {
        SportsCar s = new SportsCar();
        s.start();
        s.drive();
        s.speed();
    }  }
