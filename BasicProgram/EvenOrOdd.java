package BasicProgram;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {

		System.out.println("Enter Numbers :");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();

		System.out.println((a % 2 == 0) ? "Even Number" : "Odd Number");

		// or

//		if (a % 2 == 0) {
//			System.out.println("Even Number");
//		} else {
//			System.out.println("Odd Number");
//		}
	}
}
