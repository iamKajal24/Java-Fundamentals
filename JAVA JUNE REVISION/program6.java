import java.util.Scanner;

public class program6 {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Start Program .....");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber = sc.nextInt();
        System.out.println("Enter second number");
        int secondNumber = sc.nextInt();
        System.out.println("Enter third number");
        int thirdNumber = sc.nextInt();
        int sum = firstNumber + secondNumber + thirdNumber;
        System.out.println("Sum of three numbers is: " + sum);
        
    }
    
}
