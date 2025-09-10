package TwoPointApproach;

import java.util.Scanner;

/* Given an integer array 'a' sorted in  non-decrasing order, return an array of the squares of each number sorted in non-decresing order */

public class program3 {

	static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	static void reverse(int arr[]) {
		int i = 0, j = arr.length - 1;
		while (i < j) {
			swap(arr, i, j);
			i++;
			j--;
		}
	}
	
	static int[] sortSquare(int arr[]) {
		int n = arr.length;
		int left =0 , right = n-1;
		int ans[]= new int[n];
		int k=0;
		
		while(left<=right)
		{
			// Compare the absolute values of the elements at left and right indices
			if(Math.abs(arr[left]) > Math.abs(arr[right])) {
				ans[k++] = arr[left] * arr[left];
				left++;	
			}
			else {
				ans[k++] = arr[right] * arr[right];
				right--;
			}
	    }
		
		return ans;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter arrya size");
		int n = scanner.nextInt();

		int arr[] = new int[n];
		System.out.println("Enter " + n + " elements ");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		System.out.println("Original array :");
		printArray(arr);
		
	    int []ans	=sortSquare(arr);
		System.out.println("\nsorted array");
		reverse(ans);
		printArray(ans);
		

	}

}
