public class practicsLoop {

    public static void main(String args[]){

        //problem number 1
        int n=5;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
               System.out.print("*");
            }
            System.out.print("\n");
        }


         //problem number 2
        System.out.println("even numbers from 1 to 10");
         int n1=1;
         while(n1<=10){
            if(n1%2==0){
                System.out.println(n1);
            }
            n1++;
         }

         //problem number 3
         System.out.println("first sum of even numbers");
        //  int sum=0;
        //  int n2=1;
        //  while(n2<=50){
        //     sum=sum+n2;
        //    // System.out.println(sum);
        //     n2++;
        //  }
        //  System.out.println("Sum of first 3 even numbers: " + sum);

        //or
        
        int sum=0;
        int n2=1;
        while(n2<=3){
            sum=n2*(n2+1)/2;
           // System.out.println("Sum of first " + n2 + " even numbers: " + sum);
            n2++;
        }
        System.out.println("Sum of first 3 even numbers: " + sum);

      //problem number 4
      System.out.println("factorial number");
      int fact=1;
      int n3=4;
      while(n3>=1){
        fact=fact*n3;
        n3--;
      }
      System.out.println("Factorial of 5 is: " + fact);


      //problem 5
      System.out.println("multiplication table of 5");
      int n4=5;
      int i=1;
      while(i<=10){
        System.out.println(n4*i);
        i++;
      }
    }
}
