//write a program to display mulltiplication of two matrices entered by the user.

import java.util.Scanner;

public class program4 {

    static void print2DArray(int arr[][]){
        for(int i=0;i<arr.length;i++){  //rows
            for(int j=0;j<arr[i].length;j++){ //columns
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void mulltiplicationofMatrics(int a[][],int r1,int c1,int [][]b,int r2,int c2){
        if(c1!=r2){
            System.out.println("Wrong Input - Multiplication not possible");
            return;
        }

        int mul[][]= new int[c1][r2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k =0;k<c1;k++){
                    mul[i][j] += a[i][k]*b[k][j];
                }
            }
        }
        System.out.println("Multiplication of 2 matrices is:");
        print2DArray(mul);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows for first matrix:   ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int a[][] = new int [r1][c1];
        System.out.println("enter matrics values");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter number of rows for second matrix:   ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int b[][] = new int [r2][c2];
        System.out.println("enter matrics 2 elements");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("matrics 1 is");
        print2DArray(a);
        System.out.println("matrics 2 is");
        print2DArray(b);

        mulltiplicationofMatrics(a, r1, c1, b, r2, c2);
        sc.close();
    }
    
}
