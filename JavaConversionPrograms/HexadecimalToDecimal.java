package JavaConversionPrograms;

import java.util.Scanner;

public class HexadecimalToDecimal {

	public static void main(String[] args) {

		System.out.print("Enter hexadecimal number: ");
		Scanner scanner = new Scanner(System.in);
		String hexa = scanner.next();

		int decimal = Integer.parseInt(hexa, 16);

		System.out.println("Decimal number = " + decimal);
	}
}
