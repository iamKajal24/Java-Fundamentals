package Array;

import java.util.Scanner;



/* rotate the give array a by k steps , where k is non - negative.
 * Note :  k can be greater than n as well */

public class program13 {
	
	static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i] + " ");
		}
	}
	
	static int[] rotate(int arr[], int k) {
		int n = arr.length;
		k = k%n;
		int[] ans = new int[n];
		int j =0;
		
		for(int i = n-k;i<=n-1;i++) {
			ans[j++] = arr[i];
		}
		for(int i=0;i<n-k;i++) {
			ans[j++] = arr[i];
		}
		return ans;
	}
	
	static void swap(int arr[],int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	static void reverse(int arr[],int i,int j) {
		
		while(i<j) {
			swap(arr,i,j);
			i++;
			j--;
		}
	}
	
	static void rotateInPlace(int arr[],int k) {
		int n = arr.length;
		k = k %n;
		/* 1 2 3 4 5 6 7 8 
		 * n=8
		 * k=3
		 * k%n = 3/8 = 3 */
        reverse(arr,0,n-k-1); //8-3-1 =4 , i.e means rev(0,4) index
        reverse(arr,n-k,n-1);//5,7
        reverse(arr,0,n-1); // complete  rev
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
		
		System.out.println("Enter k : ");
		int k = scanner.nextInt();
		
		System.out.println("original array");
		//int ans[] = rotate(arr, k);
		rotateInPlace(arr, k);
		System.out.println("Array after rotation :");
		//printArray(ans);
		printArray(arr);
		
	}

}
