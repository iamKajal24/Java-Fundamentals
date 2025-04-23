package JavaConversionPrograms;

import java.util.Scanner;

public class DecimalToOctal {

	public static void main(String[] args) {

		System.out.println("enter Decimal Number ");
		Scanner scanner = new Scanner(System.in);
		int decimal = scanner.nextInt();

		String octal = Integer.toOctalString(decimal);
		System.out.println("Octal Number = " + octal);
	}

}
