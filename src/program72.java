//Write a Java program to demonstrate synchronized block and interrupt() method.
class Test {

    void printNumbers() {

        synchronized(this) {
            for(int i=1;i<=5;i++) {

                System.out.println(i);

                try {
                    Thread.sleep(500);
                } catch(InterruptedException e) {
                    System.out.println("Thread Interrupted");
                }
            }
        }
    }
}

class MyThread extends Thread {

    Test t;

    MyThread(Test t) {
        this.t = t;
    }

    public void run() {
        t.printNumbers();
    }
}

public class program72 {

    public static void main(String[] args) {

        Test obj = new Test();

        MyThread t1 = new MyThread(obj);
        t1.start();

        t1.interrupt();
    }
}