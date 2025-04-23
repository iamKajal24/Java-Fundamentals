package JavaPatternProgram;

public class ReversePyramidStar {

	public static void main(String[] args) {

		int rows = 7;
		int stars = 13;

		for (int i = 0; i < rows; i++) {

			for (int s = 0; s < i; s++) {
				System.out.print(" ");
			}

			for (int j = 0; j < stars - (2 * i); j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}
}
