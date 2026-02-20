//Write a program to find greater number out of two using ternary operator.
import java.util.Scanner;
public class program5 {
    public static int max(int a,int b){
        int max = (a > b) ? a : b;
        return max;
    }
    public static void main(String[] args) {
        System.out.println("The greater number is: " + max(25,43));

    }
}
