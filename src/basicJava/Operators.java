package basicJava;

public class Operators {
	public static void main(String args[]) {
		int num1 = 7;
		int num2 = 6;

		// Airthmetic Operator
		System.out.println("Airthmetic Operator...");
		int result = num1 + num2;
		int result1 = num1 - num2;
		int result2 = num1 * num2;
		int result3 = num1 / num2;
		int result4 = num1 % num2;
		System.out.println("add " + result);
		System.out.println("sub " + result1);
		System.out.println("mul " + result2);
		System.out.println("div " + result3);
		System.out.println("mod " + result4);

		// increment
		// num1 = num1+1;
		// num1 +=1;
		// num1++; //post increment -> fetch the value and then increment
		++num1; // pre increment -> increment the value and then fetch
		System.out.println(num1);

		// decrement
		// num1--; post decrement
		--num1; // pre decrement
		System.out.println(num1);

		// Relational Operator
		System.out.println("Relational Operator...");

		int x = 6;
		int y = 5;

		boolean res = x < y;
		System.out.println(res);

		boolean res1 = x > y;
		System.out.println(res1);

		boolean res3 = x != y;
		System.out.println(res3);

		boolean res4 = x == y;
		System.out.println(res4);

		boolean res5 = x >= y;
		System.out.println(res5);

		boolean res6 = x <= y;
		System.out.println(res6);

		// logical Operator

		System.out.println("Logical Operator...");

		// AND both condition is true
		// OR operator in atleast on econdition is true

		int p = 7;
		int q = 5;
		int r = 5;
		int s = 9;

		boolean ans = p > q && r < s;
		System.out.println(ans);

		boolean ans1 = p > q || r < s;
		System.out.println(ans1);
	}
}
