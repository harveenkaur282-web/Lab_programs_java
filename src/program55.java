//Write a program using an interface to achieve runtime polymorphism.
interface Bank {
    void rateOfInterest();
}
class SBI implements Bank {
    public void rateOfInterest() {
        System.out.println("SBI Rate = 7%");
    }
}
class HDFC implements Bank {
    public void rateOfInterest() {
        System.out.println("HDFC Rate = 8%");
    }
}
class program55 {
    public static void main(String[] args) {
        Bank b;
        b = new SBI();
        b.rateOfInterest();
        b = new HDFC();
        b.rateOfInterest();
    }
}
