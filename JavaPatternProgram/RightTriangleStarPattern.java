package JavaPatternProgram;

import java.util.Scanner;

public class RightTriangleStarPattern {

	public static void main(String[] args) {
		System.out.println("enter rows :");
		Scanner scanner = new Scanner(System.in);
		int rows = scanner.nextInt();

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
