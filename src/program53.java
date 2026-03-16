// Create an interface with a default method and override it in the implementing class.

interface Demo {
    default void display() {
        System.out.println("Default method in interface");
    }
}

class Test11 implements Demo {
    public void display() {
        System.out.println("Overridden method in class");
    }
}

public class program53 {
    public static void main(String[] args) {
        Test11 t = new Test11();   // corrected class name
        t.display();
    }
}