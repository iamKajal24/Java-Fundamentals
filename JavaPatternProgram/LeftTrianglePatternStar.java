package JavaPatternProgram;

import java.util.Scanner;

public class LeftTrianglePatternStar {
	public static void main(String[] args) {
		System.out.print("Enter rows: ");
		Scanner scanner = new Scanner(System.in);
		int rows = scanner.nextInt();

		for (int i = 1; i <= rows; i++) {
			for (int j = i; j < rows; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
