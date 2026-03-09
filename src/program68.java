class MyThread1 extends Thread {

    public void run() {

        for(int i=1;i<=3;i++) {
            System.out.println("Child Thread : " + i);

            try {
                Thread.sleep(500);
            } catch(Exception e) {}
        }
    }
}

public class program68 {

    public static void main(String[] args) {

        MyThread1 t = new MyThread1();
        t.start();

        try {
            t.join();
        } catch(Exception e) {}

        for(int i=1;i<=3;i++) {
            System.out.println("Main Thread : " + i);
        }
    }
}