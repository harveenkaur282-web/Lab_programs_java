//Design an interface Vehicle with a default method start()
//and an abstract method fuelType(). Implement this interface in two classes: Car and Bike

interface Vehicle2 {
    default void start() {
        System.out.println("Vehicle is starting...");
    }
    void fuelType1();
}

class Car2 implements Vehicle2 {
    public void fuelType1() {
        System.out.println("Car uses Petrol");
    }
}

class Bike2 implements Vehicle2 {
    public void fuelType1() {
        System.out.println("Bike uses Petrol");
    }
}

class Program58 {
    public static void main(String[] args) {
        Car2 c = new Car2();
        c.start();
        c.fuelType1();

        Bike2 b = new Bike2();
        b.start();
        b.fuelType1();
    }
}