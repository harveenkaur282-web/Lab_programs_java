//Write a program to show method overriding.
class Parent {
    void show() {
        System.out.println("This is Parent class");
    }
}
class Child extends Parent {
    void show() {
        System.out.println("This is Child class");
    }
}
public class program24 {
    public static void main(String[] args) {
        Parent p = new Child();
        p.show();
    }
}
