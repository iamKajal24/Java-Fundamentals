import java.util.Scanner;

public class DyanamicArrays3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        
        int arr[]= new int [5];

        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements are :");
        for(int elements :arr){
            System.out.print(elements + " ");
        }
    }
    
}
