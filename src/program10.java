//Write a program to reverse a given number.
public class program10 {
    public static void reversed(int n){
        int originalNum = n;
        int reversed = 0;
        while(n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        System.out.println("Original: " + originalNum);
        System.out.println("Reversed: " + reversed);
    }
    public static void main(String[] args) {
        reversed(321);
        reversed(4501);
    }
}
