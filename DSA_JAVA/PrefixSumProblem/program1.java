import java.util.Scanner;

/* Given an integer array 'a' , return the prefix sum/running sum in the same array without creating a new array.*/

public class program1 {

    // Function to print the array
	
	static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
    // Function to make prefix sum array in the different array

	// static int[] makePrefixSumArray(int arr[]) {
	// 	int n = arr.length;
	// 	int [] pref = new int[n];
	// 	pref[0]=arr[0];
		
	// 	for(int i =1;i<n;i++) {
	// 		pref[i] = pref[i-1]+ arr[i];
	// 	}
		
	// 	return pref;
	// }

    // Function to make prefix sum array in the same array
      static int [] makePrefixSumArray(int arr[]){
        int n = arr.length;
        for(int i =1;i<n;i++){
            arr[i] =arr[i-1]+arr[i];
        }
        return arr;

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
		
		System.out.println("Input array :");
		printArray(arr);
		
		int []pref = makePrefixSumArray(arr);
        System.out.println("\nPrefix sum array :");
		printArray(pref);
	}
	
	

}
