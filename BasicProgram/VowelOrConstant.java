package BasicProgram;

import java.util.Scanner;

public class VowelOrConstant {

	public static void main(String[] args) {

		System.out.println("Enter Vowels and Constant ");
		Scanner scanner = new Scanner(System.in);
		char ch = scanner.nextLine().charAt(0);

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') {
			System.out.println("it a vowels");
		} else {
			System.out.println("it is constant");
		}
	}
}
