package TwoPointApproach;

import java.util.Scanner;



/*sort an array consisting of only 0s and 1s */

public class program1 {
	
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
	
//	static void sortZerosAndOnes(int arr[]) {
//		
//		int zeroes = 0;
//		//count number of zeroes
//		for(int i =0;i<arr.length;i++) {
//			if(arr[i] ==0) {
//				zeroes++;
//			}
//		}
//		
//		// 0 to zeroes-1 : 0, zeroes to n-1 :1
//		for(int i =0;i<arr.length;i++) {
//			if(i<zeroes) {
//				arr[i]=0;
//			}
//			else {
//				arr[i]=1;
//			}
//		}
//		
//	}
	
	
	//two point approach
	
	static void sortZeroesAndOnes(int arr[]) {
		int n = arr.length;
		
	   int left =0 ;
	   int right =n-1;
	   while(left<right) {
		   
		   if(arr[left] ==1 && arr[right]==0) {
			   swap(arr, left, right);
			   left++;
			   right--;
		   }
		   if(arr[left]==0) {
			   left++;
		   }
		   if(arr[right]==1) {
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
		
		//sortZerosAndOnes(arr);
		sortZeroesAndOnes(arr);
		System.out.println("\nSorted Array :");
	    printArray(arr);
		
		
	}

}
