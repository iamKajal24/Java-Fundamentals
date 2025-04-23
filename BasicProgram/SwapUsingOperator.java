package BasicProgram;

public class SwapUsingOperator {

	static void swap(int m, int n) {

		m = m ^ n;
		n = m ^ n;
		m = m ^ n;

		System.out.println("value of m is  = " + m + " value of n is = " + n);
	}

	public static void main(String[] args) {

		int m = 7;
		int n = 5;

		swap(m, n);
	}

}
