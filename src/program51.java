//Write a program to show runtime polymorphism/upcasting.
class Animal1 {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog1 extends Animal1 {
    void sound() {
        System.out.println("Dog barks");
    }
}

class program51 {
    public static void main(String[] args) {
        Animal1 a = new Dog1();   // upcasting
        a.sound();
    }
}
