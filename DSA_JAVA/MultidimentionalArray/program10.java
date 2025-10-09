/*Sum of rectangle using brute force approach. */   
/*Ques-  Given a matrix 'a' of dimension n *m and 2 coordinates (l1,r1) and
 * (l2,r2). Return the sum of the rectangle from(l1,r1) to (l2,r2).
 */

 /*example 
  * matrix
    * 1 2 3
    * 4 5 6
    * 7 8 9
    * l1=0,r1=0
    * l2=1,r2=1
    * output : 1+2+4+5=12
    */

import java.util.Scanner;

public class program10 {

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
        for (int i = l1; i <= l2; i++) {       // <= to include l2
            for (int j = r1; j <= r2; j++) {   // <= to include r2
                sum += matrix[i][j];
            }
        }
        return sum;
    }
}

