//Write a program to show method overloading.
class program23 {
    void add(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }
    void add(double a, double b) {
        System.out.println("Sum = " + (a + b));
    }
    public static void main(String[] args) {
        program23 obj = new program23();
        obj.add(10, 20);
        obj.add(5.5, 4.5);
    }
}
