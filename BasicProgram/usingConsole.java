package BasicProgram;

import java.util.Scanner;

public class usingConsole {

	public static void main(String[] args) {
		System.out.println("Enter number ...");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();

		System.out.println("number : " + a);
	}
}
