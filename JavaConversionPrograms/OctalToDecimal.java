package JavaConversionPrograms;

import java.util.Scanner;

public class OctalToDecimal {

    public static void main(String[] args) {
        System.out.print("Enter an octal number: ");
        Scanner scanner = new Scanner(System.in);
        String octalStr = scanner.next(); // Read as String to keep leading 0s

        try {
            int decimal = Integer.parseInt(octalStr, 8); // base 8
            System.out.println("Decimal = " + decimal);
        } catch (NumberFormatException e) {
            System.out.println("Invalid octal number.");
        }
    }
}
