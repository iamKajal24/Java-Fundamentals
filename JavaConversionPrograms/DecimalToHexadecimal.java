package JavaConversionPrograms;

import java.util.Scanner;

public class DecimalToHexadecimal {

	public static void main(String[] args) {
		System.out.println("enter decimal number ");
		Scanner scanner = new Scanner(System.in);
		int decimal = scanner.nextInt();

		String hexa = Integer.toHexString(decimal);
		System.out.println("Hexa number = " + hexa);
	}

}
