package Array;



/* Given 2 integer a and b . Swap the 2 given values using tempary variables*/

public class Program11 {

	public static void swap(int a, int b) {
		System.out.println("Original values before swap : ");
		System.out.println("a values : " + a + " b values : " + b);

		int temp = a;
		a = b;
		b = temp;

		System.out.println("after swap values : ");
		System.out.println("a values : " + a + " , " + " b values : " + b);

	}
	
	public static void swapWithoutTemp(int a ,int b) {
		
		System.out.println("without Temp Variable used :");
		a = a+b;
		b=a-b;
		a = a-b;
		
		System.out.println("after swap values : ");
		System.out.println("a values : " + a + " , " + " b values : " + b);
		
	}
	

	public static void main(String[] args) {

		int a = 9;
		int b = 3;
		int arr[] = { 1, 2, 3, 4, 5 };

		swap(a, b);
		swapWithoutTemp(a, b);

	}

}
