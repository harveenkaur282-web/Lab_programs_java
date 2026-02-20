//Write a program to print tables, and write a program to print reverse tables
class program16 {
    public static void main(String[] args) {
        int n=10;
        System.out.println("Tables of 2:: ");
        for(int i=1; i<n+1; i++){
            System.out.println(i+" x 2 = "+i*2);
        }
        System.out.println("");
        System.out.println("Tables of 2 in Reversed:: ");
        for(int i=n+1; i>0; i--){
            System.out.println(i+" x 2 = "+i*2);
        }
    }
}
