//Write a Java program to show how an interface reference can refer to an object of its implementing class
interface Vehicle1 {
    void run();
}

class Bike1 implements Vehicle1 {
    public void run() {
        System.out.println("Bike is running");
    }
}

class program54 {
    public static void main(String[] args) {
        Vehicle1 v = new Bike1();   // interface reference
        v.run();
    }
}
