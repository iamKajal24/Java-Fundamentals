/*write a program to display transpose of matrix entered by the user. */
//squre matrixes
/*example 3*3
 * 1 2 3         1 4 7
 * 4 5 6   -->   2 5 8
 * 7 8 9         3 6 9
 */


import java.util.Scanner;

public class program5 {

    static void printmatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] Findtransposed(int matrix[][],int r, int c){
        int ans[][] =new int[c][r];

        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                ans[i][j]= matrix[j][i];
            }
        }
       return ans;
    }

    static void transposedInplace(int matrix[][],int r, int c){

        for(int i=0;i<c;i++){
            for(int j=i;j<r;j++){
                //swap matrix[i][j] and matrix[j][i]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of matrix");
         int r = sc.nextInt();
         int c = sc.nextInt();
         int matrix[][] = new int[r][c];
         int totalElements= r *c;
        System.out.println("Enter" + totalElements + " elements of matrix");
        for(int i =0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]= sc.nextInt();
            }
        }

        System.out.println("Input matrix is :");
        printmatrix(matrix);

        System.out.println("Transpose of matrix is :");
        // int[][] ans = Findtransposed(matrix,r,c);
        // printmatrix(ans);
        
        transposedInplace(matrix, r, c);
        printmatrix(matrix);
        sc.close();
        
    }
    
}
