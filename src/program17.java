//Write a program to print all the alphabet from a to z, and write a program to print the reverse alphabet from Z to A.
class program17 {
    public static void main(String[] args) {
        char c;
        System.out.print("Original List:: ");
        for(c = 'a'; c <= 'z'; ++c){
            System.out.print(c + " ");
        }
        System.out.println(" ");
        System.out.print("Reversed List:: ");
        for(c='z';c>='a';--c){
            System.out.print(c + " ");
        }
    }
}
