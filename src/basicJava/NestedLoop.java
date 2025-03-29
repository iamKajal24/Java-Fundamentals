package basicJava;

public class NestedLoop {

	public static void main(String args[]) {
//		System.out.println("Hi");
//		System.out.println("Hi");
//		System.out.println("Hi");
//		System.out.println("Hi");
//		System.out.println("Hi");

		// repeat this statement 4 times
		// loop - while , do while,for
		// 100-condition

		// for loop
		for (int i = 1; i <= 4; i++) {
			System.out.println("Hi " + i);
		}

		// while loop
		int i = 1;
		while (i <= 4) {
			System.out.println("Hello " + i);
			int j = 1;
			while (j <= 4) {
				System.out.println("Namstey + j");
				j++;
			}
			i++;
		}
		System.out.println("Bye " + i);
	}
}
