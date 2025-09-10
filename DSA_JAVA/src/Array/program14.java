package Array;

import java.util.Scanner;

/* check if the given number is present in the array or not\
 * NOTE : value of all the element in the array is less than 10 to the power 5*/

public class program14 {
	
	
	static int[] makeFrequencyArray(int[] arr) {
		int []freq = new int[100005];
		
		for(int i= 0;i<arr.length;i++) {
			freq[arr[i]]++;
		}
		return freq;
	}
	
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);	
	System.out.println("Enter array size :");
	int n  = scanner.nextInt();
	int[] arr = new int[n];
	
	System.out.println("Enter " + n + " elements :");
	for(int i =0;i<n;i++) {
		arr[i] = scanner.nextInt();
	}
	
	
	int freq[] = makeFrequencyArray(arr);
	
	System.out.println("Enter number of queries : ");
	int q = scanner.nextInt();
	
	while(q>0) {
		System.out.println("Enter number to be searched :");
		int x = scanner.nextInt();
		if(freq[x]>0) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		q--;
		
	}
	}

}
