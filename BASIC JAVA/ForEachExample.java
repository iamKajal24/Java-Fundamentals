public class ForEachExample {

    public static void main(String[] args) {

        /*
         * ============================================================
         *                    FOR-EACH LOOP
         * ============================================================
         *
         * For-each loop ka use array ya collection ke
         * elements ko one-by-one access karne ke liye hota hai.
         *
         * Syntax:
         *
         * for (dataType variable : array) {
         *
         *     // code
         *
         * }
         *
         * ============================================================
         */


        // Create an integer array
        int[] numbers = {10, 20, 30, 40, 50};


        // For-each loop
        for (int number : numbers) {

            // Har iteration mein array ka ek element
            // 'number' variable mein store hoga.

            System.out.println(number);
        }


        /*
         * Output:
         *
         * 10
         * 20
         * 30
         * 40
         * 50
         *
         *
         * Working:
         *
         * First iteration → number = 10
         * Second iteration → number = 20
         * Third iteration → number = 30
         * Fourth iteration → number = 40
         * Fifth iteration → number = 50
         *
         */
    }
}