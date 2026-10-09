package strings;

public class StringDemo {

    public static void main(String[] args) {
        // complie time
        String s1 = "hello";// Litral
        String s2 = "hello";
        System.out.println(s1 == s2); // true

        // runtime
        String s3 = new String("Kajal"); // using new operator
        String s4 = new String("Kajal");

        System.out.println(s3 == s4); // false

        String s5 = "Hello";
        String s6 = s5;
        System.out.println(s5 == s6);// true

        String s7 = "ja" + "va";
        String s8 = "java";
        System.out.println(s7 == s8);// true

        String s9 = "hello";
        String s10 = s9 + "world";
        String s11 = "hello wrold";
        System.out.println(s10 == s11); // false

        String s12 = "hello";
        s12 = "world";
        System.out.println(s12);// world
    }

}
