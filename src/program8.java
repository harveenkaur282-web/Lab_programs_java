//Write a program to print all prime numbers from 1 to 50.
public class program8 {
    public static boolean isprime(int n){
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.print("Primes:: ");
        for(int i=2; i<=50; i++){
            if(isprime(i)){
                System.out.print(i+" ");
            }
        }
    }
}
