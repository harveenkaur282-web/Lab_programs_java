//Write a program in Java to use final methods
class program30 {
    final void show() {
        System.out.println("This is a final method of class A");
    }
    public static void main(String[] args) {
        program30 obj = new program30();
        obj.show();
    }
}
