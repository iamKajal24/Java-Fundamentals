package BasicProgram;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();

		System.out.println("Armstrong number between " + a + " & " + b + " :");
		for (int i = a; i <= b; i++) {
			int sum = 0;
			int p = i;
			int original = i;
			int length = String.valueOf(i).length();

			while (p > 0) {
				int rem = p % 10;
				p = p / 10;
				sum += Math.pow(rem, length);
			}
			if (sum == original) {
				System.out.println(original);
			}
		}

	}

}
