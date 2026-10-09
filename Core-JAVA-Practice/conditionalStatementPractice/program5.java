package conditionalStatementPractice;

public class program5 {

    public static void main(String[] args) {
        int i = 30;

        if (i < 10) {
            System.out.println("temperature is very cold");
        } else if (i >= 10 && i < 25) {
            System.out.println("temperature is modrate");
        } else if (i >= 25) {
            System.out.println("temperature is very hot");
        } else
            System.out.println("temperature is normal");
    }

}
