public class Arrays {

    public static void main(String[] args) {

        // int arr[] = { 1, 2, 3, 4, 5 };
        // for (int roll : arr) {
        // System.out.println(roll);
        // }

        // int rollNum[] = new int[3];
        // rollNum[0] = 1;
        // rollNum[1] = 2;
        // rollNum[2] = 3;
        // for (int i = 0; i < rollNum.length; i++) {
        // System.out.println(rollNum[i]);
        // }

        int rollNo[] = new int[5];
        int x = 101;
        for (int i = 0; i < rollNo.length; i++) {

            rollNo[i] = x;
            x++;

        }
        for (int i = 0; i < rollNo.length; i++) {
            System.out.println(rollNo[i]);
           
        }
         System.out.println(rollNo.length);

    }

}
