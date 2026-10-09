package exceptionHandling;

public class Demo3 {

    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        try {
            methodA(a, b);
        } catch (ArithmeticException e) {
            System.out.println("Exception handled");
        }
    }

    public static void methodA(int a, int b) {
        methodB(a, b);
    }

    public static void methodB(int a, int b) {
        System.out.println(a / b);
    }

}
// main() -> methodA() -> methodB()

/*
 * Step 1
 * Divide by zero is not allowed
 * Step 2
 */