package BasicProgram;

public class SwapUsingAirthMeticOperator {

	public static void main(String[] args) {
		int a = 10, b = 22;

		System.out.println("Before swapping value of a is = " + a + " and value of b is = " + b);

		a = (a + b) - (b = a);
		System.out.println("After swapping value of a is = " + a + " and value of b is = " + b);
	}
}
