package Array;

// find last occurrence of an element x in a given array
public class Program2 {

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");  // println -> print (better format)
        }
        System.out.println();
    }

    public static int lastOccurence(int arr[], int x) {
        int lastIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 2, 5, 2 };
        int x = 7;

        print(arr);
        int index = lastOccurence(arr, x);
        System.out.println("Last occurrence of " + x + " is at index: " + index);
    }
}
