//Write a program to show ArithmeticException.
class program43 {
    public static void main(String[] args) {
        int a = 13, b = 0;
        int c = a / b;   // error
        System.out.println(c);
    }
}
