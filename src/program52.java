//Write a Java program to create an interface Shape with a method area() and implement it in classes Circle and Rectangle.
interface Shape1 {void area();}
class Circle1 implements Shape1 {
    public void area() {
        int r = 5;
        System.out.println("Area of Circle = " + (3.14 * r * r));
    }
}
class Rectangle1 implements Shape1 {
    public void area() {
        int l = 4, b = 6;
        System.out.println("Area of Rectangle = " + (l * b));
    }
}
class program52 {
    public static void main(String[] args) {
        Circle1 c = new Circle1();
        Rectangle1 r = new Rectangle1();
        c.area();
        r.area();
    }
}
