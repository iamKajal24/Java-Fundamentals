package Array;

import java.util.Arrays;

//How can we find the largest and smallest element by sorting the elements?

public class program5 {

	public static int[] smallestAndLargestElement(int arr[]) {

		Arrays.sort(arr);

//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i] + " ");
//		}
		
		int [] ans = {arr[0],arr[arr.length-1]};
		return ans;

	}

	public static void main(String[] args) {

		int[] arr = { 2, 5, 1, 5, 9, 3 };
		
		int []ans = smallestAndLargestElement(arr);

		System.out.println("smallest : " + ans[0]+ " largest number : "+  ans[1]);

	}

}
