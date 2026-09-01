public class loopexam {

    public static void main(String[] args) {

        /*
         * ============================================================
         *                         LOOPS
         * ============================================================
         *
         * Loop ka use kisi statement/code ko baar-baar execute
         * karne ke liye kiya jata hai.
         *
         * Example:
         *
         * Agar humein 1 se 5 tak numbers print karne hain,
         * to baar-baar System.out.println() likhne ki zarurat nahi hai.
         *
         * Hum loop ka use kar sakte hain.
         *
         * Java mein mainly 3 types ke loops:
         *
         * 1. for loop
         * 2. while loop
         * 3. do-while loop
         *
         * ============================================================
         */


        // ============================================================
        // 1. FOR LOOP
        // ============================================================

        /*
         * for loop tab use karte hain jab humein pata ho ki
         * code ko kitni baar execute karna hai.
         *
         * Syntax:
         *
         * for (initialization; condition; update) {
         *
         *     // code
         * }
         */

        for (int i = 1; i <= 5; i++) {

            // i ki value 1 se start hogi
            // Jab tak i <= 5 hai, loop chalega
            // Har iteration ke baad i++ hoga

            System.out.println(i);
        }

        /*
         * Output:
         *
         * 1
         * 2
         * 3
         * 4
         * 5
         */


        // ============================================================
        // 2. WHILE LOOP
        // ============================================================

        /*
         * while loop mein pehle condition check hoti hai.
         *
         * Agar condition TRUE hai → loop execute hoga.
         *
         * Agar condition FALSE hai → loop execute nahi hoga.
         *
         * Syntax:
         *
         * while (condition) {
         *
         *     // code
         * }
         */

        int j = 1;

        while (j <= 5) {

            // Jab tak j <= 5 hai
            // tab tak loop chalega

            System.out.println(j);

            // j ko increase karna zaroori hai
            // warna loop continuously chalta rahega

            j++;
        }

        /*
         * Output:
         *
         * 1
         * 2
         * 3
         * 4
         * 5
         */


        // ============================================================
        // 3. DO-WHILE LOOP
        // ============================================================

        /*
         * do-while loop mein code PEHLE execute hota hai
         * aur condition BAAD mein check hoti hai.
         *
         * Isliye do-while loop kam se kam ONE TIME
         * zaroor execute hota hai.
         *
         * Syntax:
         *
         * do {
         *
         *     // code
         *
         * } while (condition);
         */

        int k = 1;

        do {

            // Pehle code execute hoga

            System.out.println(k);

            k++;

        } while (k <= 5);

        /*
         * Output:
         *
         * 1
         * 2
         * 3
         * 4
         * 5
         */


        // ============================================================
        // IMPORTANT DIFFERENCE
        // ============================================================

        /*
         * FOR LOOP
         * --------
         * Jab iterations ki number pehle se pata ho.
         *
         * Example:
         * 1 se 10 tak print karna.
         *
         *
         * WHILE LOOP
         * -----------
         * Jab condition ke basis par loop chalana ho
         * aur iterations pehle se fixed na hon.
         *
         *
         * DO-WHILE LOOP
         * --------------
         * Jab code ko kam se kam ek baar execute karna zaroori ho.
         */


        // ============================================================
        // SIMPLE COMPARISON
        // ============================================================

        /*
         *
         * FOR:
         *
         * initialization
         *       ↓
         * condition → FALSE → Stop
         *       ↓ TRUE
         *      code
         *       ↓
         *     update
         *       ↓
         *    condition
         *
         *
         * WHILE:
         *
         * condition → FALSE → Stop
         *       ↓ TRUE
         *      code
         *       ↓
         *    condition
         *
         *
         * DO-WHILE:
         *
         *      code
         *       ↓
         *   condition
         *       ↓
         * TRUE → repeat
         * FALSE → Stop
         *
         */

    }
}
