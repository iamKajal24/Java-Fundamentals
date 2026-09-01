public class ContinueExample {

    public static void main(String[] args) {

        /*
         * ============================================================
         *                       CONTINUE
         * ============================================================
         *
         * continue statement current iteration ko skip karta hai.
         *
         * Loop completely stop nahi hota.
         *
         * Current iteration skip hone ke baad
         * next iteration start hoti hai.
         * ============================================================
         */

        for (int i = 1; i <= 5; i++) {

            // Jab i ki value 3 hogi,
            // current iteration skip ho jayegi.

            if (i == 3) {
                continue;
            }

            System.out.println(i);
        }

        /*
         * Output:
         *
         * 1
         * 2
         * 4
         * 5
         *
         * 3 ko skip kar diya gaya.
         *
         * Lekin loop completely stop nahi hua.
         * 3 ke baad 4 aur 5 bhi execute hue.
         */
    }
}