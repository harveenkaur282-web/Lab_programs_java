//Write a program to enter the numbers till the user wants, and at the end, it should display the count of positive, negative, and zeros entered
import java.util.Scanner;
public class program22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p= 0, n= 0, z = 0;
        char ch;
        do {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if (num > 0) {
                p++;
            } else if (num < 0) {
                n++;
            } else {
                z++;
            }
            System.out.print("Do you want to enter another number? (y/n): ");
            ch = sc.next().charAt(0);
        } while (ch == 'y');
        System.out.println("\nCount of numbers entered:");
        System.out.println("Positive numbers: " + p);
        System.out.println("Negative numbers: " + n);
        System.out.println("Zeros: " + z);
        sc.close();
    }
}
