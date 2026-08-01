import java.util.Scanner;

public class TakingInput4 {

    public static void main(String[] args) {

        System.out.println("Takig input from user using Scanner class");
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        int sum=a+b;
        System.out.println("Sum of two numbers is: "+sum);

        //use hasNextInt() method to check if the next input is an integer or not
        boolean isInt = sc.hasNextInt();
        System.out.println("Is the next input an integer? " + isInt);

         // consume the newline character left by nextInt()
        System.out.println("Enter a string");
        String inputStr = sc.nextLine();
        System.out.println(inputStr);

         
       
    }
    
}
