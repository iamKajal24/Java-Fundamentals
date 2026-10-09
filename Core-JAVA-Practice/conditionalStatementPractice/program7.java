package conditionalStatementPractice;

public class program7 {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        int choice = 4;

        switch (choice) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
            case 4:
                System.out.println(a / b);
            default:
                System.out.println("nothing calculation");
                break;
        }

    }

}
