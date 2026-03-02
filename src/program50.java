//Write a program to create custom exception.
class MyException extends Exception {
    MyException(String msg) {
        super(msg);
    }
}

class program50 {
    static void check(int num) throws MyException {
        if (num < 0) {
            throw new MyException("Number is negative");
        } else {
            System.out.println("Number is positive");
        }
    }

    public static void main(String[] args) {
        try {
            check(-5);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
