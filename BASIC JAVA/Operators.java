public class Operators {

    public static void main(String[] args) {

        /*
         * ============================================================
         *                    JAVA OPERATORS
         * ============================================================
         *
         * Operator  → A symbol that performs an operation.
         * Operand   → The value/variable on which operator works.
         *
         * Example:
         *
         *      3 + 5
         *
         *      3 and 5 → Operands
         *      +       → Operator
         *
         * ============================================================
         */


        // ============================================================
        // 1. ARITHMETIC OPERATORS
        // ============================================================
        /*
         * Arithmetic operators are used to perform mathematical
         * calculations.
         *
         * Operators:
         *
         * +  → Addition
         * -  → Subtraction
         * *  → Multiplication
         * /  → Division
         * %  → Modulus / Remainder
         */

        int num1 = 20;
        int num2 = 6;

        System.out.println(num1 + num2);
        // Addition → 26

        System.out.println(num1 - num2);
        // Subtraction → 14

        System.out.println(num1 * num2);
        // Multiplication → 120

        System.out.println(num1 / num2);
        // Division → 3
        // Because both values are int, decimal part is removed.

        System.out.println(num1 % num2);
        // Modulus → 2
        // 20 ÷ 6 = 3 remainder 2


        /*
         * IMPORTANT:
         *
         * 20 / 6 = 3
         * 20 % 6 = 2
         *
         * '/' gives QUOTIENT
         * '%' gives REMAINDER
         */


        // ============================================================
        // 2. RELATIONAL / COMPARISON OPERATORS
        // ============================================================
        /*
         * Relational operators are used to compare two values.
         *
         * The result is always:
         *
         * true OR false
         *
         * Operators:
         *
         * >   → Greater than
         * <   → Less than
         * >=  → Greater than or equal to
         * <=  → Less than or equal to
         * ==  → Equal to
         * !=  → Not equal to
         */

        int a = 20;
        int b = 10;

        System.out.println(a > b);
        // true
        // 20 is greater than 10

        System.out.println(a < b);
        // false
        // 20 is not less than 10

        System.out.println(a >= b);
        // true
        // 20 is greater than or equal to 10

        System.out.println(a <= b);
        // false
        // 20 is not less than or equal to 10

        System.out.println(a == b);
        // false
        // 20 and 10 are not equal

        System.out.println(a != b);
        // true
        // 20 and 10 are different


        /*
         * IMPORTANT DIFFERENCE:
         *
         * =   → Assignment
         * ==  → Comparison
         *
         * Example:
         *
         * int x = 10;
         *        ↑
         *        Assignment
         *
         * x == 10
         *    ↑
         *    Comparison
         */


        // ============================================================
        // 3. LOGICAL OPERATORS
        // ============================================================
        /*
         * Logical operators are mainly used to combine conditions.
         *
         * Operators:
         *
         * &&  → AND
         * ||  → OR
         * !   → NOT
         */


        // -------------------- AND (&&) --------------------
        /*
         * AND means:
         *
         * BOTH conditions must be true.
         */

        int age = 25;

        System.out.println(age >= 18 && age <= 60);
        // true
        //
        // age >= 18 → true
        // age <= 60 → true
        //
        // true && true → true


        // Example where one condition is false

        int age2 = 70;

        System.out.println(age2 >= 18 && age2 <= 60);
        // false
        //
        // true && false → false


        // -------------------- OR (||) --------------------
        /*
         * OR means:
         *
         * At least ONE condition must be true.
         */

        int age3 = 17;

        System.out.println(age3 < 18 || age3 > 60);
        // true
        //
        // age3 < 18 → true
        // age3 > 60 → false
        //
        // true || false → true


        // -------------------- NOT (!) --------------------
        /*
         * NOT reverses the boolean result.
         *
         * true  → false
         * false → true
         */

        boolean isJavaEasy = true;

        System.out.println(!isJavaEasy);
        // false


        // ============================================================
        // 4. ASSIGNMENT OPERATORS
        // ============================================================
        /*
         * Assignment operators are used to assign/update values.
         *
         * Operators:
         *
         * =    → Assignment
         * +=   → Add and assign
         * -=   → Subtract and assign
         * *=   → Multiply and assign
         * /=   → Divide and assign
         * %=   → Modulus and assign
         */


        // -------------------- = --------------------

        int value = 10;

        // value = 10
        // Assigns 10 to value.


        // -------------------- += --------------------

        value += 5;

        // Same as:
        // value = value + 5;

        System.out.println(value);
        // 15


        // -------------------- -= --------------------

        value -= 3;

        // Same as:
        // value = value - 3;

        System.out.println(value);
        // 12


        // -------------------- *= --------------------

        value *= 2;

        // Same as:
        // value = value * 2;

        System.out.println(value);
        // 24


        // -------------------- /= --------------------

        value /= 4;

        // Same as:
        // value = value / 4;

        System.out.println(value);
        // 6


        // -------------------- %= --------------------

        value %= 4;

        // Same as:
        // value = value % 4;

        System.out.println(value);
        // 2


        // ============================================================
        // 5. UNARY OPERATORS
        // ============================================================
        /*
         * Unary operator works on ONLY ONE operand.
         *
         * Operators:
         *
         * ++  → Increment
         * --  → Decrement
         * +   → Unary plus
         * -   → Unary minus
         * !   → Logical NOT
         */


        // -------------------- Increment (++) --------------------

        int count = 10;

        count++;

        // Same as:
        // count = count + 1;

        System.out.println(count);
        // 11


        // -------------------- Decrement (--) --------------------

        int count2 = 10;

        count2--;

        // Same as:
        // count2 = count2 - 1;

        System.out.println(count2);
        // 9


        // ============================================================
        // 6. PRE-INCREMENT (++a)
        // ============================================================
        /*
         * Pre-increment:
         *
         * ++a
         *
         * FIRST → Increase value
         * THEN  → Use value
         */

        int pre = 10;

        System.out.println(++pre);
        // 11
        //
        // Step 1 → pre becomes 11
        // Step 2 → 11 is printed


        // ============================================================
        // 7. POST-INCREMENT (a++)
        // ============================================================
        /*
         * Post-increment:
         *
         * a++
         *
         * FIRST → Use current value
         * THEN  → Increase value
         */

        int post = 10;

        System.out.println(post++);
        // 10
        //
        // Step 1 → 10 is printed
        // Step 2 → post becomes 11

        System.out.println(post);
        // 11


        /*
         * REMEMBER:
         *
         * ++a → First change, then use
         * a++ → First use, then change
         */


        // ============================================================
        // 8. PRE-DECREMENT (--a)
        // ============================================================

        int preDec = 10;

        System.out.println(--preDec);
        // 9
        //
        // First decrease → 9
        // Then print → 9


        // ============================================================
        // 9. POST-DECREMENT (a--)
        // ============================================================

        int postDec = 10;

        System.out.println(postDec--);
        // 10
        //
        // First print → 10
        // Then decrease → 9

        System.out.println(postDec);
        // 9


        // ============================================================
        // 10. TERNARY OPERATOR
        // ============================================================
        /*
         * Ternary operator is a short form of if-else.
         *
         * Syntax:
         *
         * condition ? value1 : value2;
         *
         * If condition is TRUE  → value1
         * If condition is FALSE → value2
         */


        int personAge = 20;

        String result =
                (personAge >= 18) ? "Eligible" : "Not Eligible";

        System.out.println(result);
        // Eligible


        /*
         * Above code is similar to:
         *
         * if (personAge >= 18) {
         *     result = "Eligible";
         * } else {
         *     result = "Not Eligible";
         * }
         */


        // ============================================================
        // 11. BITWISE OPERATORS
        // ============================================================
        /*
         * Bitwise operators work at the BIT level.
         *
         * Operators:
         *
         * &  → Bitwise AND
         * |  → Bitwise OR
         * ^  → Bitwise XOR
         * ~  → Bitwise NOT
         *
         * These operators work with binary representation.
         */


        int x = 5;
        int y = 3;

        /*
         * Binary representation:
         *
         * 5 = 0101
         * 3 = 0011
         */


        // -------------------- Bitwise AND (&) --------------------

        System.out.println(x & y);
        // 1
        //
        // 0101
        // 0011
        // ----
        // 0001 = 1


        // -------------------- Bitwise OR (|) --------------------

        System.out.println(x | y);
        // 7
        //
        // 0101
        // 0011
        // ----
        // 0111 = 7


        // -------------------- Bitwise XOR (^) --------------------

        System.out.println(x ^ y);
        // 6
        //
        // 0101
        // 0011
        // ----
        // 0110 = 6


        // -------------------- Bitwise NOT (~) --------------------

        System.out.println(~x);
        // -6
        //
        // ~5 = -6
        //
        // This happens because Java uses
        // two's complement representation for signed integers.


        // ============================================================
        // 12. SHIFT OPERATORS
        // ============================================================
        /*
         * Shift operators move bits left or right.
         *
         * Operators:
         *
         * <<  → Left shift
         * >>  → Signed right shift
         * >>> → Unsigned right shift
         */


        int number = 8;

        /*
         * Binary:
         *
         * 8 = 1000
         */


        // -------------------- Left Shift (<<) --------------------

        System.out.println(number << 1);
        // 16
        //
        // Left shift by 1
        // 8 × 2 = 16


        // -------------------- Right Shift (>>) --------------------

        System.out.println(number >> 1);
        // 4
        //
        // Right shift by 1
        // 8 ÷ 2 = 4


        /*
         * For positive numbers:
         *
         * x << 1 → roughly x * 2
         * x >> 1 → roughly x / 2
         *
         * But don't treat this as a universal replacement
         * for multiplication/division, especially with negative
         * numbers and overflow.
         */


        // -------------------- Unsigned Right Shift (>>>) --------------------

        int positiveNumber = 8;

        System.out.println(positiveNumber >>> 1);
        // 4
        //
        // >>> fills the left side with 0 bits.


        // ============================================================
        // 13. instanceof OPERATOR
        // ============================================================
        /*
         * instanceof checks whether an object belongs to
         * a particular class/type.
         *
         * Result:
         *
         * true OR false
         */


        String name = "Kajal";

        System.out.println(name instanceof String);
        // true
        //
        // name is an object of String class.


        // ============================================================
        //                    END OF OPERATORS
        // ============================================================

    }
}