package Array;

import java.util.Scanner;



public class Array2 {
	
	static void printArray(int []arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
		
	}
	
	static void changeArray(int []arr1) {
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=0;
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter " + n + " element");

		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		
		System.out.println("Original array");
		printArray(arr);
		
		changeArray(arr);
		printArray(arr);

//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
		
		int arr2[] = arr.clone();
		System.out.println("copy array");
		printArray(arr2);
		
	}

}
