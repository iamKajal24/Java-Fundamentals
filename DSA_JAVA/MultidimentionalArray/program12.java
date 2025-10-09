/*Sum of rectangle using prefix sum over both rows andd cols. */
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

public class program12 {

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
        if (l1 < 0 || r1 < 0 || l2 >= rows
                || r2 >= cols || l1 > l2 || r1 > r2) {
            System.out.println("Invalid boundaries!");
            return;
        }

        System.out.println("Rectangle sum is: " + rectangleSum(matrix, l1, r1, l2, r2));
    }

     static int  rectangleSum(int[][] matrix, int l1, int r1, int l2, int r2) {
        int ans =0;
        int sum =0, up =0,left=0,leftup=0;

        // convert each row into prefix-sum (horizontal)
        findPrefixSumMatrix(matrix);

        sum = matrix[l2][r2];
        if(r1 >=1){
            left = matrix[l2][r1-1];
        }

        if(l1 >=1){
            up = matrix[l1-1][r2];
        }
        if(l1 >=1 && r1 >=1){
            leftup = matrix[l1-1][r1-1];
        }

        ans = sum -up - left + leftup;
        return ans;
    }

    //calculate row wise and col wise prefix sum

     private static void findPrefixSumMatrix(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        // convert each row into prefix-sum (horizontal)
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                matrix[i][j] += matrix[i][j - 1];
            }
        }
        // convert each col into prefix-sum (vertical)
        for (int j = 0; j < c; j++) {
            for (int i = 1; i < r; i++) {
                matrix[i][j] += matrix[i - 1][j];
            }
        }
     }
    
}
