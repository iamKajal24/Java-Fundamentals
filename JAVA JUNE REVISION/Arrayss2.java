public class Arrayss2 {

    public static void main(String[] args) {
        
        int marks[]={50,60,70,80,90};//declaration, instantiation and initialization
         
        System.out.println(marks.length);//length of the array
        System.out.println(marks[2]);//accessing the elements of specified index
        

        //displaying the array elements using for loop
        System.out.println("Array elements are :");
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+ " ");
        }

        System.out.println("\nReversing the array elements :");
        //displaying the array elements in reverse order
        for(int i=marks.length-1;i>=0;i--){
            System.out.print(marks[i] + " ");
        }

        //displaying the array elements using for-each loop
        System.out.println("\nArray elements using for-each loop :");
        for (int element : marks){
            System.out.print(element+" ");
        }
    }
    
}
