//addition of 2 matrices

import java.util.Scanner;

public class program3 {

    static void print2DArray(int arr[][]){
        for(int i=0;i<arr.length;i++){  //rows
            for(int j=0;j<arr[i].length;j++){ //columns
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void add(int[][]a, int row1,int col1,int[][]b,int row2,int col2){
        if(row1!=row2 || col1!=col2){
            System.out.println("Wrong Input - Addition not possible");
            return;
        }

        int res[][] = new int[row1][col1];
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                res[i][j] =a[i][j] + b[i][j];
            }
        }

        System.out.println("Resultant matrix after addition is: ");
        print2DArray(res);


    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter number of rows and col for first matrix:   ");
        int row1 = sc.nextInt();
        int col1 = sc.nextInt();
        int a[][] = new int [row1][col1];
        System.out.println("Enter matrix values");
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter number of rows and col for second matrix:   ");
        int row2 = sc.nextInt();
        int col2 = sc.nextInt();
        int b[][] = new int [row2][col2];
        System.out.println("Enter matrix values");
        for(int i=0;i<row2;i++){
            for(int j=0;j<col2;j++){
                b[i][j] = sc.nextInt();
            }
        }
       
        System.out.println("matrix A is: ");
        print2DArray(a);
        System.out.println("matrix B is: ");
        print2DArray(b);

       
        add(a, row1, col1, b, row2, col2);
        sc.close();
        
    }
    
}
