public class program1 {

    static void print2DArray(int arr[][]){
        for(int i=0;i<arr.length;i++){  //rows
            for(int j=0;j<arr[i].length;j++){ //columns
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        //declaration and initialization of 2D array
        //int [][]arr = new int[2][3];

        //declaration and initialization of 2D array
        int arr[][] = { { 1, 5, 6 }, { 7, 9, 11 }, { 8, 1, 9 } };
       
       print2DArray(arr);
    }
}