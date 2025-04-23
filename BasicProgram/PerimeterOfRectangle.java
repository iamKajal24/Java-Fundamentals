package BasicProgram;

import java.util.Scanner;

public class PerimeterOfRectangle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter length");
		int length = scanner.nextInt();
		System.out.println("Enter breadth");
		int breadth = scanner.nextInt();
		int Perimeter = 2 * (length + breadth);
		System.out.println(" Rectangle of Perimeter = " + Perimeter);
	}
}
