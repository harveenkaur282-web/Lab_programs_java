//To demonstrate synchronized block and interrupt() method in Java threads.
package java_file;
class SharedResource {
    public void executeTask() {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " entered synchronized block.");
            try {
                Thread.sleep(5000);
                System.out.println(Thread.currentThread().getName() + " completed task.");
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " was INTERRUPTED while in sleep!");
            }
            System.out.println(Thread.currentThread().getName() + " is leaving synchronized block.");
        }
    }
}
public class program76 {
    public static void main(String[] args) throws InterruptedException {
        SharedResource resource = new SharedResource();
        Thread t1 = new Thread(resource::executeTask, "Worker-1");
        t1.start();
        Thread.sleep(1000);
        System.out.println("Main thread calling interrupt() on Worker-1...");
        t1.interrupt();
    }
}