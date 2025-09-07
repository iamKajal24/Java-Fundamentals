package Array;

import java.util.Scanner;

/* Given an array 'a' consisting of integer. Return the first values that is repeating in this array. if no value is being repeated , return -1 */

public class program10 {
	
	public static int RepeatNum(int arr[]) {
		for(int i =0;i<arr.length;i++) { //first number
			for(int j =i+1;j<arr.length;j++) { //second number
				if(arr[i]==arr[j]) { // found answer
					return arr[i];
				}
			}
		}
		return -1;
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
		
		System.out.println("enter repeated numbers :");
		System.out.println(RepeatNum(arr));
		
	}

}
