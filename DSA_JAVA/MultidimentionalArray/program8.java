/*Given an nxm matrix 'a', return all elements of the matrix in spiral order. */

/*example : 
 * 3*3 marix
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * output : 1 2 3 6 9 8 7 4 5
 
 */

import java.util.Scanner;

public class program8 {

    static void printMatrix(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void sprialOrder(int matrix[][], int row,int col){
        int toprow=0,bottomrow = row-1,leftcol =0,rightcol=col-1;
        int totalElements = 0;
        while(totalElements < row*col){
            //top ROW-> left to right
            for(int j = leftcol;j<=rightcol && totalElements<row*col;j++){
                System.out.print(matrix[toprow][j] + " ");
                totalElements++;
            }
             toprow++;
            

            //right COL -> top to bottom
            for(int i=toprow;i<=bottomrow && totalElements<row*col;i++){
                System.out.print(matrix[i][rightcol] + " ");
                totalElements++;
            }
            rightcol--;

            //bottom ROW -> right to left
            for(int j=rightcol;j>=leftcol && totalElements<row*col;j--){
                System.out.print(matrix[bottomrow][j] + " ");
                totalElements++;
            }
            bottomrow--;

            //left COL -> bottom to top
            for(int i=bottomrow;i>=toprow && totalElements<row*col;i--){
                System.out.print(matrix[i][leftcol] + " ");
                totalElements++;
            }
            leftcol++;
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];

        int total = row * col;

        System.out.println("enter " + total + " elements : ");

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Input matrix is : ");
        printMatrix(matrix);

        System.out.println("Spiral order is : ");
        sprialOrder(matrix, row, col);
        sc.close();
        
    }
    
}
