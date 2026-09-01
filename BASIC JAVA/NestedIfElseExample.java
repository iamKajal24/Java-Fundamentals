public class NestedIfElseExample {

    public static void main(String[] args) {

        /*
         * ============================================================
         *                  NESTED IF-ELSE
         * ============================================================
         *
         * Nested if-else ka matlab:
         *
         * Ek if/else block ke andar doosra if/else block.
         *
         * Simple words:
         *
         *     if ke andar if
         *
         * ============================================================
         */


        // ============================================================
        // EXAMPLE 1: Voting Eligibility + Indian Citizenship
        // ============================================================

        int age = 20;
        boolean isIndian = true;

        /*
         * Pehli condition:
         *
         * Kya person ki age 18 ya usse zyada hai?
         *
         * Agar YES → doosri condition check karo.
         *
         * Agar NO → directly "Not eligible" print karo.
         */

        if (age >= 18) {

            // First condition TRUE hai.

            /*
             * Ab hum second condition check kar rahe hain.
             *
             * Ye IF, outer IF ke andar hai.
             * Isi wajah se ise NESTED IF kehte hain.
             */

            if (isIndian) {

                // Age >= 18 → TRUE
                // isIndian → TRUE

                System.out.println("Eligible to vote");

            } else {

                // Age >= 18 → TRUE
                // isIndian → FALSE

                System.out.println("Not eligible because not an Indian citizen");

            }

        } else {

            // Age < 18

            System.out.println("Not eligible because age is below 18");
        }


        /*
         * Current values:
         *
         * age = 20
         * isIndian = true
         *
         * Step 1:
         *
         * age >= 18
         * 20 >= 18 → TRUE
         *
         * Step 2:
         *
         * isIndian
         * true → TRUE
         *
         * Therefore:
         *
         * Output:
         *
         * Eligible to vote
         */


        // ============================================================
        // EXAMPLE 2: Student Result
        // ============================================================

        int marks = 75;
        boolean attendance = true;

        /*
         * First check:
         *
         * Marks 40 or above hain?
         *
         * Agar TRUE → attendance check karo.
         *
         * Agar FALSE → Student fail.
         */

        if (marks >= 40) {

            // Student has passed the marks condition.

            if (attendance) {

                // Marks >= 40
                // AND attendance is true

                System.out.println("Student is eligible for exam result");

            } else {

                // Marks >= 40
                // BUT attendance is false

                System.out.println("Student is not eligible due to low attendance");
            }

        } else {

            // Marks are below 40.

            System.out.println("Student is Fail");
        }


        /*
         * Current values:
         *
         * marks = 75
         * attendance = true
         *
         * Step 1:
         *
         * 75 >= 40 → TRUE
         *
         * Step 2:
         *
         * attendance → TRUE
         *
         * Output:
         *
         * Student is eligible for exam result
         */


        // ============================================================
        // EXAMPLE 3: Login System
        // ============================================================

        String username = "admin";
        String password = "12345";

        /*
         * First check username.
         *
         * Agar username correct hai,
         * tab password check hoga.
         */

        if (username.equals("admin")) {

            // Username is correct.

            if (password.equals("12345")) {

                // Password is also correct.

                System.out.println("Login successful");

            } else {

                // Username correct hai
                // but password incorrect hai.

                System.out.println("Incorrect password");
            }

        } else {

            // Username incorrect hai.

            System.out.println("Incorrect username");
        }


        /*
         * Current values:
         *
         * username = "admin"
         * password = "12345"
         *
         * Step 1:
         *
         * username.equals("admin")
         * → TRUE
         *
         * Step 2:
         *
         * password.equals("12345")
         * → TRUE
         *
         * Output:
         *
         * Login successful
         */


        // ============================================================
        // NESTED IF-ELSE KA BASIC STRUCTURE
        // ============================================================

        /*
         *
         * if (condition1) {
         *
         *     if (condition2) {
         *
         *         // condition1 TRUE
         *         // condition2 TRUE
         *
         *     } else {
         *
         *         // condition1 TRUE
         *         // condition2 FALSE
         *
         *     }
         *
         * } else {
         *
         *     // condition1 FALSE
         *
         * }
         *
         */


        // ============================================================
        // IMPORTANT POINTS
        // ============================================================

        /*
         * 1. Nested if ka matlab hai:
         *    ek if ke andar doosra if.
         *
         * 2. Inner if tabhi check hoga jab outer if ki
         *    condition TRUE hogi.
         *
         * 3. Agar outer if FALSE ho gaya,
         *    to inner if execute/check nahi hoga.
         *
         * 4. Nested if ka use multiple dependent conditions
         *    check karne ke liye kiya ja sakta hai.
         *
         * 5. Bahut zyada nested if code ko difficult to read
         *    bana sakta hai.
         *
         */
    }
} 
