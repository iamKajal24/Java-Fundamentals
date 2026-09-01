public class IfElseExample {

    public static void main(String[] args) {

        /*
         * ============================================================
         *                    IF-ELSE STATEMENT
         * ============================================================
         *
         * if-else ka use tab hota hai jab humein do possible
         * situations mein se ek ko execute karna ho.
         *
         * Agar condition TRUE  → if block execute hoga.
         *
         * Agar condition FALSE → else block execute hoga.
         *
         * ============================================================
         */


        // ------------------------------------------------------------
        // SYNTAX OF IF-ELSE
        // ------------------------------------------------------------

        /*
         *
         * if (condition) {
         *
         *     // condition TRUE hone par ye code execute hoga
         *
         * } else {
         *
         *     // condition FALSE hone par ye code execute hoga
         *
         * }
         *
         */


        // ============================================================
        // EXAMPLE 1: Check whether a person is eligible to vote
        // ============================================================

        int age = 16;

        if (age >= 18) {

            // Agar age 18 ya usse zyada hai
            // to ye block execute hoga.

            System.out.println("Eligible to vote");

        } else {

            // Agar age 18 se kam hai
            // to ye block execute hoga.

            System.out.println("Not eligible to vote");
        }


        /*
         * Current value:
         *
         * age = 16
         *
         * Condition:
         *
         * 16 >= 18 → false
         *
         * Isliye IF block skip hoga
         * aur ELSE block execute hoga.
         *
         * Output:
         *
         * Not eligible to vote
         */


        // ============================================================
        // EXAMPLE 2: Check whether a number is positive or negative
        // ============================================================

        int number = -10;

        if (number >= 0) {

            // Condition TRUE hone par
            // number positive ya zero hai.

            System.out.println("Number is positive");

        } else {

            // Condition FALSE hone par
            // number negative hai.

            System.out.println("Number is negative");
        }


        /*
         * number = -10
         *
         * Condition:
         *
         * -10 >= 0 → false
         *
         * Therefore ELSE block execute hoga.
         *
         * Output:
         *
         * Number is negative
         */


        // ============================================================
        // EXAMPLE 3: Check whether student passed or failed
        // ============================================================

        int marks = 35;

        if (marks >= 40) {

            // Marks 40 ya usse zyada hain
            // to student PASS hai.

            System.out.println("Student is Pass");

        } else {

            // Marks 40 se kam hain
            // to student FAIL hai.

            System.out.println("Student is Fail");
        }


        /*
         * marks = 35
         *
         * Condition:
         *
         * 35 >= 40 → false
         *
         * ELSE block execute hoga.
         *
         * Output:
         *
         * Student is Fail
         */


        // ============================================================
        // EXAMPLE 4: Check even or odd number
        // ============================================================

        int num = 10;

        /*
         * % is the modulus operator.
         *
         * num % 2 gives the remainder after dividing num by 2.
         *
         * If remainder = 0 → Even
         * If remainder != 0 → Odd
         */

        if (num % 2 == 0) {

            // 10 % 2 = 0
            // Condition TRUE

            System.out.println("Number is Even");

        } else {

            // Condition FALSE hone par
            // number Odd hoga.

            System.out.println("Number is Odd");
        }


        /*
         * 10 % 2 = 0
         *
         * 0 == 0 → true
         *
         * Therefore IF block execute hoga.
         *
         * Output:
         *
         * Number is Even
         */


        // ============================================================
        // IMPORTANT POINTS
        // ============================================================

        /*
         * 1. if condition TRUE hone par if block execute hota hai.
         *
         * 2. if condition FALSE hone par else block execute hota hai.
         *
         * 3. if-else mein ek time par sirf ONE block execute hota hai.
         *
         * 4. else ke saath condition nahi likhte.
         *
         * 5. else hamesha if ke saath associated hota hai.
         *
         */


        // ============================================================
        // SIMPLE FLOW
        // ============================================================

        /*
         *
         *              Condition
         *                  |
         *          -----------------
         *          |               |
         *        TRUE            FALSE
         *          |               |
         *       IF BLOCK       ELSE BLOCK
         *          |               |
         *          --------|--------
         *                  |
         *              Continue
         *
         */

    }
}