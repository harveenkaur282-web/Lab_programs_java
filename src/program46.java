//Write a program to show finally block.
class Program46 {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (Exception e) {
            System.out.println("Exception caught");
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
