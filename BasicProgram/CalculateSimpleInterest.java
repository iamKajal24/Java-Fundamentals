package BasicProgram;

import java.util.Scanner;

public class CalculateSimpleInterest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter principal amount");
		int p = scanner.nextInt();
		System.out.println("Enter rate ");
		int r = scanner.nextInt();
		System.out.println("Enter time");
		int t = scanner.nextInt();

		int SI = (p * r * t) / 100;
		System.out.println("simple Interest  : " + SI);
	}
}
