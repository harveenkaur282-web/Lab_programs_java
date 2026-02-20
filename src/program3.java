//Write a program to print a Fibonacci series up to a limit.
class program3 {
    public static void fibonacci(int n){
        int first = 0, second = 1;
        System.out.print("Fibonacci Series :: " +first+","+second);
        while(true){
            int next=first+second;
            if(next>n) break;
            System.out.print(","+next);
            first = second;
            second = next;
        }
    }
    public static void main(String[] args) {
        fibonacci(100);
    }
}
