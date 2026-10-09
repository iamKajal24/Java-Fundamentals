public class Funtions {

    public static void main(String[] args) {

        // function in java
        greet();
        sayHello("kajal");
        System.out.println(getNumber());
        System.out.println(multiply(6, 2));

    }

    // no Ip, no o/p
    static void greet() {
        System.out.println("hello");
        // return ;
    }

    // Ip, no o/p
    static void sayHello(String name) { // number of parameter cann be anything
        System.out.println("hello " + name);
    }

    // no ip, op
    static int getNumber() {
        return 10;
    }

    // ip, op
    static int multiply(int a, int b) {
        return (a * b);
    }
}
