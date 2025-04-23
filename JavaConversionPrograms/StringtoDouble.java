package JavaConversionPrograms;

import java.util.Scanner;

public class StringtoDouble {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a numeric string (e.g., 123 or 123.45): ");
		String input = scanner.next();

		try {
			int decimalInt = Integer.parseInt(input);
			System.out.println("Converted to Integer: " + decimalInt);
		} catch (NumberFormatException e) {
			System.out.println("Input is not a valid Integer.");
		}

		try {
			double decimalDouble = Double.parseDouble(input);
			System.out.println("Converted to Double: " + decimalDouble);
		} catch (NumberFormatException e) {
			System.out.println("Input is not a valid Decimal Number.");
		}
	}

}
