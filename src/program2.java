//Write a program to check whether a number is prime.
class program2 {
    public static boolean isprime(int n){
        if (n <=1) return false;
        if (n == 2) return true;
        if (n%2==0) return false;
        for(int i=3; i*i<=n;i+=2){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isprime(4));
        System.out.println(isprime(16));
        System.out.println(isprime(7));
    }
}
