public class BreakContinue {

    public static void main(String args[]){
        //break and continue using loops


       //using for loop
       /*  for(int i=1;i<=5;i++){
            System.out.println(i);
            System.out.println("java is great");

            if(i==3){
                System.out.println("ending the loop");
                break;
            }
        } */

            //using while loop
        // int i=1;
        // while(i<=5){
        //     System.out.println(i);
        //     System.out.println("Java is great");

        //     if(i==2){
        //         System.out.println("ending the loop");
        //         break;
        //     }
        //     i++;  
        // }


        //using do while loop
        // int i=1;
        // do{
        //     System.out.println(i);
        //     System.out.println("Java is great");

        //     if(i==2){
        //         System.out.println("ending the loop");
        //         break;
        //     }
        //     i++;
        // }while(i<=5);

        //using for loop with continue
        for(int i=1;i<=5;i++){
            if (i==2){
                System.out.println("skipping the iteration");
                continue;
            }
            System.out.println(i);
            System.out.println("java is great");
        }
        System.out.println("loop ended successfully");


    }
    
}
