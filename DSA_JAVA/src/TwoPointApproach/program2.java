package TwoPointApproach;

import java.util.Scanner;





/* Given an array of Integer 'a' moves all the even integer at the 
 * begining of the array followed by all the odd integer. The relative order of
 * odd or even integer does not matter. Return any array that 
 * satisfies the condition*/

public class program2 {
	
	static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	static void swap(int arr[], int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	static void evenOrOdd(int arr[]) {
		int n = arr.length;
		int left = 0;
		int right = n-1;
		
		while(left<right) {
			
			if(arr[left] % 2 != 0 && arr[right] % 2 == 0) {
				 // left odd, right even → swap
				swap(arr, left, right);
				left++;
				right--;
			}
			else if(arr[left]%2==0) {
				  // left already even → move ahead
				left++;
			}
			else if(arr[right]%2 !=0) {
				 // right already odd → move back
				right--;
			}
			
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter arrya size");
		int n = scanner.nextInt();
		
		int arr[] = new int [n];
		System.out.println("Enter " + n + " elements ");
		for(int i=0;i<n;i++) {
			arr[i] = scanner.nextInt();
		}
		
		System.out.println("Original array :");
		printArray(arr);
		
		evenOrOdd(arr);
		System.out.println("\nssorted array ");
		printArray(arr);
	}

}
