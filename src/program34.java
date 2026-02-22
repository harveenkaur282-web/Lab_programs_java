//Program to pass array as parameter
class program34 {
    static void printArray(int[] arr,int n) {
        System.out.println("Array elements are:");
        for(int x=0; x<n; x++)
            System.out.print(arr[x] + " ");
    }
    public static void main(String[] args) {
        int[] a = {5, 10, 15, 20};
        printArray(a,4);
    }
}
