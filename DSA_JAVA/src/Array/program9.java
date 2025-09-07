package Array;

import java.util.Scanner;

/* find the second largest element in the given array */

public class program9 {
	
	public static int findMax(int arr[]) {
		
		int mx = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>mx) {
				mx = arr[i];
			}
		}
		return mx;
	}
	
	public static int secondMax(int arr[]) {
		int mx = findMax(arr);
		for(int i= 0;i<arr.length;i++) {
			if(arr[i]==mx) {
				arr[i] = Integer.MIN_VALUE;
			}
		}
		
		int secondMax = findMax(arr);
		
		return secondMax;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter array size :");
		int n = scanner.nextInt();
		int [] arr= new int[n];
		
		System.out.println("Enter " + n + " element :");
		for(int i=0;i<arr.length;i++) {
			arr[i] = scanner.nextInt();
		}
		
		System.out.println("second max value :" );
		System.out.println(secondMax(arr));
	}

}
