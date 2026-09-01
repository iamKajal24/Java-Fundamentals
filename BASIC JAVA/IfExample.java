public class IfExample {

    public static void main(String[] args) {

        /*
         * ============================================================
         *                      IF STATEMENT
         * ============================================================
         *
         * if statement ka use kisi condition ko check karne ke liye
         * kiya jata hai.
         *
         * Agar condition TRUE hai:
         *     if ke andar ka code execute hoga.
         *
         * Agar condition FALSE hai:
         *     if ke andar ka code execute nahi hoga.
         *
         * ============================================================
         */


        // ------------------------------------------------------------
        // Example 1: Check whether a person is eligible to drive
        // ------------------------------------------------------------

        int age = 16;

        /*
         * Condition:
         *
         * age >= 18
         *
         * Iska meaning:
         * age 18 ya usse greater honi chahiye.
         */

        if (age >= 18) {

            // Ye statement tabhi execute hogi
            // jab condition TRUE hogi.

            System.out.println("Rahul can drive");

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
         * Isliye if ke andar ka code execute nahi hoga.
         *
         * Output:
         * Kuch bhi print nahi hoga.
         */


        // ------------------------------------------------------------
        // Example 2: Condition TRUE
        // ------------------------------------------------------------

        int age2 = 25;

        if (age2 >= 18) {

            System.out.println("Rahul can drive");

        }

        /*
         * age2 = 25
         *
         * Condition:
         *
         * 25 >= 18 → true
         *
         * Isliye if ke andar ka code execute hoga.
         *
         * Output:
         *
         * Rahul can drive
         */


        // ------------------------------------------------------------
        // IF STATEMENT SYNTAX
        // ------------------------------------------------------------

        /*
         *
         * if (condition) {
         *
         *     // code
         *
         * }
         *
         *
         * Important:
         *
         * 1. if ke baad condition parentheses () mein hoti hai.
         *
         * 2. Condition ka result boolean hona chahiye:
         *    true ya false.
         *
         * 3. Condition TRUE hone par
         *    if block execute hota hai.
         *
         */


        // ------------------------------------------------------------
        // Example 3: Check whether number is positive
        // ------------------------------------------------------------

        int number = 10;

        if (number > 0) {

            System.out.println("Number is positive");

        }

        /*
         * 10 > 0 → true
         *
         * Output:
         *
         * Number is positive
         */


        // ------------------------------------------------------------
        // Example 4: Check whether marks are greater than 40
        // ------------------------------------------------------------

        int marks = 75;

        if (marks >= 40) {

            System.out.println("Student is Pass");

        }

        /*
         * 75 >= 40 → true
         *
         * Output:
         *
         * Student is Pass
         */

    }
}