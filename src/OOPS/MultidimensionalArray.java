package OOPS;

public class MultidimensionalArray {
	public static void main(String[] args) {

		int[][] nums = new int[3][4];
//		nums[0][0] = 5;
//		nums[0][1] = 6;
//		nums[0][2] = 3;
//		nums[1][0] = 7;
//		nums[1][1] = 8;
//		nums[1][2] = 4;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				nums[i][j] = (int) (Math.random() * 100);
				// System.out.println(nums[i][j]);
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println(".........");
		for (int n[] : nums) {
			for (int m : n) {
				System.out.print(m + " ");
			}
			System.out.println();
		}
	}

}
