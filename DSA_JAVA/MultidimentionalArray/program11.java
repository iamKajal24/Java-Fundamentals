import java.util.Scanner;

public class program11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and cols of matrix :");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int matrix[][] = new int[rows][cols];
        System.out.println("Enter " + (rows * cols) + " elements (row-wise):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter rectangle boundaries as: l1 r1 l2 r2 (0-based, inclusive):");
        // <-- READ IN CORRECT ORDER: l1, r1, l2, r2
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        // basic validation
        if (l1 < 0 || r1 < 0 || l2 >= rows || r2 >= cols || l1 > l2 || r1 > r2) {
            System.out.println("Invalid boundaries!");
            return;
        }

        System.out.println("Rectangle sum is: " + rectangleSum(matrix, l1, r1, l2, r2));
    }

    static int rectangleSum(int[][] matrix, int l1, int r1, int l2, int r2) {
        int sum = 0;

        // convert each row into prefix-sum (horizontal)
        findPrefixSumMatrix(matrix);

        // NOTE: use <= to include l2 and r2 (inclusive boundaries)
        for (int i = l1; i <= l2; i++) {
            if (r1 >= 1) {
                sum += matrix[i][r2] - matrix[i][r1 - 1];
            } else {
                sum += matrix[i][r2];
            }
        }

        return sum;
    }

    private static void findPrefixSumMatrix(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                matrix[i][j] += matrix[i][j - 1];
            }
        }
    }
}
