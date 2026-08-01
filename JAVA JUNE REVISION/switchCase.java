import java.util.Scanner;

public class switchCase{
    
    public static void main(String args[]){

        System.out.println("Enter your age :");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        switch (age){
            case 60 :
                System.out.println("you are experienced");
                break;

            case 40 :
                System.out.println("you are semi experienced");
                break;

            case 26 :
                System.out.println("you are going to be adult");
                break;
            default :
                System.out.println("Enjoy your life5640");
        }

        System.out.println("Thank you for using this program");
        
    }
}