package Array;

import java.util.Scanner;

/* find the unique number in a given array 
 * where all the elements are being 
 * repeated twice with one value being unique.
*/
public class program8 {
	
	public static int uniqueValues(int arr[]) {
		int n = arr.length;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					arr[i]=-1;
					arr[j]=-1;
				}
			}
		}
		int ans = -1;
		for(int i=0;i<n;i++) {
			if(arr[i]!= -1) {
				ans = arr[i];
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
		
		System.out.println("enter unique number :");
		System.out.println(uniqueValues(arr));
		
	}

}
