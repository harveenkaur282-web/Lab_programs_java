//Write a program to display numbers using increment and decrement
import java.util.Scanner;
public class program11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer to test: ");
        int a = scanner.nextInt();
        System.out.println("Initial Value: " + a);
        System.out.println("Using Post-increment (a++): " + (a++));
        System.out.println("Value after Post-increment: " + a);
        System.out.println("Using Pre-increment (++a): " + (++a));
        System.out.println("Using Post-decrement (a--): " + (a--));
        System.out.println("Value after Post-decrement: " + a);
        scanner.close();
    }
}
