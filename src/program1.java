//Write a program to implement bitwise operator.
public class program1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        System.out.println("Initial values: a = " + a + ", b = " + b);
        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("~a = " + (~a));
        System.out.println("a << 1 = " + (a << 1));
        System.out.println("a >> 1 = " + (a >> 1));
        System.out.println("a >>> 1 = " + (a >>> 1));
    }
}
