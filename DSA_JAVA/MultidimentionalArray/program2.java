import java.util.Scanner;

public class program2 {

    static void print2DArray(int arr[][]){
        for(int i=0;i<arr.length;i++){  //rows
            for(int j=0;j<arr[i].length;j++){ //columns
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:   ");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns:   ");
        int cols = sc.nextInt();

        int arr[][] = new int [rows][cols];

        System.out.println("Enter " + rows*cols + " elements:  ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        print2DArray(arr);
        sc.close();
        
    }
    
}
