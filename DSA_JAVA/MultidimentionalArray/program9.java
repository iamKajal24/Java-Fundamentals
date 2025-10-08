/*Given a positive integer n, generate an n*n matrix filled with elements from 1 to n^2 in sprial order. */
/*example 
 * 3*3 matrix
 * 1 2 3
 * 8 9 4
 * 7 6 5
 * output : 1 2 3 4 5 6 7 8 9
 */

import java.util.Scanner;

public class program9 {

    static void printMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] generateSpiralMatrix(int n) {
        int[][] matrix = new int[n][n];
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;
        int curr = 1;

        while (curr <= n * n) {
            // top row (left to right)
            for (int j = left; j <= right && curr <= n * n; j++) {
                matrix[top][j] = curr++;
            }
            top++;

            // right column (top to bottom)
            for (int i = top; i <= bottom && curr <= n * n; i++) {
                matrix[i][right] = curr++;
            }
            right--;

            // bottom row (right to left)
            for (int j = right; j >= left && curr <= n * n; j--) {
                matrix[bottom][j] = curr++;
            }
            bottom--;

            // left column (bottom to top)
            for (int i = bottom; i >= top && curr <= n * n; i--) {
                matrix[i][left] = curr++;
            }
            left++;
        }

        return matrix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[][] matrix = generateSpiralMatrix(n);

        System.out.println("Generated Spiral Matrix:");
        printMatrix(matrix);

        System.out.println("Output in spiral order:");
        for (int i = 1; i <= n * n; i++) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}
