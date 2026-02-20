//Write a program to check whether a number is even or odd.
class program4 {
    public static boolean iseven(int n){
        if(n%2==0) return true;
        else return false;
    }
    public static void main(String[] args) {
        System.out.print(iseven(2) + " ");
        System.out.print(iseven(5));
    }
}
