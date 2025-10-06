/*given a square matrix, turn it by 90 degrees in a clockwise direction without using any extrra space. */
/*example 3 *3 
 * 1 2 3         7 4 1
 * 4 5 6   -->   8 5 2
 * 7 8 9         9 6 3
 */
import java.util.Scanner;

public class program6 {

    static void printmatrix(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void tranposeMatrix(int matrix[][],int r, int c){
        for(int i=0;i<c;i++){
            for(int j=i;j<r;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    static void reverseRow(int arr[]){
        int i =0,j=arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    static void rotate(int matrix[][],int n){
             //transpose of matrix
             tranposeMatrix(matrix, n, n);
             // reverse each row of transposed matrix
             for(int i=0;i<n;i++){
                reverseRow(matrix[i]);
             }

    }

    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of matrix");
         int r = sc.nextInt();
         int c = sc.nextInt();
         int matrix[][] = new int[r][c];
         int totalElements= r *c;
         System.out.println("Enter " + totalElements + " elements of matrix");
         for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j] = sc.nextInt();
            }
         }

         System.out.println("Input matrix is :");
         printmatrix(matrix);

         rotate(matrix, r);
         
         System.out.println("Rotation of matrix:");
         printmatrix(matrix);
            //step 1: find transpose of matrix
        
    }
    
}
