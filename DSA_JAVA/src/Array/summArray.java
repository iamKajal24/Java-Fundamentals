package Array;

class SumOfArray {

	void summ() {
		int arr[] = { 1, 5, 3 };
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];

		}
		System.out.println(sum);
	}

	void sub() {
		int arr1[] = { 45, 89 };

		int sub = arr1[0];

		for (int i = 1; i < arr1.length; i++) {
			sub = sub - arr1[i];
		}
		System.out.println(sub);
	}

	void mul() {
		int arr2[] = { 2, 3, 4 };
		int mul = arr2[0];

		for (int i = 1; i < arr2.length; i++) {
			mul = mul * arr2[i];
		}
		System.out.println(mul);
	}
}

public class summArray {

	public static void main(String[] args) {

		SumOfArray s1 = new SumOfArray();

		s1.summ();

		s1.sub();

		s1.mul();
	}
}