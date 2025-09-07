package Array;

import java.util.Scanner;

//count the number of triplets whose sum is equal to the given value x.

public class program7 {
	
	public static int tripletValues(int arr[],int target) {
		int ans =0;
		int n = arr.length;
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				for(int k=j+1;k<n;k++) {
					if(arr[i]+arr[j]+arr[k]==target) {
						ans++;
					}
				}
			}
		}
		return ans;
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
		
		System.out.println("Enter target sum : ");
		int target = scanner.nextInt();
		
		System.out.println(tripletValues(arr, target));
		
		
	}

}
