/*Given an integer m, return the first n rows of Pascal's triangle.
 * In Pascal's triangle, each number is the sum of the two numbers directly above it
 * as shown:
 * for n =5
 * exmple :
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 * 1 4 6 4 1
 */

 /*
    is code ka step by step dry run
    * for n=4
    * i=0
    * ans = [[1],[],[],[],[]]
    * i=1
    * ans = [[1],[1,1],[],[],[]]
    * i=2
    * ans = [[1],[1,1],[1,2,1],[],[]]
    * i=3
    * ans = [[1],[1,1],[1,2,1],[1,3,3,1],[]]
    * i=4
    * ans = [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]] 
    * finally return ans
 */

import java.util.Scanner;

public class program7 {

    static void printmatrix(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] pascal(int n){
        // create a 2D array
        int ans[][] =new int[n][];
        //outer loop
         for(int i =0;i<n;i++){
            //ith row has i+1 elements
            ans[i] = new int[i+1];
            //first and last element of each row is 1
            ans[i][0] = ans[i][i] =1;
            //filling the inner elements
            for(int j=1;j<i;j++){
                //ans[i][j] = sum of two elements above it
                ans[i][j] = ans[i-1][j]+ ans[i-1][j-1];
            }
         }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number of rows");
        int n = sc.nextInt();
        int [][] ans = pascal(n);
        printmatrix(ans);
        
    }
    
}
