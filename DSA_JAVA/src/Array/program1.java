package Array;

import java.util.Scanner;

//count the number of occurrences of a particular element x.
//x=5

public class program1 {

	static int countOccurrence(int[] arr, int x) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Array size input
		System.out.print("Enter the size of array: ");
		int n = scanner.nextInt();

		int[] arr = new int[n];

		// Array elements input
		System.out.println("Enter " + n + " numbers:");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		// Element to count
		System.out.print("Enter the number to count: ");
		int x = scanner.nextInt();

		// Count occurrence
		System.out.println("COUNT OF " + x + " : " + countOccurrence(arr, x));

	}

}
