package Array;

//count the number of element strictly greater than value x.

public class program3 {
	
	 public static int greaterNumber(int[] arr, int x) {
	        if (arr == null || arr.length == 0) return 0;

	        int count = 0;
	        for (int val : arr) {
	            if (val > x) {
	                count++;
	            }
	        }
	        return count;
	    }

	    public static void main(String[] args) {
	        int arr[] = {1, 3, 4, 2, 5, 6};
	        int x = 4;
	        System.out.println("greater number : " + greaterNumber(arr, x));
	}

}
