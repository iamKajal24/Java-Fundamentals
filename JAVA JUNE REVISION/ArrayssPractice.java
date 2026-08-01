public class ArrayssPractice {

    public static void main(String args[]){

        /*problem 1 */

        float arr[]={1.2f,3.4f,6.7f,2.3f,2.2f};
        float sum=0;
        for (int i=0;i<arr.length;i++){
            sum= sum+arr[i];
        }
        System.out.println(sum);

        /*problem 2 */

        int arr1[] = {45,62,97,10,12,56};

        int search =62;
        boolean found = false;

        for(int i=0;i<arr1.length;i++){
          if(arr1[i]==search){
            found = true;
            break;
          }
    }
    if(found){
        System.out.println(search + " is present in the array");
    }
    else{
        System.out.print(search +"is not present in the array");
    }

    /*problem 3 */
    float []marks={45.9f,98.6f,89.0f,45.8f,34.8f};
    float summ=0;

    for(float element:marks){
        summ=summ+element;
    }
    System.out.println("average marks : = " + summ/marks.length );


}

}
