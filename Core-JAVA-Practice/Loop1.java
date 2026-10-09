public class Loop1 {

    public static void main(String[] args) {

        // loop-> while loop -> infinite

        // int i = 1;

        // while (i <= 10) {
        // System.out.println(i);
        // i++;
        // }

        // int j = 10;
        // while (j >= 1) {
        // System.out.println(j);
        // j--;
        // }

        // do-while

        // do {
        // System.out.println(i);
        // i++;
        // } while (i <= 10);

        // menu iten selection -> do-while
        /*
         * play game
         * Return saved
         * Exit
         */

        // for loop

        // for (i = 1; i <= 10; i++) {
        // System.out.println(i);
        // }

        /*
         * flow of control of for
         * 1. First assinment statement is executed (variable definition).
         * 2. Then second conditional statement is evaluated.(true/false)
         * 3. If true, control flow will evaluate the body of the loop.
         * 4. Once loop body is finished , control flow will goo back to the
         * for statement, and third increment statement will be evaluated.
         * 5. Again, conditional statement is evaluated.
         * 6. repeat 2-5 .
         */

        // Comma seprated variation
        // for(int i = 1, j = 1; i <= 10 && j <= 5; i++, j+=2) {
        // System.out.println(i * j);
        // }

        // boolean b = true;
        // for(int i=1; b == true; i++) {
        // if(condition) {
        // b = false;
        // }
        // }

        // Integers -> byte, short, int, long

        // for(int i = 1; i <= 10; i++) {
        // System.out.println(i);
        // }

        // Nested Loops
        // for (int i = 1; i <= 10; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        /*
         * i = 2
         * 
         * *
         * * *
         * * * *
         * * * * *
         * 
         */

        // Jump Statements in Java
        // break, continue

           // Whether a number is prime or not
        //  int p = 9;

        // // 2, 3, 4, 5, .... 6, 7

        // int i;
        // for(i = 2; i < p; i++) {
        //     if(p % i == 0) {
        //         System.out.println("The number is not prime");
        //         break;
        //     }
        // }
        
        // if(i == p) {
        //     System.out.println("The number is prime");
        // }

        //continue

           // for(int i=1; i<=10; i++) {

        //     if(i % 2 == 0) {
        //         continue;
        //     }

        //     System.out.println(i);
        // }

         // Break in nested loops
        // for(int i = 1; i<= 10; i++) {
        //    for(int j = 1; j <= i; j++) {
        //         System.out.print("* ");

        //         if(j >= 5) {
        //             continue;
        //         }
        //    }

        //    System.out.println();
        // }

          // Labels
        // outer: for(int i = 1; i<= 10; i++) {
        //    inner: for(int j = 1; j <= i; j++) {
        //         System.out.print("* ");

        //         if(j >= 5) {
        //             break outer;
        //         }
        //    }

        //    System.out.println();
        // }


         // Code blocks
        first: {
            second: {
                third: {
                    System.out.println("Hello");
                    break first;
                }
            }
        }

    }

}
