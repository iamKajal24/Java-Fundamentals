package BasicProgram;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {

		System.out.println("Enter number = ");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int sum = 0;
		int square = a * a;
		while (square > 0) {
			int rem = square % 10;
			sum += rem;
			square = square / 10;
		}

		if (sum == a) {
			System.out.println(a + " is a Neon Number ");
		} else {
			System.out.println(a + " is not a Neon Number ");
		}
	}

}
