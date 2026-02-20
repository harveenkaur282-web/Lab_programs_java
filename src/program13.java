//Write a program to check whether two strings are equal or not.
public class program13 {
    public static void compare(String a, String b){
        if (a.equals(b)) {
            System.out.println("The two strings are equal.");
        } else {
            System.out.println("The two strings are not equal.");
        }
    }
    public static void main(String[] args) {
        compare("Hello","Hello");
        compare("Cat","Dog");
    }
}
