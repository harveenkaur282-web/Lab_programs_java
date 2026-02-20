//Write a program to calculate power of a number.
public class program9 {
    public static int power(int b,int p){
        int r=1;
        for(int i=1; i<=p; i++){
            r=r*b;
        }
        return r;
    }
    public static void main(String[] args) {
        System.out.println("2 to the power of 4 is " +power(2,4));
        System.out.println("3 to the power of 2 is " +power(3,2));
    }
}
