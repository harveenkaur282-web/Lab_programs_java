//Write a program to show nested try blocks
class program49 {
    public static void main(String[] args) {
        try {
            try {
                int a = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: Arithmetic Exception");
            }

            int arr[] = {1, 2, 3};
            System.out.println(arr[5]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch: Array Index Exception");
        }
    }
}
