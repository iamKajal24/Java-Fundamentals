package basicJava;

public class ConditionalStatement {

	public static void main(String args[]) {

		int x = 8;
		int y = 7;
		int z = 6;

		// if statement
		if (x > 10) {
			System.out.println("Hello");
		}

		// if-else statement
		if (x > 10 && x <= 20) {
			System.out.println("Hello");
		} else {
			System.out.println("Bye");
		}

		// if-else-if

		if (x > y && x > z) {
			System.out.println(x);
		} else if (y > x && y > z) {
			System.out.println(y);
		} else {
			System.out.println(z);
		}

		// ternary Operator
		int n = 4;
		int result = 0;

//		if(n%2==0) 
//			result =10;
//		else 
//			result = 20;
//       ?:

		result = n % 2 == 0 ? 10 : 20;
		System.out.println(result);

	}
}
