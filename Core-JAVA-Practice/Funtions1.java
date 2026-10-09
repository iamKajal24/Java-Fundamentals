public class Funtions1 {
    public static void main(String[] args) {
        // function overloding
        System.out.println(sum(3, 4));
        System.out.println(sum(3, 4, 6));
        System.out.println(sum(9, 10));

        greet(24, "kajal");
        greet("kajal", 18);
    }

    static int sum(int a, int b) {
        return (a + b);
    }

    static int sum(int a, int b, int c) { // different number of parameters
        return (a + b + c);
    }

    static int sum(double a, double b) { // different types of parameter
        return (int) (a + b);
    }

    static void greet(String name, int age) {
        System.out.println("Hi " + name + " your age is " + age);
    }

    static void greet(int age, String name) {
        System.out.println("Hi " + name + " your age is " + age);
    }

}
