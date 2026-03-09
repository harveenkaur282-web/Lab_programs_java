//Create an interface Payment with a method pay(double amount). Implement this interface in two classes: CreditCardPayment and UPIPayment. Write a program to demonstrate runtime polymorphism.
interface Payment {
    void pay(double amount);
}
class CreditCardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}
class UPIPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}
class Program56 {
    public static void main(String[] args) {
        Payment p;
        p = new CreditCardPayment();
        p.pay(5000);
        p = new UPIPayment();
        p.pay(2000);
    }
}