public class Switchexam {

    public static void main(String[] args) {

        /*
         * ============================================================
         *                     SWITCH STATEMENT
         * ============================================================
         *
         * switch ka use tab hota hai jab humein ek variable ki
         * value ko multiple possible values ke saath compare karna ho.
         *
         * Example:
         * 1 → Monday
         * 2 → Tuesday
         * 3 → Wednesday
         *
         * ============================================================
         */


        int day = 2;

        switch (day) {

            case 1:
                // Agar day ki value 1 hai
                System.out.println("Monday");
                break;

            case 2:
                // Agar day ki value 2 hai
                System.out.println("Tuesday");
                break;

            case 3:
                // Agar day ki value 3 hai
                System.out.println("Wednesday");
                break;

            default:
                // Agar koi bhi case match nahi hota
                System.out.println("Invalid day");
        }


        /*
         * Current value:
         *
         * day = 2
         *
         * switch day ki value check karega.
         *
         * case 1 → 2 == 1 → false
         *
         * case 2 → 2 == 2 → true
         *
         * Isliye:
         *
         * Output:
         * Tuesday
         *
         * break ki wajah se switch yahin stop ho jayega.
         */
    }
}