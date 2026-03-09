//Define two interfaces Printable and Scannable, each having one method. Create a class MultiFunctionPrinter that implements both interfaces and demonstrates their functionality.
interface Printable {
    void print();
}
interface Scannable {
    void scan();
}
class MultiFunctionPrinter implements Printable, Scannable {
    public void print() {
        System.out.println("Printing document...");
    }
    public void scan() {
        System.out.println("Scanning document...");
    }
}
class program57 {
    public static void main(String[] args) {
        MultiFunctionPrinter m = new MultiFunctionPrinter();
        m.print();
        m.scan();
    }
}
