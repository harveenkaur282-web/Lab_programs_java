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

class Program53 {
    public static void main(String[] args) {
        Test t = new Test();
        t.display();
    }
}
