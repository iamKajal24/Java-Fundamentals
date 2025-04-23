package JavaConversionPrograms;

import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {

		System.out.println("enter decimal number");
		Scanner scanner = new Scanner(System.in);
		int decimal = scanner.nextInt();

		String binary = Integer.toBinaryString(decimal);
		System.out.println("Binary number = " + binary);
	}

}
