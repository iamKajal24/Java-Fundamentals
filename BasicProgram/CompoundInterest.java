package BasicProgram;

import java.util.Scanner;

public class CompoundInterest {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter principal amount:");
		double p = scanner.nextDouble();

		System.out.println("Enter annual interest rate (in %):");
		double r = scanner.nextDouble();

		System.out.println("Enter time (in years):");
		double t = scanner.nextDouble();

		double amount = p * Math.pow((1 + r / 100), t);
		double CI = amount - p;

		System.out.printf("Compound Interest: %.2f\n", CI);
	}
}
