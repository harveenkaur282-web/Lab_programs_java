//Write a program to show hierarchical inheritance.
class Shape {
    void draw() {
        System.out.println("Drawing shape");
    }
}
class Circle extends Shape {
    void area() {
        System.out.println("Area of circle");
    }
}
class Rectangle extends Shape {
    void area() {
        System.out.println("Area of rectangle");
    }
}
public class program27 {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        c.draw();
        c.area();
        r.draw();
        r.area();
    }
}
