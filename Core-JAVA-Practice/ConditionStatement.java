public class ConditionStatement {

    public static void main(String[] args) {

        // int i = 5;

        // selection statements
        // Mormal if
        /*
         * if (i > 5 && i < 10) {
         * System.out.println("i is greater then 5");
         * } else {
         * System.out.println("i is less then or equal to 5");
         * }
         */

        // bytecode -> jvm -> machineCode

        /*
         * 
         * if (i % 2 == 0) {
         * System.out.println("even number");
         * } else {
         * System.out.println("odd number");
         * }
         */

        // Nested ifs

        // if (i > 5) {
        // if (i < 10) {

        // } else {

        // }
        // } else {

        // }

        boolean b = true;
        int i = 9;

        // if-else -if ladder
        if (i == 5) {
            System.out.println("i is 5");
        } else if (i == 6) {
            System.out.println("i is 6");
        } else if (i == 7) {
            System.out.println("i is 7");
        } else if (i == 8) {
            System.out.println("i is 8");
        } else if (i == 9) {
            System.out.println("i is 9");
        }

        int age = 50;
        if (age > 80) {
            System.out.println("You are very old");
        } else if (age > 60) {
            System.out.println("your are semi old");
        } else if (age > 40) {
            System.out.println("your are becoming old");
        } else if (age > 20) {
            System.out.println("you are adults");
        } else {
            System.out.println("you are child");
        }

        // if, if-else, nested-if, if-else-if ladder
    }

}
