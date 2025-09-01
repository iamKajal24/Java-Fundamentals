package Array;

class ArrayEx {

	void demoArrays() {
		int[] ages = new int[3];
		float[] weight = new float[3];
		String[] name = new String[2];

		ages[0] = 12;
		ages[1] = 16;
		ages[2] = 23;
		// ages[3]=45; // ❌ ArrayIndexOutOfBoundsException: index 3 out of bounds for
		// length 3

		System.out.println(ages[0]);
		System.out.println(ages[1]);
		System.out.println(ages[2]);
		// System.out.println(ages[3]);

		System.out.println("*****for loop*********");

		for (int i = 0; i < 3; i++) {
			System.out.println(ages[i]);
		}

		System.out.println("*********for each loop*******");

		for (int age : ages) {
			System.out.println(age);
		}

		System.out.println("******while loop*********");
		int i = 0;
		while (i < 3) {
			System.out.println(ages[i]);
			// i = i+1;
			i++;
		}

		System.out.println("**********weight**********");

		weight[0] = 12.9f;
		weight[1] = 59.95f;
		weight[2] = 60.00f;
		// weight[3]=78.06f; // ❌ ArrayIndexOutOfBoundsException

		System.out.println(weight[0]);
		System.out.println(weight[1]);
		System.out.println(weight[2]);
		// System.out.println(weight[3]);

		System.out.println("***********names************");

		// ✅ Correct String array initialization
		name = new String[] { "Kajal", "Riya" };
		System.out.println(name[0]);
		System.out.println(name[1]);

		System.out.println("************length***********");
		System.out.println("kajal " + name[0].length());
		System.out.println("Riya " + name[1].length());

		// 💡 NOTE: In Java, arrays have a fixed length once created.
		// Accessing or assigning beyond the last index will cause an
		// ArrayIndexOutOfBoundsException.
	}

	void multiArrays() {
		// int [][]arr = new int[5][3];

		int[][] arr = { { 23, 34, 12 }, { 13, 10, 45 } };

//		System.out.println(arr[0][0]); // 23
//		System.out.println(arr[0][1]); // 34
//		System.out.println(arr[0][2]); // 12
//
//		System.out.println(arr[1][0]); // 13
//		System.out.println(arr[1][1]); // 10
//		System.out.println(arr[1][2]); // 45
//
//		System.out.println(arr[2][0]); // 1
//		System.out.println(arr[2][1]); // 2
//		System.out.println(arr[2][2]); // 4

//		for (int i = 0; i < 2; i++) {
//			for (int j = 0; j < 3; j++) {
//				System.out.println(arr[i][j]);
//			}
//		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}

	}
}

public class Array1 {

	public static void main(String[] args) {
		ArrayEx ex = new ArrayEx();
		ex.demoArrays();

		ex.multiArrays();
	}
}
