//To create multiple threads that perform different tasks in Java.
package java_file;
class TaskOne extends Thread {
    public void run() {
        System.out.println("Task One: Printing numbers");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Number: " + i);
        }
    }
}
class TaskTwo implements Runnable {
    public void run() {
        System.out.println("Task Two: Printing letters");
        for (char i = 'A'; i <= 'C'; i++) {
            System.out.println("Letter: " + i);
        }}
}
public class program74 {
    public static void main(String[] args) {
        TaskOne thread1 = new TaskOne();
        Thread thread2 = new Thread(new TaskTwo());
        Thread thread3 = new Thread(() -> {
            System.out.println("Task Three: Lambda task running");
        });
        thread1.start();
        thread2.start();
        thread3.start();
    }
}