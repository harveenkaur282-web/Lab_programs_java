//Write a program to find the factorial value of any number
class program20 {
    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<n+1;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.print("Factorial of "+n+" is "+factorial(n));
    }
}
