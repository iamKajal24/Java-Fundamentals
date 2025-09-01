package Array;

class Demo {

//	void maxi() {
//
//		int max[] = { 5, 3, 7, 9, 2, 4 };
//
//		// Best practice: ans ko array ke first element se initialize karo
//		// taki agar array me negative numbers ho to bhi sahi result aaye.
//		int ans = max[0];
//
//		// Loop through all elements
//		for (int i = 1; i < max.length; i++) { // 0 se start karoge to bhi chalega, lekin 1 se efficient hai
//			if (max[i] > ans) { // agar current element ans se bada hai
//				ans = max[i]; // to ans ko update karo
//			}
//		}
//
//		// Largest value print karo
//		System.out.println("Maximum value in array: " + ans);
//	}
//
//	void mini() {
//		int min[] = { 5, 3, 7, 9, 2, 4 };
//
//		int ans1 = min[0];
//
//		for (int i = 1; i < min.length; i++) {
//			if (min[i] < ans1) {
//				ans1 = min[i];
//			}
//		}
//		System.out.println("Minimum value in array : " + ans1);
//	}

	void maxmin() {
	    int arr[] = {5, 3, 7, 9, 2, 4};

	    int ans = arr[0];  // max
	    int ans1 = arr[0]; // min

	    for (int i = 1; i < arr.length; i++) {
	        if (arr[i] > ans) {
	            ans = arr[i]; // max update
	        }
	        if (arr[i] < ans1) {
	            ans1 = arr[i]; // min update
	        }
	    }

	    System.out.println("Maximum value in array :" + ans);
	    System.out.println("Minimum value in array :" + ans1);
	}
}

public class maximumValue {

	public static void main(String[] args) {
		Demo demo = new Demo();
//		demo.maxi();
//		demo.mini();

		demo.maxmin();
	}
}
