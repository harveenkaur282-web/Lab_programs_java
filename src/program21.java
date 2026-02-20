//Write a program to reverse the given Digits and sum the digits
class program21 {
    public static void reversed(int n){
        int org_n=n;
        int rev_n=0;
        int sum=0;
        while(n!=0){
            int d=n%10;
            rev_n=rev_n*10+d;
            n/=10;
            sum+=d;
        }
        System.out.println("Reversed Number:: "+rev_n);
        System.out.println("Sum of digits:: " +sum);
    }
    public static void main(String[] args) {
        reversed(2025);
    }
}
