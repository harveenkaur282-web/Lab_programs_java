//Write a program to print all natural numbers from 1 to n, and write a program to print all natural numbers in reverse order.
class program15 {
    public static void main(String[] args) {
        int n=100;
        System.out.print("Original:: ");
        for(int i=1; i<n+1; i++){
            System.out.print(i+" ");
        }
        System.out.println("");
        System.out.print("Reversed:: ");
        for(int i=n; i>0; i--){
            System.out.print(i+" ");
        }
    }
}
