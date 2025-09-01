package Array;

import java.util.Arrays;
import java.util.Scanner;





public class Array3 {
	
	static void printArray(int []arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
		
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
		
		System.out.println("original array");
		printArray(arr);
		
		// trying to copy arr to arr2
		int [] arr2 =Arrays.copyOf(arr, 2);
         System.out.println("Coiped Array2");
         printArray(arr2);
         
         //arrays.copyofRange(Arr,0,arr.length)
         int arr3[] = Arrays.copyOfRange(arr2, 0, arr.length);
         System.out.println("copied array3");
         printArray(arr3);
	}

}
