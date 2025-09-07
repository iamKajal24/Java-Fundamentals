package Array;

import java.util.Scanner;

//find the total number of pairs in the array whose sum is equal to the given value x.

public class program6 {
	
	public static int pairValue(int arr[],int target) {
		int sum =0 ;
		int ans =0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==target) {
					ans++;
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
		
		System.out.println(pairValue(arr, target));
		
	}

}
