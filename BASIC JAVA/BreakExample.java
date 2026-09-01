public class BreakExample {

    public static void main(String[] args) {

        /*
         * ============================================================
         *                         BREAK
         * ============================================================
         *
         * break statement ka use loop ko completely stop karne ke liye
         * kiya jata hai.
         *
         * Jaise hi break execute hota hai,
         * loop turant terminate ho jata hai.
         * ============================================================
         */

        for (int i = 1; i <= 10; i++) {

            System.out.println(i);

            // Jab i ki value 5 hogi,
            // break loop ko completely stop kar dega.

            if (i == 5) {
                break;
            }
        }

        /*
         * Output:
         *
         * 1
         * 2
         * 3
         * 4
         * 5
         *
         * 5 ke baad loop completely stop ho gaya.
         */
    }
}