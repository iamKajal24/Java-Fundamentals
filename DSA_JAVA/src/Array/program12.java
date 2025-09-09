package Array;

import java.util.Scanner;

/* Reverse an array consisting of Integer values. */

public class program12 {

	static void printValues(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	static int[] reverseArray(int arr[]) {
		int n = arr.length;
		int ans[] = new int[n];
		int j = 0;

		// traver original array in reverse direction
		for (int i = n - 1; i >= 0; i--) {
			ans[j++] = arr[i];
		}
		return ans;
	}

	public static void swapInArray(int arr[], int i, int j) {

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

	static void reverseInPlace(int arr[]) {
		int i = 0, j = arr.length - 1;

		while (i < j) {
			swapInArray(arr, i, j);
			i++;
			j--;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter given array :");
		int n = scanner.nextInt();

		int arr[] = new int[n];

		// taking input
		System.out.println("Enter " + n + " elements :");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		System.out.println("Original Values :");
		printValues(arr);

		int[] ans = reverseArray(arr);
		System.out.println("after reverse values :");
		printValues(ans);

		System.out.println("reverse in Place values");
		reverseInPlace(arr);
		printValues(arr);

	}
}
