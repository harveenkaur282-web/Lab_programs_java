class Task1 extends Thread {
    public void run() {
        System.out.println("Printing numbers");
        for(int i=1;i<=5;i++) {
            System.out.println(i);
        }
    }
}

class Task2 extends Thread {
    public void run() {
        System.out.println("Printing alphabets");
        for(char c='A'; c<='E'; c++) {
            System.out.println(c);
        }
    }
}

public class program70 {

    public void main(String[] args) {

        Task1 t1 = new Task1();
        Task2 t2 = new Task2();

        t1.start();
        t2.start();
    }
}