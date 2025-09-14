
/*Given ana array of interger of size n. Answer q queries where you
 * need to print the sum of values in a given range of indices from 1 to r(both include)
 * Note : The values of 1 and r in queries follow 1-based indexing.
  */

import java.util.Scanner;

public class program2 {

    static void printArray(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    static int[] makePrefixSumArray(int arr[]){
        
        for(int i =1; i<arr.length;i++){
            //arr[i] += arr[i-1];
            arr[i] = arr[i-1]+arr[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = scanner.nextInt();
        
        int arr[] = new int[n+1];

        System.out.println("Enter " + n + " elements");
        for(int i =1 ;i<=n;i++){
            arr[i] = scanner.nextInt();
        }

        int prefSum[] = makePrefixSumArray(arr);

        System.out.println("Enter number of queries :");
        int q = scanner.nextInt();

        while(q-- >0){
            System.out.println("Enter range");
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            int sum = prefSum[r] - prefSum[l-1];
            System.out.println("answer is :" + sum);
        }


    }
    
}
