class MyThread extends Thread {

    public void run() {

        for(int i=1;i<=3;i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);

            try {
                Thread.sleep(500);
            } catch(Excep on e) {}

            Thread.yield();
        }
    }
}

public class program67 {

    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.start();
        t2.start();
    }
}