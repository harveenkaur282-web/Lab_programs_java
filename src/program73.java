// To demonstrate thread priorities in Java.
package java_file;
class PriorityTask implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " with priority " +
                Thread.currentThread().getPriority() + " is running");
    }
}
public class program73 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new PriorityTask(), "Low-Priority-Thread");
        Thread t2 = new Thread(new PriorityTask(), "Medium-Priority-Thread");
        Thread t3 = new Thread(new PriorityTask(), "High-Priority-Thread");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
}