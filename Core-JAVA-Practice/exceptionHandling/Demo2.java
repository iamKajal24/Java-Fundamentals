package exceptionHandling;

public class Demo2 {

    public static void main(String[] args) {

        System.out.println("Program started");
        try {
            int a = 5;
            int b = 0;

            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Exception handled");
        } finally {
            System.out.println("Finally block executed");
        }

        System.out.println("Program ended");
    }

}
