package JavaConversionPrograms;

import java.util.Scanner;

public class BinarytoOctal {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter binary number");

		String binary = scanner.next();
		int decimal = Integer.parseInt(binary, 2);
		System.out.println("DecimalNumber " + decimal);
		String octal = Integer.toOctalString(decimal);
		System.out.println("Octal Number  = " + octal);
		String hexa = Integer.toHexString(decimal);
		System.out.println("Hexa decimal  = " + hexa);

	}
}
