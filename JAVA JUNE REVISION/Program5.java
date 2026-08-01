import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        // write your code here
        System.out.println("Start Program .....");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Hindi number");
        int hindiNumber = sc.nextInt();
        System.out.println("Enter English number");
        int englishNumber = sc.nextInt();
        System.out.println("Enter Math number");
        int mathNumber = sc.nextInt();
        System.out.println("Enter Science number");
        int scienceNumber = sc.nextInt();
        System.out.println("Enter Social Science number");
        int socialScienceNumber = sc.nextInt();
        int totalMarks = hindiNumber + englishNumber + mathNumber + scienceNumber + socialScienceNumber;
        System.out.println("Total marks is: " + totalMarks);
        System.out.println("Percentage is: " + ((totalMarks *100)/50045));

    }
}