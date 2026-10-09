package exceptionHandling;

public class Demo4 {

    public static void main(String args[]){
        try{
            System.out.println("Outer try starts");
            try{
                System.out.println("Inner try starts");
                System.out.println(5 / 0);
                System.out.println("Inner try ends");
            } catch (ArithmeticException e) {
                System.out.println("Exception caught in inner try");
            }
        } catch (ArithmeticException e) {
            System.out.println("Exception caught in outer try");
        }
    }

}
