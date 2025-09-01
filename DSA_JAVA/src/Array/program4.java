package Array;

//check if the given array is sorted or not

public class program4 {
	
	static boolean isSorted(int[] arr) {
		boolean check = true;
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<arr[i-1]) {
				check = false;
				break;
			}
		}
		
		return check;
	}
	
	public static void main(String[] args) {
		
//		int arr[] = {3,4,1,5,6,8,7};
		int arr[] = {1,5,6,8,9};
		
		System.out.println("is Sorted array : " + isSorted(arr));
		
	}

}
