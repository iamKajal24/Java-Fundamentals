package OOPS;

public class Array {
	public static void main(String[] args) {
//		int a[] = new int [5];
//		int a1[] = {1,2,3,4,5};

		int nums[] = { 3, 7, 2, 4 };
		nums[1] = 6;
		System.out.println(nums[1]);

		int num[] = new int[4];
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		num[3] = 40;
//		System.out.println(num[0]);
//		System.out.println(num[1]);
//		System.out.println(num[2]);
//		System.out.println(num[3]);

		for (int i = 0; i < 4; i++) {
			System.out.println(num[i]);
		}

	}
}
